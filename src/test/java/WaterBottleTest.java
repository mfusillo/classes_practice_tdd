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
    public void volume_starts_at_100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void can_remove_10_when_drinking(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void cannot_drink_when_volume_is_0(){
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void can_empty_bottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void can_fill_bottle(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}
