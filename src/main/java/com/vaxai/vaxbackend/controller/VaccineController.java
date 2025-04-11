package com.vaxai.vaxbackend.controller;

import com.vaxai.vaxbackend.model.VaccineRequest;
import com.vaxai.vaxbackend.model.VaccineResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {

    @PostMapping("/check")
    public VaccineResponse getSuggestions(@RequestBody VaccineRequest request) {
        List<String> vaccines = new ArrayList<>();

        // Age-based vaccines
        int age = request.getAge();
        if (age < 5) {
            vaccines.add("Polio");
            vaccines.add("MMR");
        } else if (age >= 18 && age < 60) {
            vaccines.add("Covid-19 Booster");
            vaccines.add("Hepatitis B");
        } else if (age >= 60) {
            vaccines.add("Flu Shot");
            vaccines.add("Pneumococcal Vaccine");
        }

        // Animal bite case
        if (request.isAnimalBite()) {
            vaccines.add("Rabies Vaccine");
        }

        // Travel-related vaccines
        if (request.isTravellingAbroad() && request.getDestinationCountry() != null) {
            String country = request.getDestinationCountry().toLowerCase();
            if (country.contains("africa")) {
                vaccines.add("Yellow Fever Vaccine");
            } else if (country.contains("usa")) {
                vaccines.add("MMR (Booster)");
            } else {
                vaccines.add("Consult travel guidelines for " + request.getDestinationCountry());
            }
        }

        return new VaccineResponse(vaccines);
    }
}
