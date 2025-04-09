package date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date {
    public static void main(String[] args) {
        // 1. Creazione dell'OffsetDateTime dalla stringa
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        // 2. Creazione dei formattatori per i diversi stili
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        // 3. Formattazione e stampa delle varie versioni
        String fullFormat = dateTime.format(fullFormatter);
        String mediumFormat = dateTime.format(mediumFormatter);
        String shortFormat = dateTime.format(shortFormatter);

        System.out.println("FULL format: " + fullFormat);
        System.out.println("MEDIUM format: " + mediumFormat);
        System.out.println("SHORT format: " + shortFormat);
    }
}