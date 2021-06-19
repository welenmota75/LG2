// import java.io.BufferedInputStream;
import java.util.Date;
// import java.util.stream.Stream.Builder;

public class Usuario {

    // estados imutaveis
  String cpf; // chave unica
    Date nascimento;
    Endereco localDeNascimento;
    String nomePai;
    String nomeMae;
    
    // estado mutaveis
    String nome;
    String sexo;
    Endereco endereco;
    String temCartao;
    int comprasRealizadas;
    
    // construtor
    public Usuario( cpf, String nome, Date nascimento, String sexo) {
        this.cpf =cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }
    
    // CRUD - Create, Recover, Update, Delete
    
    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Endereco getLocalDeNascimento() {
		return localDeNascimento;
	}

	public void setLocalDeNascimento(Endereco localDeNascimento) {
		this.localDeNascimento = localDeNascimento;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTemCartao() {
		return temCartao;
	}

	public void setTemCartao(String temCartao) {
		this.temCartao = temCartao;
	}

	public int getComprasRealizadas() {
		return comprasRealizadas;
	}

	public void setComprasRealizadas(int comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}

	// comportamento
    public boolean mudarEndereco(Endereco novoEndereco) {
        boolean realizouCompra;
		// BufferedInputStream bufferDeLeitura; // busca de cep no site dos correios
        if (realizouCompra) {
            return false;
        }
        this.endereco = novoEndereco;
        return true;
    }
    
    public int realizouCompra() {
        // int idUltimaCompra;
        this.comprasRealizadas = this.comprasRealizadas + 1;
        return this.comprasRealizadas;
    }
}

