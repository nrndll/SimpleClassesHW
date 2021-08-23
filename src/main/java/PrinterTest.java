import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer = new Printer(100);

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canPrint(){
        assertEquals(true , printer.print(3,4));
    }

    @Test
    public void printReducesNumberOfSheets(){
        printer.print(3, 4);
        assertEquals(88, printer.getSheets());
    }

    @Test
    public void cannotPrintIfNotEnoughSheets(){
        printer = new Printer(1);
        assertEquals(false, printer.print(3,4));
        assertEquals(1, printer.getSheets());
    }
}
