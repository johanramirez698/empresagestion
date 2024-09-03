package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados = new LinkedList<>();
    
    public Proyecto() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }
    public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }
    


    
}
