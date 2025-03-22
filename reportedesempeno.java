public class reportedesempeno {
    private int id;
    private empleado empleado;
    private String evaluacion;

    public reportedesempeno(int id, empleado empleado, String evaluacion) {
        this.id = id;
        this.empleado = empleado;
        this.evaluacion = evaluacion;
    }

    public String generarReporte() {
        return "Reporte de Desempeño de " + empleado.getNombre() + ": " + evaluacion;
    }
}