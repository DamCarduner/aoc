package com.example.aoc.infrastructure.decembre2021.jour4;

import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;

import com.example.aoc.domain.entities.decembre2021.jour4.DamierStatut;
import com.example.aoc.domain.entities.decembre2021.jour4.Grille;
import com.example.aoc.domain.usecases.decembre2021.jour4.BingoPersistancePort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class BingoPersistanceAdapter implements BingoPersistancePort {

    @Value("${decembre2021.jour4.input.real}")
    Resource inputResource;

    @Override
    public Bingo recupererBingo() {
        Bingo bingo = new Bingo();

        InputStream inputStream;
        try {
            inputStream = inputResource.getInputStream();
        } catch (IOException e) {
            return new Bingo();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            Integer lineNumber = -1;
            Map<Integer, Grille> grilles = new HashMap<>();
            Grille grille = null;
            Integer[][] damier = null;
            while (reader.ready()) {
                String line = reader.readLine();

                if(lineNumber == -1) {
                    bingo.setValeurs(List.of(line.split(",")).stream().map(Integer::parseInt).collect(Collectors.toList()));
                } else if (lineNumber  > 0) {


                    if(lineNumber % 6 == 1) {
                        grille = new Grille();
                        grille.setStatus(DamierStatut.IN_PROGRESS);
                        damier = new Integer[5][5];
                    }

                    if(lineNumber % 6 != 0) {
                        damier[lineNumber % 6 - 1][0] = Integer.parseInt(line.substring(0, 2).trim());
                        damier[lineNumber % 6 - 1][1] = Integer.parseInt(line.substring(3, 5).trim());
                        damier[lineNumber % 6 - 1][2] = Integer.parseInt(line.substring(6, 8).trim());
                        damier[lineNumber % 6 - 1][3] = Integer.parseInt(line.substring(9, 11).trim());
                        damier[lineNumber % 6 - 1][4] = Integer.parseInt(line.substring(12,14).trim());
                    }

                    if(lineNumber % 6 == 5) {
                        grille.setDamier(damier);
                        grilles.put(lineNumber / 6 , grille);
                    }
                }
                lineNumber++;
            }
            bingo.setGrilles(grilles);
        } catch (IOException e) {
            return new Bingo();
        }

        return bingo;
    }
}
