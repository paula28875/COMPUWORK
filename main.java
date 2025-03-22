import main.*;

public class main {
    public static void main(String[] args) {
        // Crear empleados
        empleadopermanente empleado1 = new empleadopermanente(1, "Juan Pérez", 3000.0, "Permanente", "Seguro médico");
        empleadotemporal empleado2 = new empleadotemporal(2, "Ana López", 1500.0, "Temporal", 12);

        // Crear departamento
        departamento departamento = new departamento(101, "Recursos Humanos");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Generar reporte de desempeño
        reportedesempeno reporte = new reportedesempeno(1, empleado1, "Excelente");
        System.out.println(reporte.generarReporte());

        // Listar empleados del departamento
        departamento.listarEmpleados();
    }
}