package controllers;

import dto.DnaRequest;
import dto.DnaResponse;
import org.springframework.web.bind.annotation.*;
import services.DnaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/mutant")
public class DnaController {

    private final DnaService DnaService;

    // Constructor que inyecta el DnaService

    public DnaController(DnaService DnaService){
        this.DnaService = DnaService;
    }

    @PostMapping // Mapea las solicitudes POST a este metodo
    public ResponseEntity<DnaResponse> checkMutant(@Validated @RequestBody DnaRequest dnaRequest) throws Exception {

        // Llama al servicio DnaService para analizar si la secuencia de ADN es mutante
        boolean isMutant = DnaService.analyzeDna(dnaRequest.getDna());

        // Crea un objeto DnaResponse que contendrá el resultado del análisis
        DnaResponse dnaResponse = new DnaResponse(isMutant);

        // Si el ADN es mutante, devuelve una respuesta HTTP 200 (OK)
        if(isMutant){
            return ResponseEntity.ok(dnaResponse);
        } else {
            // Si no es mutante, devuelve una respuesta HTTP 403 (FORBIDDEN)
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(dnaResponse);
        }
    }
}