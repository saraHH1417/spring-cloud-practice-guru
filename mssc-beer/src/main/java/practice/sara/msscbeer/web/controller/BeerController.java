package practice.sara.msscbeer.web.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import practice.sara.msscbeer.web.model.BeerDto;

import java.util.UUID;

@Validated
@RequestMapping("/api/v1/beer/")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@NotNull @PathVariable("beerId") UUID beerId) {
        // TODO: Implementation
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Valid @NotNull @RequestBody BeerDto beerDto) {
        // TODO: impl
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@NotNull @PathVariable("beerId") UUID beerID,
                                         @Valid @NotNull@RequestBody BeerDto beerDto) {
        // TODO: impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity deleteBeerById(@NotNull UUID randomId) {
        // TODO: impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
