package petshop;

public class pet {

    public String nome;
    protected String especie;
    private int idade;
    private double peso;
    protected int energia = 50;
    private int fome = 50;
    public int felicidade = 50;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    public void alimentar(){
        fome = fome + 20;
        energia = energia - 5;

        if (fome > 100) {
            fome = 100;
        }

        if (energia < 0) {
            energia = 0;
        }

        System.out.println("O pet foi alimentado!");
    }

    public void brincar(){
        felicidade = felicidade + 20;
        energia = energia - 15;
        fome = fome - 10;

        if (felicidade > 100) {
            felicidade = 100;
        }

        if (energia < 0) {
            energia = 0;
        }

        if (fome < 0) {
            fome = 0;
        }

        System.out.println("O pet brincou!");
    }

    public void dormir(){
        energia = energia + 30;
        fome = fome - 10;

        if (energia > 100) {
            energia = 100;
        }

        if (fome > 100) {
            fome = 100;
        }

        System.out.println("O pet dormiu!");
    }

    public void verificarEstado(){
        if (felicidade >= 70) {
            System.out.println("Muito feliz");
        } else if (felicidade >= 40) {
            System.out.println("Feliz");
        } else {
            System.out.println("Triste");
        }

        if (energia < 20){
            System.out.println("O pet está cansado!");
        }
    }

    public void calcularBanho(){
        if (peso <= 5) {
            System.out.println("Valor do banho: R$ 30,00");
        } else if (peso <= 10) {
            System.out.println("Valor do banho: R$ 45,00");
        } else {
            System.out.println("Valor do banho: R$ 60,00");
        }
    }

    public void verificarSaude(){
        if (idade < 15 && peso > 1 && energia >= 30 && fome >= 30) {
            System.out.println("O pet está saudável!");
        } else {
            System.out.println("O pet não está saudável!");
        }
    }

    public void mostrarFicha(){
        System.out.println("\n" + "FICHA DO PET" + "\n");
        System.out.println("Nome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Energia: " + energia + "%");
        System.out.println("Alimentado: " + fome + "%");
        System.out.println("Felicidade: " + felicidade + "%");
        
        if (felicidade >= 70) {
            System.out.println("Estado: Muito feliz");
        } else if (felicidade >= 40) {
            System.out.println("Estado: Feliz");
        } else {
            System.out.println("Estado: Triste");
        }
    }
}