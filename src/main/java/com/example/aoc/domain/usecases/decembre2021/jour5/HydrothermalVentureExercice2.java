package com.example.aoc.domain.usecases.decembre2021.jour5;

import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;
import com.example.aoc.domain.entities.decembre2021.jour4.DamierStatut;
import com.example.aoc.domain.entities.decembre2021.jour5.HydrothermalVenture;
import com.example.aoc.domain.entities.decembre2021.jour5.Line;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class HydrothermalVentureExercice2 extends HydrothermalVentureService {

    private final HydrothermalVenturePersistancePort hydrothermalVenturePersistancePort;

    /**
     *
     * @return le score calculé
     */
    @Override
    public int calculerScore() {
        HydrothermalVenture hydrothermalVenture = hydrothermalVenturePersistancePort.recupererHydrothermalVenture();

        for(Line line : hydrothermalVenture.getLines()) {
            if(isVerticalLigne(line)) {
                ajoutVerticalFieldValue(hydrothermalVenture.getField(), line);
            }
            if(isHorizontalLigne(line)) {
                ajoutHorizontalFieldValue(hydrothermalVenture.getField(), line);
            }

            if(isDiagonalLigne(line)) {
                ajoutDiagonalFieldValue(hydrothermalVenture.getField(), line);
            }
        }

        return calculerScoreField(hydrothermalVenture.getField(), hydrothermalVenture.getLargeurField(), hydrothermalVenture.getLongueurField());


    }

}
