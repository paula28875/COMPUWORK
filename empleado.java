public class empleado {
    private int id;
    private String nombre;
    private double salario;
    private String tipo;

    public empleado(int id, String nombre, double salario, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.tipo = tipo;
    }

    public double calcularSalario() {
        return salario;
    }

    public void asignarDepartamento(String departamento) {
        System.out.println(nombre + " asignado al departamento: " + departamento);
    }

    public String generarReporte() {
        return "Reporte de " + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}