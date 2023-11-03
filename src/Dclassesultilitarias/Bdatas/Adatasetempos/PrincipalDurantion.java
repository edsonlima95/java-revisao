package Dclassesultilitarias.Bdatas.Adatasetempos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PrincipalDurantion {

    public static void main(String[] args) {

        /**
         * Duration calcula a quantidade de horas entre datas e tempos.
         */

        LocalDateTime agora = LocalDateTime.now();

        LocalTime time = LocalTime.now();

        Duration d1 = Duration.between(agora, agora.plusMonths(2));

        Duration d2 = Duration.between(time, time.plusHours(2));

        Duration d3 = Duration.ofHours(3);

        Duration d4 = Duration.ofDays(3);

        System.out.println("Total de horas de hoje até 2 mês: " + d1);
        System.out.println("Total de horas de agora até 2 horas: " +d2);
        System.out.println("Total de horas de agora até 3 horas: " +d3);
        System.out.println("Total de horas de agora até 3 dias: " +d4);

    }

}
