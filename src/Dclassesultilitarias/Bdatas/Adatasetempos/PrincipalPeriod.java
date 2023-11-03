package Dclassesultilitarias.Bdatas.Adatasetempos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PrincipalPeriod {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();

        LocalDate fim = LocalDate.of(2022, Month.MARCH, 27);

        Period period = Period.between(fim, agora);

        System.out.println("Meu aniversário foi a " + period.getMonths()
                + " mêses " + period.getDays() + " dias e "
                + period.getYears() + " anos");

        System.out.println("----------------------------------");

        Period fromDays = Period.ofDays(50);
        Period fromMonths = Period.ofMonths(2);
        Period fromYears = Period.ofYears(10);

        System.out.println(fromDays.getDays());

    }
}
