
package umg.modelo;

public class Camionero {
    int idCamionero;
    String nombre;
    String apellido;
    String direccion;
    Double salario;
    String poblacion;
    String dpi;
    String telefono;

    public Camionero(int idCamionero, String nombre, String apellido, String direccion, Double salario, String poblacion, String dpi, String telefono) {
        this.idCamionero = idCamionero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.salario = salario;
        this.poblacion = poblacion;
        this.dpi = dpi;
        this.telefono = telefono;
    }
    
    public Camionero(){
        
    }

    public int getIdCamionero() {
        return idCamionero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public Double getSalario() {
        return salario;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getDpi() {
        return dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setIdCamionero(int idCamionero) {
        this.idCamionero = idCamionero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Camionero{" + "idCamionero=" + idCamionero + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", salario=" + salario + ", poblacion=" + poblacion + ", dpi=" + dpi + ", telefono=" + telefono + '}';
    }
    

}
