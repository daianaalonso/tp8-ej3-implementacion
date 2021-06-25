package utilizacion;

import framework.Accion;

import java.time.LocalDate;

public class Mes implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("El mes actual es: " + LocalDate.now().getMonth() + "\n");
    }

    @Override
    public String nombreItemMenu() {
        return "Mes";
    }

    @Override
    public String descripcionItemMenu() {
        return "Muestra el mes actual.";
    }

    @Override
    public String toString() {
        return nombreItemMenu();
    }
}
