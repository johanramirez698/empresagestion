package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nombre;
     List <Departamento> listaDepartamentos= new LinkedList<>();
     public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    List<Proyecto> listaProyectos=new LinkedList<>();
     List<Empleado> listaEmpleados= new LinkedList<>();
   

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }
    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }
    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }
    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    
}
