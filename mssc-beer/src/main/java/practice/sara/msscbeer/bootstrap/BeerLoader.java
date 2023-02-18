package practice.sara.msscbeer.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import practice.sara.msscbeer.domain.Beer;
import practice.sara.msscbeer.repositories.BeerRepository;
import practice.sara.msscbeer.web.model.BeerDto;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("JPA")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(3370L)
                            .price(new BigDecimal("12.98"))
                            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(340)
                    .minOnHand(23)
                    .upc(56789940L)
                    .price(new BigDecimal("20.98"))
                    .build());

            System.out.println("Loaded Beers: " + beerRepository.count());
        }
    }
}
