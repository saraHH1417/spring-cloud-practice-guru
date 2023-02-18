package practice.sara.msscbrew.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // creates getters and setters and also equals and hash code methodes
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    @Null
    private UUID id;
    @NotBlank
    @Size(min = 3, max =100)
    private String name;



}
