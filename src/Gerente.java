public class Gerente extends Empleado implements Autenticable {

    public double getBonificacion() {
        return 2000;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
