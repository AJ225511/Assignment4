package Question1;

import Question1.Encapsulation.AnimalEncap;
import Question1.Inheritance.Lion;
import Question1.Inheritance.Feline;
import Question1.Polymorphism.Kudu;
import Question1.Polymorphism.Animals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQ1 {

    AnimalEncap ae;
    Lion lion;
    Animals animal;

    @Before
    public void setUp() throws Exception {
        ae = new AnimalEncap();
        lion = new Lion();
        animal = new Kudu("kudu");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void encapTest() {
        System.out.println("Encapsulation");
        ae.setLifespan(15);
        ae.setName("Mufasa");
        System.out.println(ae);
        Assert.assertEquals(ae,ae);
    }

    @Test
    public void inheritTest(){
       System.out.println("Inheritance");
       System.out.println("The lion runs at "+lion.run()+"km/h");
       Assert.assertEquals(true, lion instanceof Feline);
    }

    @Test
    public void polyTest(){
        System.out.println("Polymorphism");
        System.out.println("The Kudu is " +animal.sound());
        Assert.assertEquals(animal.getClass(),animal.getClass());

    }



}
