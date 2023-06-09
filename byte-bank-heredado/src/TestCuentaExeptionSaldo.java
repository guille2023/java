public class TestCuentaExeptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta =new CuentaAhorros( 123,456);
        cuenta.depositar(200);
        try {
            cuenta.retirar(210);
        }catch (SaldoInsuficienteExepction e){
            e.printStackTrace();
        }

    }
}
