package luanac.pessoas;

import luanac.composicao.Profissao;
import luanac.composicao.Endereco;
import luanac.composicao.Telefone;
import luanac.composicao.Cargo;

import java.util.Scanner;

public class Cliente extends Pessoa{
    private String codigo;
    private Profissao profissao;
    private String tipoProfissaoOutros;
    private Scanner leitor = new Scanner(System.in);
    private Cargo cargo;
    Double salario;


    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe o código do cliente: ");
        this.codigo = leitor.nextLine();
        System.out.println("Informe a profissão do cliente: ");
        Profissao profissao = Profissao.valueOf(leitor.nextLine());
        if(profissao == Profissao.OUTROS){
            System.out.println(("Informe sua profissão: "));
            this.tipoProfissaoOutros = leitor.nextLine();

            System.out.println("Informe o salário do cliente: ");
            this.salario = leitor.nextDouble();
        }

    }

    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\'' +
                ", profissao=" + profissao +
                ", tipoProfissaoOutros='" + tipoProfissaoOutros + '\'' +
                "cargo=" + cargo + cargo;
                };
    }


