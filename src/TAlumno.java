public class TAlumno {
    private int cedula;
    private String nombreYapellido;

    public TAlumno(int cedula, String nombreYapellido) {
        this.cedula = cedula;
        this.nombreYapellido = nombreYapellido;
    }
    public int getCedula() {
        return this.cedula;
    }
    public String getNombreYapellido() {
        return this.nombreYapellido;
    }
}
