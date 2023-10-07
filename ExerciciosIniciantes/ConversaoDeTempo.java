package ExerciciosIniciantes;

import java.time.Duration;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Duration total = Duration.ofSeconds(140153);
        int horas = total.toHoursPart();
        int minutos = total.toMinutesPart();
        int segundos = total.toSecondsPart();
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
