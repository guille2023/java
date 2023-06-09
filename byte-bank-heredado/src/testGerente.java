public class testGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //Funcionario gerente = new Funcionario();
        gerente.setSalario(6000);
        gerente.setNombre("Jorge");
        gerente.setTipo(1);
        gerente.setClave("AluraCursosOnline");


        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
    }
}
