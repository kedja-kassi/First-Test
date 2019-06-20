package ci.sealog.transit.helper.transformer;

import java.text.ParseException;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import ci.sealog.transit.dao.entity.Armateur;
import ci.sealog.transit.dao.entity.Navire;
import ci.sealog.transit.dao.entity.Port;
import ci.sealog.transit.helper.dto.NavireDto;


@Mapper

public interface NavireTransformer {
	
	NavireTransformer INSTANCE = Mappers.getMapper(NavireTransformer.class);
	
	
	@Mappings({
		
		@Mapping(source="entity.idNavire", target="idNavire"),
		@Mapping(source="entity.codeNavire", target="codeNavire"),
		@Mapping(source="entity.libelleNavire", target="libelleNavire"),
		@Mapping(source="entity.armateur", target="armateur"),
		@Mapping(source="entity.portArr", target="portArr"),
		@Mapping(source="entity.portDep", target="portDep"),
		
	})
	
	NavireDto toDto(Navire entity) throws ParseException;
	List<NavireDto> toDtos(List<Navire> entities) throws ParseException;
	
	
		@Mappings({
			
			@Mapping(source="dto.idNavire", target="idNavire"),
			@Mapping(source="dto.codeNavire", target="codeNavire"),
			@Mapping(source="dto.libelleNavire", target="libelleNavire"),
			@Mapping(source="dto.armateur", target="armateur"),
			@Mapping(source="dto.portArr", target="portArr"),
			@Mapping(source="dto.portDep", target="portDep"),
			
		})
		
	Navire toEntity(NavireDto dto , Armateur armateur , Port port);
			
}
