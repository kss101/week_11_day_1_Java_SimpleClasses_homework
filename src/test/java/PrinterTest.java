import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    @Before
    public void before(){
        printer = new Printer(1000, 100);
    }

    @Test
    public void hasPaperLeft(){
        assertEquals(1000, printer.getPaperLeft());
    }

    @Test
    public void hasTonerLeft(){
        assertEquals(100, printer.getTonerVolumeLeft());
    }

    @Test
    public void canPrint(){
        printer.printCopies(10, 5);
        assertEquals(950, printer.getPaperLeft());
    }

    @Test
    public void cantPrint(){
        assertEquals("Unable to print. Insufficient paper or toner", printer.printCopies(10, 50));
    }

}
