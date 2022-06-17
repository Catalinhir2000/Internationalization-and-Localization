package org.example.com;

import java.text.DateFormatSymbols;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class Info {
    public static void showInfo(Locale locale) {
        Currency currency = Currency.getInstance(locale);
        String[] weekdays = new DateFormatSymbols().getWeekdays();
        String[] months = new DateFormatSymbols().getMonths();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Locale: " + locale);
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Display Language: " + locale.getDisplayLanguage());
        System.out.println("Display Country: " + locale.getDisplayCountry());
        System.out.println("Display Language (Locale): " + locale.getDisplayLanguage(locale));
        System.out.println("Display Country (Locale): " + locale.getDisplayCountry(locale));
        System.out.println("Display currency: " + currency);
        System.out.println("Weekdays: " + Arrays.toString(weekdays));
        System.out.println("Months: " + Arrays.toString(months));
        System.out.println("Current date: " + now);
    }
}
