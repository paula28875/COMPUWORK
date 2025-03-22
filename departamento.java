import java.util.ArrayList;

public class departamento {
    private int id;
    private String nombre;
    private ArrayList<empleado> empleados;

    public departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    public void eliminarEmpleado(int empleadoId) {
        empleados.removeIf(emp -> emp.getId() == empleadoId);
        System.out.println("Empleado eliminado con ID: " + empleadoId);
    }

    public void listarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (empleado emp : empleados) {
            System.out.println("- " + emp.getNombre());
        }
    }
}