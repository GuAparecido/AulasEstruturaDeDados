package Aula08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Aula08 {

    public static void main(String[] args) {
//        http:worldtimeapi.org/timezones

        Date date = new Date();
        System.out.println(date);

        LocalDate dataInicio = LocalDate.of(2023, 3, 1);
        System.out.println(dataInicio);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataInicio.format(formatter);
        System.out.println(dataFormatada);

        LocalDate dataFim = LocalDate.now();
        System.out.println(dataFim.format(formatter));

        long diffDays = ChronoUnit.DAYS.between(dataInicio, dataFim);
        long diffMonths = ChronoUnit.MONTHS.between(dataInicio, dataFim);
        long diffYears = ChronoUnit.YEARS.between(dataInicio, dataFim);
        System.out.println("Diferença em dias: " + diffDays);
        System.out.println("Diferença em meses: " + diffMonths);
        System.out.println("Diferença em anos: " + diffYears);

        // Modificando os nomes das variáveis para rodar. Adicionei 1.
        LocalDateTime dataInicio1 = LocalDateTime.of(2024, 3, 27, 19, 0);
        String dataFormatada1 = dataInicio1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(dataFormatada1);

        LocalDateTime dataFim1 = LocalDateTime.now();

        long diffHours = ChronoUnit.HOURS.between(dataInicio1, dataFim1);
        long diffMinutes = ChronoUnit.MINUTES.between(dataInicio1, dataFim1);
        System.out.println("Diferença em horas: " + diffHours);
        System.out.println("Diferença em minutos: " + diffMinutes);

        LocalDateTime oldDateTime = LocalDateTime.parse("2024-03-27T19:00:00");
        ZoneId oldZone = ZoneId.of("America/Sao_Paulo");

        System.out.println(oldDateTime.atZone(oldZone));

        ZoneId newZone = ZoneId.of("Europe/London");
        LocalDateTime newDateTime = oldDateTime.atZone(oldZone)
                .withZoneSameInstant(newZone)
                .toLocalDateTime();
        System.out.println(newDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    }

}