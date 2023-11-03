package Dclassesultilitarias.Bdatas.Adatasetempos;

import java.time.LocalTime;

public class PrincipalLocaTime {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println("Horas: " + agora.getHour());
        System.out.println("Minutos: " + agora.getMinute());
        System.out.println("Segundos: " + agora.getSecond());

        System.out.println("------------------------------");

        System.out.println(agora.plusHours(1).getHour());//Adiciona 1 hora
        System.out.println(agora.plusMinutes(2).getMinute());//Adiciona 2 minutos
        System.out.println(agora.plusSeconds(10).getSecond());//Adiciona 10 segundos

        System.out.println("------------------------------");

        System.out.println(agora.isBefore(agora.plusHours(1))); //True
        System.out.println(agora.isAfter(agora.plusHours(1))); //False

    }

}
