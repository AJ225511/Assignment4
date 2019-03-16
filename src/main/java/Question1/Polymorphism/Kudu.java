package Question1.Polymorphism;

public class Kudu extends Animals implements Vegetarian {

    String name = "kudu";

    public Kudu(String name){
        super(name);
    }

    @Override
    public String sound(){
        return super.sound() + "inngg";
    }

}
