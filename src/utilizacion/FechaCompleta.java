package utilizacion;

import framework.Accion;

import java.time.LocalDate;

public class FechaCompleta implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("La fecha actual es: " + LocalDate.now() + "\n");
    }

    @Override
    public String nombreItemMenu() {
        return "Fecha completa";
    }

    @Override
    public String descripcionItemMenu() {
        return "Muestra la fecha actual.";
    }

    @Override
    public String toString() {
        return nombreItemMenu();
    }
}
