package practice.sara.msscbrew.services;

import org.springframework.stereotype.Service;
import practice.sara.msscbrew.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
