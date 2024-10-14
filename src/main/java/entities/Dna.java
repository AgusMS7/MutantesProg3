package entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "REGISTRO_ADN")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Dna implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private Long id;

    @Column(name = "ADN")
    private String dna;

    @Column(name = "ES MUTANTE")
    private boolean isMutant;
}
