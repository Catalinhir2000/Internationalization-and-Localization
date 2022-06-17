package org.example.com;

public class DisplayLocales {
    public static void display(){
        java.util.Locale[] locales = java.util.Locale.getAvailableLocales();
        for(java.util.Locale locale : locales){
            System.out.println(locale.getDisplayCountry() + " " + locale.getDisplayLanguage());
        }
    }
}
