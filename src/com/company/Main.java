package com.company;

import Models.AtomicBoat;
import Models.EngineAtomicBoat;
public class Main {

    public static void main(String[] args) {
        AtomicBoat atomicBoat = new AtomicBoat("NAVIGATOR");
        System.out.println(atomicBoat.toString());
        atomicBoat.getEngineAtomicBoat().StartEngine();
    }

}
