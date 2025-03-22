public class empleadopermanente extends empleado {
    private String beneficios;

    public empleadopermanente(int id, String nombre, double salario, String tipo, String beneficios) {
        super(id, nombre, salario, tipo);
        this.beneficios = beneficios;
    }

    public String calcularBeneficios() {
        return "Beneficios: " + beneficios;
    }
}