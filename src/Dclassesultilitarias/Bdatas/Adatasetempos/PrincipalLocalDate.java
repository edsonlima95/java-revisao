package Dclassesultilitarias.Bdatas.Adatasetempos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PrincipalLocalDate {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.of(2023, Month.JANUARY, 16);
        //LocalDate date2 = LocalDate.parse("2023-01-16");
        LocalDate agora = LocalDate.now();

        System.out.println("Dia da semana: " + agora.getDayOfWeek()); //Dia da semana
        System.out.println("Dia da semana numero: " + agora.getDayOfWeek().getValue()); //Dia da em numero
        System.out.println("Dia do mês: " + agora.getDayOfMonth());
        System.out.println("Mês: " + agora.getMonth());
        System.out.println("Numero do mês: " + agora.getMonthValue());
        System.out.println("Dias do mês: " + agora.lengthOfMonth()); //Quantidade de dias do mês.
        System.out.println("Ano: " + agora.getYear());
        System.out.println("Dias do ano: " + agora.lengthOfYear()); //Quantidade de dias do ano.
        System.out.println("Bisexto: " + agora.isLeapYear()); //Bisexto

        System.out.println("----------------------------------");

        System.out.println("Adiciona dias: " + LocalDate.now().plusDays(3)); //Adiciona 3 dias.
        System.out.println("Adiciona mês: " +LocalDate.now().plusMonths(1));//Adiciona 1 mês
        System.out.println("Adiciona ano: " +LocalDate.now().plusYears(1));//Adiciona 1 ano
        System.out.println("Data é depois ?: " +agora.isAfter(LocalDate.now().plusMonths(1)));
        System.out.println("Data é antes ?: " +agora.isBefore(LocalDate.now().plusMonths(1)));

        System.out.println("---------------FORMATANDO-------------------");

        System.out.println(agora.format(dateTimeFormatter));  //17-10-2023


    }

}
