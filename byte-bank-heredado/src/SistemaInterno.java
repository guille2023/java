public class SistemaInterno {
    private  String clave = "123456";

    public  boolean autentica(Autenticable gerente){
        boolean iniciarSeccion = gerente.iniciarSesion(clave);
        if (iniciarSeccion){
            System.out.println("Login exitoso");
            return true;
        }else {
            System.out.println(" Error de login");
            return false;
        }
    }
}
