public class Tiger extends Animal{
    private boolean isWhite;

    public Tiger(){
        super();
        isWhite = false;
    }

    public Tiger(String origin, boolean isWhite){
        super(origin);
        this.isWhite = isWhite;
    }

    public String makeSound(){
        return "Roar!";
    }

    public double getMass(){  // mass in gramms
        mass *= 1000;
        return mass ;
    }
}
