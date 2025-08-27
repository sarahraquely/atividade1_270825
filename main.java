import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Marianaconta1", 1000.0));
        funcionarios.add(new gerente("Marianaconta2", 2000.0));
        funcionarios.add(new Funcionario("Marianaconta3", 3000.0));
        funcionarios.add(new gerente("Marianaconta4", 4000.0));

        System.out.println("Relatório de Pagamentos:");
        System.out.println("-------------------------");

        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s, Pagamento Total: R$ %.2f\n", f.getNome(), f.calcularPagamento());
        }
    }
}