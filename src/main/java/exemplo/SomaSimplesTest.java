package exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SomaSimplesTest {
    @Test
    public void testSum() {
    	SomaSimples calculator = new SomaSimples();
        assertEquals(5, calculator.sum(2, 3));
    }
}

