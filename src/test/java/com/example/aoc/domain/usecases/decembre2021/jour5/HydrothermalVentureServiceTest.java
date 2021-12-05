package com.example.aoc.domain.usecases.decembre2021.jour5;

import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;
import com.example.aoc.domain.entities.decembre2021.jour4.DamierStatut;
import com.example.aoc.domain.entities.decembre2021.jour4.Grille;
import com.example.aoc.domain.entities.decembre2021.jour5.Coordonnee;
import com.example.aoc.domain.entities.decembre2021.jour5.HydrothermalVenture;
import com.example.aoc.domain.entities.decembre2021.jour5.Line;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class HydrothermalVentureServiceTest {

    @Test
    void executer_devrait_renvoyer_5_avec_les_ligne_exemple() {
        // Given
        HydrothermalVenturePersistancePortStub hydrothermalVenturePersistancePortStub = new HydrothermalVenturePersistancePortStub(initialiserHydrothermalVenture());
        HydrothermalVentureExercice1 hydrothermalVentureExercice1 = new HydrothermalVentureExercice1(hydrothermalVenturePersistancePortStub);

        // When
        int score = hydrothermalVentureExercice1.calculerScore();

        // Then
        assertThat(score).isEqualTo(5);
    }

    @Test
    void executer_devrait_renvoyer_12_avec_les_ligne_exemple() {
        // Given
        HydrothermalVenturePersistancePortStub hydrothermalVenturePersistancePortStub = new HydrothermalVenturePersistancePortStub(initialiserHydrothermalVenture());
        HydrothermalVentureExercice2 hydrothermalVentureExercice2 = new HydrothermalVentureExercice2(hydrothermalVenturePersistancePortStub);

        // When
        int score = hydrothermalVentureExercice2.calculerScore();

        // Then
        assertThat(score).isEqualTo(12);
    }



    HydrothermalVenture initialiserHydrothermalVenture() {
        HydrothermalVenture hydrothermalVenture = new HydrothermalVenture();

        List<Line> lignes = new ArrayList<>();
        Coordonnee startCoordonne1 = new Coordonnee();
        startCoordonne1.setAbscisse(0);
        startCoordonne1.setOrdonne(9);
        Coordonnee endCoordonne1 = new Coordonnee();
        endCoordonne1.setAbscisse(5);
        endCoordonne1.setOrdonne(9);
        Line ligne1 = new Line();
        ligne1.setStart(startCoordonne1);
        ligne1.setEnd(endCoordonne1);
        lignes.add(ligne1);

        Coordonnee startCoordonne2 = new Coordonnee();
        startCoordonne2.setAbscisse(8);
        startCoordonne2.setOrdonne(0);
        Coordonnee endCoordonne2 = new Coordonnee();
        endCoordonne2.setAbscisse(0);
        endCoordonne2.setOrdonne(8);
        Line ligne2 = new Line();
        ligne2.setStart(startCoordonne2);
        ligne2.setEnd(endCoordonne2);
        lignes.add(ligne2);

        Coordonnee startCoordonne3 = new Coordonnee();
        startCoordonne3.setAbscisse(9);
        startCoordonne3.setOrdonne(4);
        Coordonnee endCoordonne3 = new Coordonnee();
        endCoordonne3.setAbscisse(3);
        endCoordonne3.setOrdonne(4);
        Line ligne3 = new Line();
        ligne3.setStart(startCoordonne3);
        ligne3.setEnd(endCoordonne3);
        lignes.add(ligne3);

        Coordonnee startCoordonne4 = new Coordonnee();
        startCoordonne4.setAbscisse(2);
        startCoordonne4.setOrdonne(2);
        Coordonnee endCoordonne4 = new Coordonnee();
        endCoordonne4.setAbscisse(2);
        endCoordonne4.setOrdonne(1);
        Line ligne4 = new Line();
        ligne4.setStart(startCoordonne4);
        ligne4.setEnd(endCoordonne4);
        lignes.add(ligne4);

        Coordonnee startCoordonne5 = new Coordonnee();
        startCoordonne5.setAbscisse(7);
        startCoordonne5.setOrdonne(0);
        Coordonnee endCoordonne5 = new Coordonnee();
        endCoordonne5.setAbscisse(7);
        endCoordonne5.setOrdonne(4);
        Line ligne5 = new Line();
        ligne5.setStart(startCoordonne5);
        ligne5.setEnd(endCoordonne5);
        lignes.add(ligne5);

        Coordonnee startCoordonne6 = new Coordonnee();
        startCoordonne6.setAbscisse(6);
        startCoordonne6.setOrdonne(4);
        Coordonnee endCoordonne6 = new Coordonnee();
        endCoordonne6.setAbscisse(2);
        endCoordonne6.setOrdonne(0);
        Line ligne6 = new Line();
        ligne6.setStart(startCoordonne6);
        ligne6.setEnd(endCoordonne6);
        lignes.add(ligne6);

        Coordonnee startCoordonne7 = new Coordonnee();
        startCoordonne7.setAbscisse(0);
        startCoordonne7.setOrdonne(9);
        Coordonnee endCoordonne7 = new Coordonnee();
        endCoordonne7.setAbscisse(2);
        endCoordonne7.setOrdonne(9);
        Line ligne7 = new Line();
        ligne7.setStart(startCoordonne7);
        ligne7.setEnd(endCoordonne7);
        lignes.add(ligne7);

        Coordonnee startCoordonne8 = new Coordonnee();
        startCoordonne8.setAbscisse(3);
        startCoordonne8.setOrdonne(4);
        Coordonnee endCoordonne8 = new Coordonnee();
        endCoordonne8.setAbscisse(1);
        endCoordonne8.setOrdonne(4);
        Line ligne8 = new Line();
        ligne8.setStart(startCoordonne8);
        ligne8.setEnd(endCoordonne8);
        lignes.add(ligne8);

        Coordonnee startCoordonne9 = new Coordonnee();
        startCoordonne9.setAbscisse(0);
        startCoordonne9.setOrdonne(0);
        Coordonnee endCoordonne9 = new Coordonnee();
        endCoordonne9.setAbscisse(8);
        endCoordonne9.setOrdonne(8);
        Line ligne9 = new Line();
        ligne9.setStart(startCoordonne9);
        ligne9.setEnd(endCoordonne9);
        lignes.add(ligne9);

        Coordonnee startCoordonne10 = new Coordonnee();
        startCoordonne10.setAbscisse(5);
        startCoordonne10.setOrdonne(5);
        Coordonnee endCoordonne10 = new Coordonnee();
        endCoordonne10.setAbscisse(8);
        endCoordonne10.setOrdonne(2);
        Line ligne10 = new Line();
        ligne10.setStart(startCoordonne10);
        ligne10.setEnd(endCoordonne10);
        lignes.add(ligne10);

        hydrothermalVenture.setLines(lignes);
        hydrothermalVenture.setLongueurField(9);
        hydrothermalVenture.setLargeurField(9);

        Integer[][] field = new Integer[hydrothermalVenture.getLargeurField()+1][hydrothermalVenture.getLongueurField()+1];

        for(int i = 0; i <= hydrothermalVenture.getLargeurField(); i++) {
            for(int j = 0; j <= hydrothermalVenture.getLongueurField(); j++) {
                field[i][j] = 0;
            }
        }
        hydrothermalVenture.setField(field);

        return hydrothermalVenture;
    }

}
