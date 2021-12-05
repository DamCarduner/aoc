package com.example.aoc.domain.usecases.decembre2021.jour5;

import com.example.aoc.domain.entities.decembre2021.jour5.HydrothermalVenture;
import com.example.aoc.domain.usecases.decembre2021.jour5.HydrothermalVenturePersistancePort;

public class HydrothermalVenturePersistancePortStub implements HydrothermalVenturePersistancePort {

    private final HydrothermalVenture hydrothermalVenture;

    public HydrothermalVenturePersistancePortStub() {
        hydrothermalVenture = new HydrothermalVenture();
    }

    public HydrothermalVenturePersistancePortStub(HydrothermalVenture hydrothermalVenture) {
        this.hydrothermalVenture = hydrothermalVenture;
    }

    @Override
    public HydrothermalVenture recupererHydrothermalVenture() {
        return hydrothermalVenture;
    }


}
