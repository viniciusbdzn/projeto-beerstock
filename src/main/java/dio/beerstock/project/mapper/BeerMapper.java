package dio.beerstock.project.mapper;

import dio.beerstock.project.dto.BeerDTO;
import dio.beerstock.project.entity.Beer;
import org.mapstruct.Mapper;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
