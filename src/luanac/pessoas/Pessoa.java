package luanac.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import luanac.composicao.Endereco;
import luanac.composicao.Telefone;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Telefone telsContato;

    private Scanner leitor = new Scanner(System.in);

    public void cadastrar() {
        System.out.println("Informe o nome: ");
        this.nome = leitor.nextLine();
        System.out.println("Informe a data de nascimento! ");
        int dia, mes, ano;
        do {
            System.out.println("Informe o dia (1-31): ");
            dia = leitor.nextInt();
        } while (dia < 1 || dia > 31);
        do {
            System.out.println("Informe o mês (1-12): ");
            mes = leitor.nextInt();
        } while (mes < 1 || mes > 12);
        System.out.println("Informe o ano: ");
        ano = leitor.nextInt();
        this.dataNascimento = LocalDate.of(ano, mes, dia);
        this.endereco = new Endereco();
        this.endereco.cadastrar();
        this.telsContato = new Telefone();
        this.telsContato.cadastrar();
    }

    public int obterIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(this.dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        this.telsContato = telsContato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                ", telsContato=" + telsContato +
                '}';
    }
}
