package com.example.aoc.domain.usecases.decembre2021.jour5;

import com.example.aoc.domain.entities.decembre2021.jour5.Line;
import org.springframework.stereotype.Component;

@Component
public abstract class HydrothermalVentureService {

    protected final Integer CRITERIA = 2;

    /**
     *
     * @return le score calculé
     */
    abstract int calculerScore();

    protected int calculerScoreField(Integer[][] field, Integer largeurField, Integer longueurField) {

        int resultat = 0;
        for(Integer i = 0; i<=largeurField; i++) {
            for(Integer j = 0; j<=longueurField; j++) {
                if(field[i][j] >= CRITERIA) {
                    resultat++;
                }
            }
        }
        return resultat;
    }

    protected boolean isVerticalLigne(Line line) {
        return line.getStart().getAbscisse().equals(line.getEnd().getAbscisse());
    }

    protected void ajoutVerticalFieldValue(Integer[][] field, Line line) {
        if(line.getStart().getOrdonne() < line.getEnd().getOrdonne()) {
            for(Integer i = line.getStart().getOrdonne(); i <= line.getEnd().getOrdonne(); i++) {
                field[line.getStart().getAbscisse()][i]++;
            }
        }

        if(line.getEnd().getOrdonne() <= line.getStart().getOrdonne()) {
            for(Integer i = line.getEnd().getOrdonne(); i <= line.getStart().getOrdonne(); i++) {
                field[line.getStart().getAbscisse()][i]++;
            }
        }
    }

    protected boolean isHorizontalLigne(Line line) {
        return line.getStart().getOrdonne().equals(line.getEnd().getOrdonne());
    }

    protected void ajoutHorizontalFieldValue(Integer[][] field, Line line) {
        if(line.getStart().getAbscisse() < line.getEnd().getAbscisse()) {
            for(Integer i = line.getStart().getAbscisse(); i <= line.getEnd().getAbscisse(); i++) {
                field[i][line.getStart().getOrdonne()]++;
            }
        }

        if(line.getEnd().getAbscisse() <= line.getStart().getAbscisse()) {
            for(Integer i = line.getEnd().getAbscisse(); i <= line.getStart().getAbscisse(); i++) {
                field[i][line.getStart().getOrdonne()]++;
            }
        }
    }

    /**
     *
     * @param line
     * @return
     */
    protected boolean isDiagonalLigne(Line line) {
        return !isVerticalLigne(line) && !isHorizontalLigne(line);
    }

    protected void ajoutDiagonalFieldValue(Integer[][] field, Line line) {
        if(line.getStart().getAbscisse() < line.getEnd().getAbscisse()
        && line.getStart().getOrdonne() < line.getEnd().getOrdonne()) {
            for(Integer i = line.getStart().getAbscisse(); i <= line.getEnd().getAbscisse(); i++) {
                field[i][line.getStart().getOrdonne()+(i-line.getStart().getAbscisse())]++;
            }
        }

        if(line.getStart().getAbscisse() < line.getEnd().getAbscisse()
                && line.getEnd().getOrdonne() < line.getStart().getOrdonne()) {
            for(Integer i = line.getStart().getAbscisse(); i <= line.getEnd().getAbscisse(); i++) {
                field[i][line.getStart().getOrdonne()-(i-line.getStart().getAbscisse())]++;
            }
        }

        if(line.getEnd().getAbscisse() < line.getStart().getAbscisse()
                && line.getStart().getOrdonne() < line.getEnd().getOrdonne()) {
            for(Integer i = line.getEnd().getAbscisse(); i <= line.getStart().getAbscisse(); i++) {
                field[i][line.getEnd().getOrdonne()-(i-line.getEnd().getAbscisse())]++;
            }
        }

        if(line.getEnd().getAbscisse() < line.getStart().getAbscisse()
                && line.getEnd().getOrdonne() < line.getStart().getOrdonne()) {
            for(Integer i = line.getEnd().getAbscisse(); i <= line.getStart().getAbscisse(); i++) {
                field[i][line.getEnd().getOrdonne()+(i-line.getEnd().getAbscisse())]++;
            }
        }
    }
}
