package ci.sealog.transit.helper.transformer;

import java.text.ParseException;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import ci.sealog.transit.dao.entity.Societe;
import ci.sealog.transit.helper.dto.SocieteDto;

@Mapper
public interface SocieteTransformer {

	SocieteTransformer INSTANCE = Mappers.getMapper(SocieteTransformer.class);
	
	@Mappings({
		
		
		@Mapping(source="entity.codeSociete", target="codeSociete"),
		@Mapping(source="entity.nomSociete", target="nomSociete"),
		@Mapping(source="entity.adresseGeo", target="adresseGeo"),
		@Mapping(source="entity.telephone", target="telephone"),
		@Mapping(source="entity.email", target="email"),
		@Mapping(source="entity.responsable", target="responsable"),
		@Mapping(source="entity.contactResponsable", target="contactResponsable")
		
	})
	
	SocieteDto toDto(Societe entity) throws ParseException;
	List<SocieteDto> toDtos(List<Societe> entities) throws ParseException;
	
	
	
	@Mappings({
		
		@Mapping(source="dto.codeSociete", target="codeSociete"),
		@Mapping(source="dto.nomSociete", target="nomSociete"),
		@Mapping(source="dto.adresseGeo", target="adresseGeo"),
		@Mapping(source="dto.telephone", target="telephone"),
		@Mapping(source="dto.email", target="email"),
		@Mapping(source="dto.responsable", target="responsable"),
		@Mapping(source="dto.contactResponsable", target="contactResponsable")
	})
	
	Societe   toEntity(SocieteDto dto) throws ParseException;
	
}
