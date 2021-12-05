package com.example.aoc.domain.entities.decembre2021.jour4;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Bingo {

    List<Integer> valeurs;

    Map<Integer, Grille> grilles;
}
