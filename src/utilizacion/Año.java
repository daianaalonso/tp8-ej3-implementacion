package utilizacion;

import framework.Accion;

import java.time.LocalDate;

public class Año implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("El año actual es: " + LocalDate.now().getYear() + "\n");
    }

    @Override
    public String nombreItemMenu() {
        return "Año";
    }

    @Override
    public String descripcionItemMenu() {
        return "Muestra el año actual.";
    }

    @Override
    public String toString() {
        return nombreItemMenu();
    }
}
