package fr.iut;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtil {

    /**
     * Retourner une chaine de caractère contant la "monnaie" selon le pays
     * @param amount monnaie
     * @param locale lieu
     * @return la chaine
     */
    public static String prettyCurrencyPrint(final double amount, final Locale locale) {
        return NumberFormat.getCurrencyInstance(locale)
                .format(amount);
    }
}
