public class Animal {
    String origin;
    double mass;

    public Animal(){
        origin = "PlanetEarth";
    }

    public Animal(String origin){
        this.origin = origin;
    }

    public String makeSound(String sound){
        return sound;
    }

    public double getMass(){  // mass in kilos
        return mass;
    }
}
