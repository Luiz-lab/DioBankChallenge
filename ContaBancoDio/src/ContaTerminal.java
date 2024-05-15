public class ContaTerminal {
    private int conta;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal(int conta, String agencia, String nomeCliente, Double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

}
