package loja;

public class eletronico extends produto {
    private int garantia;

    public eletronico(String nome, double preco, int estoque, int garantia) {
        super(nome, preco, estoque);
        this.garantia = garantia;
    }

    public void calcularGarantiaRestante(int mesesDecorridos) {
        int restante = garantia - mesesDecorridos;

        if (restante > 0) {
            System.out.println("Restam " + restante + " meses de garantia.");
        } else {
            System.out.println("O produto não está mais coberto pela garantia.");
        }
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Garantia: " + garantia + " meses");
    }
}