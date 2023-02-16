package practice.sara.msscbrew.services;

import org.springframework.stereotype.Service;
import practice.sara.msscbrew.web.model.BeerDto;

import java.util.UUID;


public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
