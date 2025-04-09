package DateDue;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EsercizioDateDue {
    public static void main(String[] args) {

        //Crea OffsetDateTime dalla stringa
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //Definizione formato desiderato
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY );

        //formatta la data
        String formattedDate = formatter.format(dateTime);

        //stampa sulla console
        System.out.println(formattedDate);
    }
}
