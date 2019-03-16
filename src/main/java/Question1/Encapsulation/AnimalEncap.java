package Question1.Encapsulation;

public class AnimalEncap {

    private String name = "Lion";
    private int lifespan = 12;

    public AnimalEncap(){

    }

    //GETTER METHODS
    public String getName(){
        return name;
    }

    public int getLifespan(){
        return lifespan;
    }

    //SETTER METHODS
    public void setName(String name){
        this.name = name;
    }

    public void setLifespan(int lifespan){
        this.lifespan = lifespan;
    }

    //TOSTRING
    @Override
    public String toString(){
        return "\nName: "+name+"\nLifespan: "+lifespan;
    }

}
