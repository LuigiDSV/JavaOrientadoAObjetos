import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DadosCompra {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Calendar dataCompra = Calendar.getInstance();
    private String itemCompra;
    private double valorVenda;

    public void PegarData (){
        System.out.println(sdf.format(dataCompra.getTime()));
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public Calendar getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Calendar dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getItemCompra() {
        return itemCompra;
    }

    public void setItemCompra(String itemCompra) {
        this.itemCompra = itemCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

}
// Quando um cliente faz uma compra, a mesma é armazenada, mantendo informação
// sobre o cliente que fez a compra, a data da compra, o valor total e os
// produtos comprados.