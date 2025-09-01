// Main.java
public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        // Pagamento com cartão
        carrinho.setMetodoPagamento(new CartaoCredito("1234-5678-9876-5432"));
        carrinho.finalizarCompra(250.00);

        // Pagamento com Pix
        carrinho.setMetodoPagamento(new Pix("meuemail@exemplo.com"));
        carrinho.finalizarCompra(150.00);

        // Pagamento com Boleto
        carrinho.setMetodoPagamento(new Boleto("34191.79001 01043.510047 91020.150008 4 12340000025000"));
        carrinho.finalizarCompra(350.00);
    }
}
