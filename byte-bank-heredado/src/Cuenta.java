public abstract class Cuenta {
    protected double saldo;
    private int agencia = 1;
    private int numero;

    private Cliente titular = new Cliente();

    private static int total=0;

    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        Cuenta.total ++;
        System.out.println("se van creando " + total);

    }
   /* public  Cuenta(int agencia){

        if (agencia <= 0){
            System.out.println("no se permiten numeros negativos");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        total++;
        System.out.println("se van creando " + total);
    }
*/

    public abstract void depositar( double valor );




    public void retirar (double valor) throws SaldoInsuficienteExepction {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteExepction("No tienes saldo");
        } this.saldo -= valor;

    }

    public boolean transferir( double valor,Cuenta cuenta){
        if (this.saldo >= valor){
        try {
            this.retirar(valor);
        }catch (SaldoInsuficienteExepction e){
            e.printStackTrace();
        }
            cuenta.depositar(valor);
            return true;
        }
        return false;

    }
    public double getSaldo(){
        return this.saldo;
    }



    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    public  static int getTotal(){
        return Cuenta.total;
    }


}

