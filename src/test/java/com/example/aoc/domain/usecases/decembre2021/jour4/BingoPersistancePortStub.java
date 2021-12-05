package com.example.aoc.domain.usecases.decembre2021.jour4;

import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;

public class BingoPersistancePortStub implements BingoPersistancePort {

    private final Bingo bingo;

    public BingoPersistancePortStub() {
        bingo = new Bingo();
    }

    public BingoPersistancePortStub(Bingo bingo) {
        this.bingo = bingo;
    }

    @Override
    public Bingo recupererBingo() {
        return bingo;
    }


}
