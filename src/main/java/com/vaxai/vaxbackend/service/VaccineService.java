package com.vaxai.vaxbackend.service;

import com.vaxai.vaxbackend.model.VaccineRequest;
import com.vaxai.vaxbackend.model.VaccineResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VaccineService {

    public VaccineResponse getSuggestions(VaccineRequest request) {
        List<String> suggestions = new ArrayList<>();

        if (request.getAge() < 18) {
            suggestions.add("Hepatitis B");
        } else {
            suggestions.add("Tetanus");
        }

        if (request.isAnimalBite()) {
            suggestions.add("Rabies Vaccine");
        }

        if (request.isTravellingAbroad() &&
            request.getDestinationCountry() != null &&
            request.getDestinationCountry().equalsIgnoreCase("Africa")) {
            suggestions.add("Yellow Fever");
        }

        return new VaccineResponse(suggestions);
    }
}
