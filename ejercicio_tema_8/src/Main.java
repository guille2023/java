import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       cliente.setNombre("Claudio");
       cliente.setEdad(30);
       cliente.setTelefono(20301020);
       cliente.setCredito(200000);
       System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Roberto");
        trabajador.setEdad(45);
        trabajador.setTelefono(10351627);
        trabajador.setSalario(50000);
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Credito: " + trabajador.getSalario());


    }
}


abstract class Persona {
    private String nombre;
    private  int edad;
    private int telefono;
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad ( int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void  setTelefono ( int telefono){
        this.telefono = telefono;
    }
    public int getTelefono (){
        return this.telefono;
    }

}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}

final class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}