package Question1.Inheritance;

public class Lion extends Feline implements Animal{

  @Override
    public void sound(){
      super.sound();
  }

  @Override
    public int run(){
      return 50;
  }
}
