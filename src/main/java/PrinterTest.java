import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setup(){
        printer = new Printer(100, 50);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

//    @Test
//    public void canPrint(){
//        assertEquals(true , printer.print(3,4));
//    }

    @Test
    public void printReducesNumberOfSheets(){
        printer.print(3, 4);
        assertEquals(88, printer.getSheets());
    }

    @Test
    public void cannotPrintIfNotEnoughSheets(){
        printer = new Printer(1, 50);
        printer.print(3, 4);
//        assertEquals(false, printer.print(3,4));
        assertEquals(1, printer.getSheets());
    }

    @Test
    public void tonerReducesBy1ForEachPagePrinted(){
        printer.print(3, 4);
        assertEquals(38, printer.getToner());
    }
}
