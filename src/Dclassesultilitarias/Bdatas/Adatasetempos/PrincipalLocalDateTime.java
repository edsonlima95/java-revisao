package Dclassesultilitarias.Bdatas.Adatasetempos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrincipalLocalDateTime {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.format(dtf));

    }

}
