package co.edu.uniquindio.poo;

public class Empleado {
    public String nombre;
    public String IdEmpleado;
    public Departamento departamento;
   
    public Empleado(String nombre, String idEmpleado, Departamento departamento) {
        this.nombre = nombre;
        IdEmpleado = idEmpleado;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        IdEmpleado = idEmpleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
