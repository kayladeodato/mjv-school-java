package br.com.mjv.util;

import br.com.mjv.model.Cadastro;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ConfigurarLayout {

    public String escreverLayout (Cadastro cadastro) {

        StringBuilder informacoesCadastro = new StringBuilder();

        informacoesCadastro.append("ID");
        informacoesCadastro.append("NOME");
        informacoesCadastro.append("CPF");
        informacoesCadastro.append("DATA NASCIMENTO");
        informacoesCadastro.append("SEXO");
        informacoesCadastro.append("EMAIL");
        informacoesCadastro.append("TELEFONE");
        informacoesCadastro.append("CELULAR");
        informacoesCadastro.append("CELULAR WHATSAPP?");
        informacoesCadastro.append("LOGRADOURO");
        informacoesCadastro.append("NUMERO");
        informacoesCadastro.append("COMPLEMENTO");
        informacoesCadastro.append("BAIRRO");
        informacoesCadastro.append("CIDADE");
        informacoesCadastro.append("ESTADO");
        informacoesCadastro.append("CARGO");
        informacoesCadastro.append("SALARIO");
        informacoesCadastro.append("EMPREGO ATUAL?");
        informacoesCadastro.append("VINCULO EMPREGATICIO");
        informacoesCadastro.append("PRETENSAO SALRIAL MINIMA");
        informacoesCadastro.append("PRETENSAO SALRIAL MAXIMA");
        informacoesCadastro.append("HABILIDADES").append("\n");

        informacoesCadastro.append(cadastro.getId() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getNome() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getCpf() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getDataNascimento() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getSexo() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getContato().getEmail() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getContato().getTelefone() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getContato().getCelular() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getContato().isCelWhatsapp() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getEndereco().getLogradouro() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getEndereco().getNumero() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getEndereco().getComplemento() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getEndereco().getBairro() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getEndereco().getCidade() + ";");
        informacoesCadastro.append(cadastro.getCandidato().getEndereco().getEstado() + ";");
        informacoesCadastro.append(cadastro.getProfissao().getCargo() + ";");
        informacoesCadastro.append(cadastro.getProfissao().getSalario() + ";");
        informacoesCadastro.append(cadastro.getProfissao().isEmpregoAtual() + ";");
        informacoesCadastro.append(cadastro.getProfissao().getVinculoEmpregaticio() + ";");
        informacoesCadastro.append(cadastro.getProfissao().getPretensaoSalarialMin() + ";");
        informacoesCadastro.append(cadastro.getProfissao().getPretensaoSalarialMax() + ";");
        informacoesCadastro.append(cadastro.getProfissao().getHabilidades() + ";");

        return String.valueOf(informacoesCadastro);

    }

}
