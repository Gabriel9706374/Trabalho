package projeto.integrador;

public abstract class Funcionario {

    private static int contador = 1;

    private int id;
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;

    public Funcionario() {

        id = contador;
        contador++;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void mostrarDados() {

        System.out.println("---------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("---------------------------");

    }
}