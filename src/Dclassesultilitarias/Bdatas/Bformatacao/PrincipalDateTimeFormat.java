package Dclassesultilitarias.Bdatas.Bformatacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrincipalDateTimeFormat {

    public static void main(String[] args) {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("-----------PASSANDO DATA COMO TEXT--------------");

        String dateText = "17/10/2023";

        LocalDate localDate = LocalDate.parse(dateText, sdf);

        System.out.println(localDate);

        System.out.println(sdf.format(localDate));

        System.out.println("-----------PASSANDO DATA ATUAL--------------");

        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.format(sdf));

    }

}
