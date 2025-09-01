// Boleto.java
public class Boleto implements PagamentoStrategy {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Gerando boleto de R$" + valor + " com código de barras: " + codigoBarras);
    }
}
