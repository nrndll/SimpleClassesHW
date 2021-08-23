import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle = new WaterBottle(100);

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeBy10(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void emptyReducesVolumeTo0(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillIncreasesVolumeTo100(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}