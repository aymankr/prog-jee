package fr.iut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtilTest {

    @Test
    public void testPrettyCurrency() {
        String res = StringUtil.prettyCurrencyPrint(21500.390, Locale.FRANCE);
        String n = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(21500.390);
        assertEquals(res, n);
    }
}
