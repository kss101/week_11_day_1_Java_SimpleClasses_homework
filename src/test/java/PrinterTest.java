import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    @Before
    public void before(){
        printer = new Printer((1000));
    }

    @Test
    public void hasPaperLeft(){
        assertEquals(100, printer.getPaperLeft());
    }

    @Test
    public void canPrint(){
        printer.printCopies(10, 5);
        assertEquals(900, printer.getPaperLeft());
    }
}