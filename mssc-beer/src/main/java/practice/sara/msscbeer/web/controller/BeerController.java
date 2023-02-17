package practice.sara.msscbeer.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.sara.msscbeer.web.model.BeerDto;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        // TODO: Implementation
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(BeerDto beerDto) {
        // TODO: impl
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerID,
                                         @RequestBody BeerDto beerDto) {
        // TODO: impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}
