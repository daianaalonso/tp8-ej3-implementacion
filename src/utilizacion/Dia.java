package utilizacion;

import framework.Accion;

import java.time.LocalDate;

public class Dia implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("El día actual es: " + LocalDate.now().getDayOfMonth() + "\n");
    }

    @Override
    public String nombreItemMenu() {
        return "Día";
    }

    @Override
    public String descripcionItemMenu() {
        return "Muestra el día actual.";
    }

    @Override
    public String toString() {
        return nombreItemMenu();
    }
}
