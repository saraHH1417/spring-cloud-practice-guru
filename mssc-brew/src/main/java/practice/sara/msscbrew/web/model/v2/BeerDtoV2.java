package practice.sara.msscbrew.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyleEnum;
    private Long upc;
}
