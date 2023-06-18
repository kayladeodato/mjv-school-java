package br.com.mjv;

import br.com.mjv.model.Cadastro;
import br.com.mjv.model.Sexo;
import br.com.mjv.model.VinculoEmpregaticio;
import br.com.mjv.util.ConfigurarLayout;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        Cadastro cadastro01 = new Cadastro(1);
        cadastro01.getCandidato().setNome("Maria dos Santos");
        cadastro01.getCandidato().setCpf("014.023.685-99");
        cadastro01.getCandidato().setDataNascimento(LocalDate.of(1990,01,01));
        cadastro01.getCandidato().setSexo(Sexo.FEMININO);
        cadastro01.getCandidato().getContato().setEmail("maria@email.com");
        cadastro01.getCandidato().getContato().setTelefone(99302333333L);
        cadastro01.getCandidato().getContato().setCelular(99980803666L);
        cadastro01.getCandidato().getContato().setCelWhatsapp(true);
        cadastro01.getCandidato().getEndereco().setLogradouro("Rua das Flores");
        cadastro01.getCandidato().getEndereco().setNumero(360);
        cadastro01.getCandidato().getEndereco().setComplemento("Apto 200");
        cadastro01.getCandidato().getEndereco().setBairro("Mirante");
        cadastro01.getCandidato().getEndereco().setCidade("João Pessoa0");
        cadastro01.getCandidato().getEndereco().setEstado("Paraíba");
        cadastro01.getProfissao().setCargo("Analista de Compras");
        cadastro01.getProfissao().setSalario(6000.00);
        cadastro01.getProfissao().setEmpregoAtual(true);
        cadastro01.getProfissao().setVinculoEmpregaticio(VinculoEmpregaticio.CLT);
        cadastro01.getProfissao().setPretensaoSalarialMin(6500.00);
        cadastro01.getProfissao().setPretensaoSalarialMax(8000.00);
        cadastro01.getProfissao().setHabilidades(List.of("Cotação de produtos", "Descontos com fornecedor"));

        Path arquivoDestino = Paths.get("C:\\Projetos\\mjv-school-java\\Jobby\\lista-contatos.csv");
        ConfigurarLayout configurarLayout = new ConfigurarLayout();
        configurarLayout.wri

    }
}
