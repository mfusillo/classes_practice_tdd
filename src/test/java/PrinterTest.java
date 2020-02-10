import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){printer = new Printer(10, 20);}

    @Test
    public void can_check_current_number_of_sheets_left(){
        assertEquals(10, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void can_decrease_number_of_sheets_left_when_printing(){
        printer.print(2, 1);
        assertEquals(8, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void can_still_print_if_sheets_left_are_exactly_equals_to_pages_to_print(){
        printer.print(2, 5);
        assertEquals(0, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void printer_does_not_print_when_sheets_left_are_less_than_pages_to_print(){
        printer.print(3, 8);
        assertEquals(10, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void toner_goes_down_by_number_of_pages_printed(){
        printer.print(2, 5);
        assertEquals(10, printer.getTonerLevel());
    }

    @Test
    public void cannot_print_if_toner_level_is_less_than_pages_to_print(){
        Printer printer2 = new Printer(10, 5);
        printer2.print(3, 2);
        assertEquals(5, printer2.getTonerLevel());
    }

}
