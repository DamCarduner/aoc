package com.example.aoc.domain.usecases.decembre2021.jour4;

import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BingoExercice1 extends BingoService {

    private final BingoPersistancePort bingoPersistancePort;

    /**
     *
     * @return le score calculé
     */
    @Override
    public int calculerScore() {

        Bingo bingo = bingoPersistancePort.recupererBingo();

        Integer valeur;
        Integer[][] damier;

        for(int valeurIndice = 0; valeurIndice < bingo.getValeurs().size(); valeurIndice++) {
            valeur = bingo.getValeurs().get(valeurIndice);

            for(int grilleIndice = 0; grilleIndice < bingo.getGrilles().size(); grilleIndice++) {

                damier = bingo.getGrilles().get(grilleIndice).getDamier();

                boolean doitParcouirLaGrille = true;

                for(int i=0; i < LINE_SIZE && doitParcouirLaGrille; i++) {
                    for (int j=0; j < COLUMN_SIZE && doitParcouirLaGrille; j++) {
                        if(damier[i][j].equals(valeur)) {
                            damier[i][j] = -1;
                            if(estLigneComplete(damier, i) || estColonneComplete(damier, j)) {
                                return calculerScoreGrilleComplete(damier, valeur);
                            }
                            doitParcouirLaGrille = false;
                        }
                    }
                }
            }
        }

        return -1;
    }
}
