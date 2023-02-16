package practice.sara.msscbrew.services.v2;

import practice.sara.msscbrew.web.model.BeerDto;
import practice.sara.msscbrew.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDto beerDtoV2);

    void update(UUID uuid, BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerId);
}
