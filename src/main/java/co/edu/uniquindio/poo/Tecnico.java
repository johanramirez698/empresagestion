package co.edu.uniquindio.poo;

public class Tecnico extends Empleado implements ContribuyenteTecnico{

    public Tecnico(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
        
    }

    @Override
    public void realizarTareasTecnicas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarTareasTecnicas'");
    }

    }


