package ci.sealog.transit.helper.transformer;

import java.text.ParseException;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import ci.sealog.transit.dao.entity.Port;
import ci.sealog.transit.dao.entity.Societe;
import ci.sealog.transit.helper.dto.PortDto;
import net.bytebuddy.agent.builder.AgentBuilder.TransformerDecorator;

@Mapper
public interface PortTransformer {

	
	PortTransformer INSTANCE = Mappers.getMapper(PortTransformer.class);
	
	@Mappings({
		
		@Mapping(source="entity.idPort" , target="idPort"),
		@Mapping(source="entity.codePort", target="codePort"),
		@Mapping(source="entity.libellePort", target="libellePort"),
		@Mapping(source="entity.societe", target="societe")
		
	})
	
	 PortDto toDto(Port entity) throws ParseException;
	 List<PortDto> toDtos(List<Port> entities) throws ParseException;
	
	@Mappings({
		
		@Mapping(source="dto.idPort", target="idPort"),
		@Mapping(source="dto.codePort", target="codePort"),
		@Mapping(source="dto.libellePort", target="libellePort"),
		@Mapping(source="dto.societe", target="societe")
		
	})
	
	Port toEntity(PortDto dto , Societe societe) throws ParseException;
	
	
}
