package co.edu.uniquindio.poo;

public class Gerente extends Empleado implements ContribuyenteGerencial{

    public Gerente(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
        
    }

    @Override
    public void gestionarProyectos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gestionarProyectos'");
    }

    @Override
    public void gestionarEquipos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gestionarEquipos'");
    }

   
    }
