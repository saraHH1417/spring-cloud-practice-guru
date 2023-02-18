package practice.sara.msscbeer.web.mappers;

import org.mapstruct.Mapper;
import practice.sara.msscbeer.domain.Beer;
import practice.sara.msscbeer.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public  interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
