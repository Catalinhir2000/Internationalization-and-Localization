package org.example.app;

import org.example.com.DisplayLocales;
import org.example.com.Info;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Locale;

public class LocaleExplorer {
    public static void main( String[] args )
    {
        Locale usLocale = new Locale( "en", "US" );
        Locale roLocale = new Locale( "ro", "RO" );

        while ( true )
        {
            System.out.println("give a command: ");
            BufferedReader reader = new BufferedReader( new java.io.InputStreamReader( System.in ) );
            String command = null;
            try {
                command = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if ( command.equals( "showLocales" ) )
            {
                DisplayLocales.display();
            }
            else if ( command.equals( "setLocale_ro_RO"))
            {
                Locale.setDefault( roLocale );
            }
            else if ( command.equals( "setLocale_en_US"))
            {
                Locale.setDefault( usLocale );
            }
            else if ( command.equals( "exit" ) )
            {
                break;
            }
            else if ( command.equals( "info" ) )
            {
                Info.showInfo(Locale.getDefault());
            }
        }
    }
}
