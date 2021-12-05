package com.example.aoc.application.decembre2021.jour4;

import com.example.aoc.domain.usecases.decembre2021.jour4.BingoExercice1;
import com.example.aoc.domain.usecases.decembre2021.jour4.BingoExercice2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BingoTaskTest {

    @Autowired
    BingoExercice1 bingoExercice1;

    @Autowired
    BingoExercice2 bingoExercice2;

    @Test
    void executer_exercice1() {
        int resulat = bingoExercice1.calculerScore();
        assertThat(resulat).isEqualTo(6592);
    }

    @Test
    void executer_exercice2() {
        int resulat = bingoExercice2.calculerScore();
        assertThat(resulat).isEqualTo(31755);
    }
}
