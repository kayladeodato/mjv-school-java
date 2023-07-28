package br.com.mjv;

import br.com.mjv.model.*;
import br.com.mjv.util.ConfigurarLayout;

import java.time.LocalDate;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        Cadastro cadastro01 = new Cadastro(1, new Candidato(),new Profissao());
        cadastro01.getCandidato().setNome("Maria dos Santos");
        cadastro01.getCandidato().setCpf("014.023.685-99");
        cadastro01.getCandidato().setDataNascimento(LocalDate.of(1990,1,1));
        cadastro01.getCandidato().setSexo(Sexo.FEMININO);
        cadastro01.getCandidato().getContato().setEmail("maria@email.com");
        cadastro01.getCandidato().getContato().setTelefone(99302333333L);
        cadastro01.getCandidato().getContato().setCelular(99980803666L);
        cadastro01.getCandidato().getContato().setCelWhatsapp(true);
        cadastro01.getCandidato().getEndereco().setLogradouro("Avenida Santos");
        cadastro01.getCandidato().getEndereco().setNumero(360);
        cadastro01.getCandidato().getEndereco().setComplemento("Apto 200");
        cadastro01.getCandidato().getEndereco().setBairro("Mirante");
        cadastro01.getCandidato().getEndereco().setCidade("João Pessoa");
        cadastro01.getCandidato().getEndereco().setEstado("Paraíba");
        cadastro01.getProfissao().setCargo("Analista de Compras");
        cadastro01.getProfissao().setSalario(6000.00);
        cadastro01.getProfissao().setEmpregoAtual(true);
        cadastro01.getProfissao().setVinculoEmpregaticio(VinculoEmpregaticio.CLT);
        cadastro01.getProfissao().setPretensaoSalarialMin(6500.00);
        cadastro01.getProfissao().setPretensaoSalarialMax(8000.00);
        cadastro01.getProfissao().setHabilidades(List.of("Cotação de produtos", "Descontos com fornecedor"));

        Cadastro cadastro02 = new Cadastro(2, new Candidato(),new Profissao());
        cadastro02.getCandidato().setNome("José da Silva");
        cadastro02.getCandidato().setCpf("013.555.013-33");
        cadastro02.getCandidato().setDataNascimento(LocalDate.of(1985,2,2));
        cadastro02.getCandidato().setSexo(Sexo.MASCULINO);
        cadastro02.getCandidato().getContato().setEmail("jose@email.com");
        cadastro02.getCandidato().getContato().setTelefone(8530225588L);
        cadastro02.getCandidato().getContato().setCelular(85982226314L);
        cadastro02.getCandidato().getContato().setCelWhatsapp(true);
        cadastro02.getCandidato().getEndereco().setLogradouro("Rua Marina");
        cadastro02.getCandidato().getEndereco().setNumero(470);
        cadastro02.getCandidato().getEndereco().setComplemento("Casa amarela");
        cadastro02.getCandidato().getEndereco().setBairro("São João");
        cadastro02.getCandidato().getEndereco().setCidade("São Paulo");
        cadastro02.getCandidato().getEndereco().setEstado("São Paulo");
        cadastro02.getProfissao().setCargo("Vendedor");
        cadastro02.getProfissao().setSalario(7500.80);
        cadastro02.getProfissao().setEmpregoAtual(true);
        cadastro02.getProfissao().setVinculoEmpregaticio(VinculoEmpregaticio.PJ);
        cadastro02.getProfissao().setPretensaoSalarialMin(8500.00);
        cadastro02.getProfissao().setPretensaoSalarialMax(11000.00);
        cadastro02.getProfissao().setHabilidades(List.of("Levantamento de indicadores da área", "Alto desempenho de vendas"));

        ConfigurarLayout configuracao = new ConfigurarLayout();
        configuracao.gravarInformacoesCsv(cadastro01);
        configuracao.gravarInformacoesCsv(cadastro02);

    }
}
