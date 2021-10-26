
package model;

/**
 *
 * @author Pancaldi
 */
public class Estaciona {
    private int codigo;
    private String cliente;
    private String placa;
    private String data;
    private String valor;

    public Estaciona(int codigo, String cliente, String placa, String data, String valor) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.placa = placa;
        this.data = data;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}

