package com.example.aoc.application.decembre2021.jour5;

import com.example.aoc.domain.usecases.decembre2021.jour5.HydrothermalVentureExercice1;
import com.example.aoc.domain.usecases.decembre2021.jour5.HydrothermalVentureExercice2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HydrothermalVenturTaskTest {

    @Autowired
    HydrothermalVentureExercice1 hydrothermalVentureExercice1;

    @Autowired
    HydrothermalVentureExercice2 hydrothermalVentureExercice2;

    @Test
    void executer_exercice1() {
        int resulat = hydrothermalVentureExercice1.calculerScore();
        assertThat(resulat).isEqualTo(5373);
    }

    @Test
    void executer_exercice2() {
        int resulat = hydrothermalVentureExercice2.calculerScore();
        assertThat(resulat).isEqualTo(21514);
    }
}
