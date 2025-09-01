// CartaoCredito.java
public class CartaoCredito implements PagamentoStrategy {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com Cartão de Crédito: " + numeroCartao);
    }
}
