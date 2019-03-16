package Question2;

import Question2.Feline;
import Question2.Lion;
import Question2.Tiger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQ2 {

    Feline lion;
    Feline tiger;

    @Before
    public void setUp() throws Exception {

        lion = new Lion();
        tiger = new Tiger();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void inheritTest(){
        Assert.assertNotEquals(lion,tiger);
    }
}
