package practice.sara.msscbrew.mappers;

import org.mapstruct.Mapper;
import practice.sara.msscbrew.domain.Beer;
import practice.sara.msscbrew.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);


}
