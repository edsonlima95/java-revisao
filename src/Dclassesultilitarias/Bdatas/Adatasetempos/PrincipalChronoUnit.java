package Dclassesultilitarias.Bdatas.Adatasetempos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PrincipalChronoUnit {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        LocalDate passado = LocalDate.of(2022,03, 27);

        System.out.println("Dias: " + ChronoUnit.DAYS.between(passado,agora));
        System.out.println("Semanas: " + ChronoUnit.WEEKS.between(passado,agora));
        System.out.println("Mêses: " + ChronoUnit.MONTHS.between(passado,agora));
        System.out.println("Anos: " + ChronoUnit.YEARS.between(passado,agora));

    }
}
