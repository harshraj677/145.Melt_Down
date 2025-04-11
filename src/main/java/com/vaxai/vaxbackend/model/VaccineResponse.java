package com.vaxai.vaxbackend.model;

import java.util.List;

public class VaccineResponse {
    private List<String> suggestedVaccines;

    public VaccineResponse(List<String> suggestedVaccines) {
        this.suggestedVaccines = suggestedVaccines;
    }

    public List<String> getSuggestedVaccines() {
        return suggestedVaccines;
    }

    public void setSuggestedVaccines(List<String> suggestedVaccines) {
        this.suggestedVaccines = suggestedVaccines;
    }
}
