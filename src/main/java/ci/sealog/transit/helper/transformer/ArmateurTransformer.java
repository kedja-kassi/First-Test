package ci.sealog.transit.helper.transformer;

import java.text.ParseException;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import ci.sealog.transit.dao.entity.Armateur;
import ci.sealog.transit.helper.dto.ArmateurDto;
import net.bytebuddy.agent.builder.AgentBuilder.TransformerDecorator;

@Mapper
public interface ArmateurTransformer {

	
	ArmateurTransformer INSTANCE = Mappers.getMapper(ArmateurTransformer.class);
	
	
	@Mappings({
		
		
		@Mapping(source="entity.idArmateur", target="idArmateur"),
		@Mapping(source="entity.codeArmateur", target="codeArmateur"),
		@Mapping(source="entity.libelle", target="libelle"),
		@Mapping(source="entity.contact", target="contact"),
		@Mapping(source="entity.adresse1", target="adresse1"),
		@Mapping(source="entity.adresse2", target="adresse2"),
		@Mapping(source="entity.telephone", target="telephone"),
		@Mapping(source="entity.fax", target="fax"),
		@Mapping(source="entity.eMail", target="eMail")
		
	})
	
	ArmateurDto toDto(Armateur entity) throws ParseException;
	List<ArmateurDto> toDtos(List<Armateur> entities) throws ParseException;
	
	
	@Mappings({
		
		@Mapping(source="dto.idArmateur", target="idArmateur"),
		@Mapping(source="dto.codeArmateur", target="codeArmateur"),
		@Mapping(source="dto.libelle", target="libelle"),
		@Mapping(source="dto.contact", target="contact"),
		@Mapping(source="dto.adresse1", target="adresse1"),
		@Mapping(source="dto.adresse2", target="adresse2"),
		@Mapping(source="dto.telephone", target="telephone"),
		@Mapping(source="dto.fax", target="fax"),
		@Mapping(source="dto.eMail", target="eMail")
		
	})
	
	Armateur  toEntity(ArmateurDto dto );
	
	
	
	
	
}
