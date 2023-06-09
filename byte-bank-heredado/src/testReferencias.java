public class testReferencias {
    public static void main(String[] args) {
        Funcionario  funcionario = new Contador();
        funcionario.setNombre("diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");
        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        //Elemento mas generico puede ser adapatado al elemento mas especifico
        Funcionario funcionario1 = new Gerente();
        gerente.iniciarSesion("gfgfgfg");
    }
}
