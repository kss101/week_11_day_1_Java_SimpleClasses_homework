import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canTakeManyDrinks(){
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(70, waterbottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());

    }
    public void canFill(){
     //   waterbottle.fill();
      //  assertEquals(100, waterbottle.getVolume());

    }

}
