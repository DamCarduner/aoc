package com.example.aoc.domain.usecases.decembre2021.jour4;

import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;
import com.example.aoc.domain.entities.decembre2021.jour4.DamierStatut;
import com.example.aoc.domain.entities.decembre2021.jour4.Grille;
import com.example.aoc.domain.usecases.decembre2021.jour5.HydrothermalVenturePersistancePortStub;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class BingoServiceTest {

    @Test
    void executer_devrait_renvoyer_4512_avec_le_tirage_exemple() {
        // Given
        BingoPersistancePortStub bingoPersistancePortStub = new BingoPersistancePortStub(initialiserBingo());
        BingoExercice1 bingoExercice1 = new BingoExercice1(bingoPersistancePortStub);

        // When
        int score = bingoExercice1.calculerScore();

        // Then
        assertThat(score).isEqualTo(4512);
    }

    @Test
    void executer_devrait_renvoyer_1924_avec_le_tirage_exemple() {
        // Given
        BingoPersistancePortStub bingoPersistancePortStub = new BingoPersistancePortStub(initialiserBingo());
        BingoExercice2 bingoExercice2 = new BingoExercice2(bingoPersistancePortStub);

        // When
        int score = bingoExercice2.calculerScore();

        // Then
        assertThat(score).isEqualTo(1924);
    }



    Bingo initialiserBingo() {
        Bingo bingo = new Bingo();

        bingo.setValeurs(List.of(7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1));

        Map<Integer, Grille> grilles = new HashMap<>();

        Integer[][] damier1 = new Integer[5][5];
        damier1[0][0] = 22;
        damier1[0][1] = 13;
        damier1[0][2] = 17;
        damier1[0][3] = 11;
        damier1[0][4] = 0;
        damier1[1][0] = 8;
        damier1[1][1] = 2;
        damier1[1][2] = 23;
        damier1[1][3] = 4;
        damier1[1][4] = 24;
        damier1[2][0] = 21;
        damier1[2][1] = 9;
        damier1[2][2] = 14;
        damier1[2][3] = 16;
        damier1[2][4] = 7;
        damier1[3][0] = 6;
        damier1[3][1] = 10;
        damier1[3][2] = 3;
        damier1[3][3] = 18;
        damier1[3][4] = 5;
        damier1[4][0] = 1;
        damier1[4][1] = 12;
        damier1[4][2] = 20;
        damier1[4][3] = 15;
        damier1[4][4] = 19;

        Grille grille1 = new Grille();
        grille1.setDamier(damier1);
        grille1.setStatus(DamierStatut.IN_PROGRESS);

        Integer[][] damier2 = new Integer[5][5];
        damier2[0][0] = 3;
        damier2[0][1] = 15;
        damier2[0][2] = 0;
        damier2[0][3] = 2;
        damier2[0][4] = 22;
        damier2[1][0] = 9;
        damier2[1][1] = 18;
        damier2[1][2] = 13;
        damier2[1][3] = 17;
        damier2[1][4] = 5;
        damier2[2][0] = 19;
        damier2[2][1] = 8;
        damier2[2][2] = 7;
        damier2[2][3] = 25;
        damier2[2][4] = 23;
        damier2[3][0] = 20;
        damier2[3][1] = 11;
        damier2[3][2] = 10;
        damier2[3][3] = 24;
        damier2[3][4] = 4;
        damier2[4][0] = 14;
        damier2[4][1] = 21;
        damier2[4][2] = 16;
        damier2[4][3] = 12;
        damier2[4][4] = 6;

        Grille grille2 = new Grille();
        grille2.setDamier(damier2);
        grille2.setStatus(DamierStatut.IN_PROGRESS);

        Integer[][] damier3 = new Integer[5][5];
        damier3[0][0] = 14;
        damier3[0][1] = 21;
        damier3[0][2] = 17;
        damier3[0][3] = 24;
        damier3[0][4] = 4;
        damier3[1][0] = 10;
        damier3[1][1] = 16;
        damier3[1][2] = 15;
        damier3[1][3] = 9;
        damier3[1][4] = 19;
        damier3[2][0] = 18;
        damier3[2][1] = 8;
        damier3[2][2] = 23;
        damier3[2][3] = 26;
        damier3[2][4] = 20;
        damier3[3][0] = 22;
        damier3[3][1] = 11;
        damier3[3][2] = 13;
        damier3[3][3] = 6;
        damier3[3][4] = 5;
        damier3[4][0] = 2;
        damier3[4][1] = 0;
        damier3[4][2] = 12;
        damier3[4][3] = 3;
        damier3[4][4] = 7;
        Grille grille3 = new Grille();
        grille3.setDamier(damier3);
        grille3.setStatus(DamierStatut.IN_PROGRESS);

        grilles.put(0, grille1);
        grilles.put(1, grille2);
        grilles.put(2, grille3);

        bingo.setGrilles(grilles);

        return bingo;
    }

}
