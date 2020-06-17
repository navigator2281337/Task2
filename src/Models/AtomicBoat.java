package Models;

import Anotation.Annon;

@Annon
public class AtomicBoat {

    private String name;


    public AtomicBoat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AtomicBoat { " +
                "name='" + name + '\'' +
                '}';
    }



    EngineAtomicBoat engineAtomicBoat = new EngineAtomicBoat();

    public EngineAtomicBoat getEngineAtomicBoat() {
        return engineAtomicBoat;
    }

    public void setEngineAtomicBoat(EngineAtomicBoat engineAtomicBoat) {
        this.engineAtomicBoat = engineAtomicBoat;
    }



}
