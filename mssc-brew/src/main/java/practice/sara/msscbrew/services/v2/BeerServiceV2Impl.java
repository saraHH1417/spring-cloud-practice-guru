package practice.sara.msscbrew.services.v2;

import org.springframework.stereotype.Service;
import practice.sara.msscbrew.web.model.BeerDto;
import practice.sara.msscbrew.web.model.v2.BeerDtoV2;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        // TODO
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDto beerDtoV2) {
        // TODO
        return null;
    }

    @Override
    public void update(UUID uuid, BeerDtoV2 beerDtoV2) {
        // TODO
    }

    @Override
    public void deleteById(UUID beerId) {
        // TODO
    }
}
