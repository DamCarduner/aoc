package com.example.aoc.domain.entities.decembre2021.jour5;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class HydrothermalVenture {

    List<Line> lines;

    Integer[][] field;

    Integer largeurField;

    Integer longueurField;
}
