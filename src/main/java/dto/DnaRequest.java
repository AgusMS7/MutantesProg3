package dto;

import lombok.Getter;
import lombok.Setter;
import validators.ValidDna;

@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}