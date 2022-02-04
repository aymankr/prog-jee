package fr.iut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtilTest {

    @Test
    public void testPrettyCurrency() {
        String res = StringUtil.prettyCurrencyPrint(21500.390, Locale.FRANCE);
        assertEquals(res.replace("\u00a0", " "), "21 500,39 €");

<<<<<<< HEAD
        String res2 = StringUtil.prettyCurrencyPrint(8889.3900, Locale.FRANCE);
        assertEquals(res2.replace("\u00a0", " "), "8 889,39 €");
=======
        String res2 = StringUtil.prettyCurrencyPrint(328.81, Locale.FRANCE);
        assertEquals(res2.replace("\u00a0", " "), "328,81 €");
>>>>>>> 547c118d8f32df19f26d837eddb42ea74bc5eaf3
    }
}
