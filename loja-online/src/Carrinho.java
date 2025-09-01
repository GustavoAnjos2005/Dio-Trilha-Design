// Carrinho.java
public class Carrinho {
    private PagamentoStrategy metodoPagamento;

    public void setMetodoPagamento(PagamentoStrategy metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void finalizarCompra(double valor) {
        if (metodoPagamento == null) {
            System.out.println("Nenhum método de pagamento selecionado!");
        } else {
            metodoPagamento.pagar(valor);
        }
    }
}
