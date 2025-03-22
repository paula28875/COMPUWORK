public class empleadotemporal extends empleado {
    private int duracionContrato;

    public empleadotemporal(int id, String nombre, double salario, String tipo, int duracionContrato) {
        super(id, nombre, salario, tipo);
        this.duracionContrato = duracionContrato;
    }

    public String calcularDuracion() {
        return "Duración del contrato: " + duracionContrato + " meses";
    }
}