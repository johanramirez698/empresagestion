package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    private List<Empleado> listaEmpleados= new LinkedList<>();
    
    public Departamento() {
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

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString() {
        return "Departamento [nombre=" + nombre + ", codigo=" + codigo + ", listaEmpleados=" + listaEmpleados + "]";
    }

    
}
