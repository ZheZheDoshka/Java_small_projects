package org.example;

public final class immutablePet {
    private String name;
    private Species species;

    public immutablePet(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public immutablePet setSpecies(Species species) {
        Species species1 = new Species(species.getSpecies());
        immutablePet pet = new immutablePet(name, species1);
        return pet;
    }

    public immutablePet setName(String name) {
        immutablePet  student = new immutablePet (name, species);
        return student;
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {
        Species species = new Species(this.species.getSpecies());
        return species;
    }
}