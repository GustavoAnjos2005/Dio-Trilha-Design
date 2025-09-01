// Pix.java
public class Pix implements PagamentoStrategy {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " via PIX para a chave: " + chavePix);
    }
}
