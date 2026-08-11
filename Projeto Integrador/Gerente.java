package projeto.integrador;

public class Gerente extends Funcionario {

    private String setor;
    private double bonus;

    public Gerente() {
        super();
        setCargo("Gerente");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void mostrarDados() {
              System.out.println("---------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salario: R$ " + getSalario());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Setor: " + setor);
        System.out.println("Bonus: R$ " + bonus);
        System.out.println("---------------------------");

    }
}