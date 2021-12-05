package com.example.aoc.infrastructure.decembre2021.jour5;

import com.example.aoc.domain.entities.decembre2021.jour5.Coordonnee;
import com.example.aoc.domain.entities.decembre2021.jour5.HydrothermalVenture;
import com.example.aoc.domain.entities.decembre2021.jour5.Line;

import com.example.aoc.domain.usecases.decembre2021.jour5.HydrothermalVenturePersistancePort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.List;

@Component
public class HydrothermalVenturePersistanceAdapter implements HydrothermalVenturePersistancePort {

    @Value("${decembre2021.jour5.input.real}")
    Resource inputResource;

    @Override
    public HydrothermalVenture recupererHydrothermalVenture() {
        HydrothermalVenture hydrothermalVenture = new HydrothermalVenture();

        InputStream inputStream;
        try {
            inputStream = inputResource.getInputStream();
        } catch (IOException e) {
            return new HydrothermalVenture();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            List<Line> lignes = new ArrayList<>();
            hydrothermalVenture.setLargeurField(Integer.MIN_VALUE);
            hydrothermalVenture.setLongueurField(Integer.MIN_VALUE);
            while (reader.ready()) {
                String line = reader.readLine();

                String debut = line.substring(0, line.indexOf("-")).trim();
                String fin = line.substring(line.indexOf(">")+2).trim();

                Integer abscisseDebut = Integer.parseInt(debut.substring(0, debut.indexOf(",")));
                Integer ordonneDebut = Integer.parseInt(debut.substring(debut.indexOf(",")+1));

                Integer abscisseFin = Integer.parseInt(fin.substring(0, fin.indexOf(",")));
                Integer ordonneFin = Integer.parseInt(fin.substring(fin.indexOf(",")+1));

                if(abscisseDebut > hydrothermalVenture.getLargeurField()) {
                    hydrothermalVenture.setLargeurField(abscisseDebut);
                }
                if(abscisseFin > hydrothermalVenture.getLargeurField()) {
                    hydrothermalVenture.setLargeurField(abscisseFin);
                }

                if(ordonneDebut > hydrothermalVenture.getLongueurField()) {
                    hydrothermalVenture.setLongueurField(ordonneDebut);
                }
                if(ordonneFin > hydrothermalVenture.getLongueurField()) {
                    hydrothermalVenture.setLongueurField(ordonneFin);
                }

                Coordonnee coordonneeDebut = new Coordonnee();
                coordonneeDebut.setAbscisse(abscisseDebut);
                coordonneeDebut.setOrdonne(ordonneDebut);

                Coordonnee coordonneeFin = new Coordonnee();
                coordonneeFin.setAbscisse(abscisseFin);
                coordonneeFin.setOrdonne(ordonneFin);

                Line ligne = new Line();
                ligne.setStart(coordonneeDebut);
                ligne.setEnd(coordonneeFin);
                lignes.add(ligne);
            }
            Integer[][] field = new Integer[hydrothermalVenture.getLargeurField()+1][hydrothermalVenture.getLongueurField()+1];

            for(int i = 0; i <= hydrothermalVenture.getLargeurField(); i++) {
                for(int j = 0; j <= hydrothermalVenture.getLongueurField(); j++) {
                    field[i][j] = 0;
                }
            }
            hydrothermalVenture.setField(field);
            hydrothermalVenture.setLines(lignes);

        } catch (IOException e) {
            return new HydrothermalVenture();
        }

        return hydrothermalVenture;
    }
}
