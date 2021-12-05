package com.example.aoc.domain.usecases.decembre2021.jour4;

import org.springframework.stereotype.Component;

@Component
public abstract class BingoService {

    protected final Integer LINE_SIZE = 5;
    protected final Integer COLUMN_SIZE = 5;

    /**
     *
     * @return le score calculé
     */
    abstract int calculerScore();

    /**
     *
     * @param damier le damier à calculer
     * @param valeur la dernière valeur validée sur la grille
     * @return le score d'une grille complète
     */
    protected int calculerScoreGrilleComplete(Integer[][] damier, int valeur) {
        int sum = 0;
        for(int i=0; i < LINE_SIZE ; i++) {
            for (int j = 0; j < COLUMN_SIZE; j++) {
                if(estCaseIncomplete(damier[i][j])) {
                    sum += damier[i][j];
                }
            }
        }
        return sum * valeur;
    }

    /**
     *
     * @param damier la grille à vérifier
     * @param i la ligne à vérifier
     * @return ligne complete ou incomplete
     */
    protected boolean estLigneComplete(Integer[][] damier, int i) {
        for(int m = 0; m < COLUMN_SIZE; m++) {
            if(estCaseIncomplete(damier[i][m])) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param damier la grille à vérifier
     * @param j la colonne à vérifier
     * @return colonne complete ou incomplete
     */
    protected boolean estColonneComplete(Integer[][] damier, int j) {
        for(int m = 0; m < LINE_SIZE; m++) {
            if(estCaseIncomplete(damier[m][j])) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param point la valeur présente dans la case
     * @return complet ou incomplet
     */
    private boolean estCaseIncomplete(Integer point) {
        return point != -1;
    }
}
