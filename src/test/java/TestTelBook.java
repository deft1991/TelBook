
import org.junit.Test;


/**
 * Created by �� on 04.09.2016.
 */
public class TestTelBook {

    @Test
    public void testTelBook() {
        TelBook.addALL();
        TelBook.getData("tishenko");
        TelBook.getData("sidorov");
    }
}
