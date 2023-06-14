package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private Cliente cliente;
    private Double saldo = 0.0;
    private String numeroConta;
    private String numeroAgencia;
    private boolean ativa = true;
    private List<Transacao> transacoes = new ArrayList<>();


    public ContaBancaria(Cliente cliente, String numeroConta, String numeroAgencia) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }


    void depositar(Double valor) {
        if (valor >= 0 && isAtiva()) {
            saldo = saldo + valor;
            incluirTransacao(valor, "Depósito em Conta", "DEPÓSITO");
        }
        return;

    }


    boolean sacar(Double valor) {
        if (valor >= 0 && isAtiva()) {
            saldo = saldo - valor;
            incluirTransacao(valor, "Saque da conta", "SAQUE");
            return true;
        }
        else {
            return false;
        }


    }


    Double consultarSaldo() {
        return saldo;
    }


    void cancelarConta(String justificativa) {
        if (saldo == 0) {
            ativa = false;
            incluirTransacao(0.00, "Conta cancelada", "CANCELAMENTO");
        }
        else {
            System.out.println("Não foi possível realizar o cancelamento, consulte o seu gerente.");
            incluirTransacao(saldo, "Conta possui saldo", "FALHA CANCELAMENTO");
        }
    }



    void transferir(ContaBancaria contaDestino, Double valor) {
        if (valor >= saldo) {
            contaDestino.depositar(valor);
            this.sacar(valor);
        }

        incluirTransacao(valor, "Transferência de valor", "TRANSFERÊNCIA");
    }

    void consultarExtrato() {
        for (Transacao transacao : transacoes) {
            transacao.toString();
        }
    }

    // Consultar extrato entre duas datas
    /*Transacao consultarExtrato(LocalDate dataInicio, LocalDate dataFim) {
        int dia = 0;
        if ()
        }



        }
    }*/




    void incluirTransacao(Double valor, String descricao, String tipo) {
        Transacao t = new Transacao();

        t.data = LocalDate.now();
        t.tipo = tipo;
        t.descricao = descricao;
        t.valor = valor;
        transacoes.add(t);

    }



}
