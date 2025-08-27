public class gerente extends Funcionario {
    public gerente(String nome, double salarioBase) {
        super(nome, salarioBase);

    }
    @Override
    public double calcularPagamento() {
        return getsalarioBase() * 1.20;
    }
}