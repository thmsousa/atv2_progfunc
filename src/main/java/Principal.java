import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        Cidade cidadeMutavel = new Cidade("São Paulo");
        cidadeMutavel.setNome("Rio de Janeiro");

        CidadeRecord cidadeImutavel = new CidadeRecord("Brasília");

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidadeMutavel);

        PessoaRecord pessoaImutavel = new PessoaRecord("Maria", cidadeImutavel);

        System.out.println("Pessoa com cidade mutável:");
        System.out.println("Nome: " + pessoaShallow.nome());
        System.out.println("Cidade: " + pessoaShallow.cidade().getNome());

        System.out.println("\nPessoa com cidade imutável: ");
        System.out.println("Nome: " + pessoaImutavel.nome());
        System.out.println("Cidade: " + pessoaImutavel.cidade().nome());
    }
}