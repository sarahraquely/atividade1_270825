public class vendedor{
    public static final double COMISSAO_FIXA = 400.0;
    public class Vendedor extends Funcionario {
        private static final double COMISSAO_FIXA = 400.0;
    
        public Vendedor(String nome, double salarioBase) {
            super(nome, salarioBase);
        }
    
        @Override
        public double calcularPagamento() {
            return getsalarioBase() + COMISSAO_FIXA;
        }
    }
}