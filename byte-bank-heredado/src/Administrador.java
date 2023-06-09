public class Administrador extends Funcionario implements Autenticable {

    private AutenficacionUtil util;

    public Administrador(){
        this.util = new AutenficacionUtil();
    }
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
