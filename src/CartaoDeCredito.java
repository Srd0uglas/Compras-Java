import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import  java.util.List;
public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

//    para criar o cartão de crédito eu preciso já definir um limite

    public CartaoDeCredito(double limite) {
        this.limite = limite;
//        inciar a variável saldo com um limite
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

//    método para adicionar as compras na minha lista
    public boolean lancaCompra(Compra compra){
//        meu saldo é maior que a compra?
        if(this.saldo>compra.getValor()){
//            subtraio do saldo o valor da compra
            this.saldo -= compra.getValor();
//            adicionando na lista
            this.compras.add(compra);
            return  true;
        }
        return  false;
    }

//    quero ver a lista de compras, então eu vou fazer geters
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
