// import java.io.BufferedInputStream;
import  java.util.Date ;
// import java.util.stream.Stream.Builder;

public  class  Usuario {

    // estados imutaveis
  String cpf; // chave unica
    Data de nascimento;
    Endereco localDeNascimento;
    String nomePai;
    String nomeMae;
    
    // estado mutaveis
    Nome da string ;
    String sexo;
    Endereco endereco;
    String temCartao;
    int comprasRealizadas;
    
    // construtor
    public  Usuario ( cpf , nome da string  , data de nascimento , sexo da string ) {  
        isso . cpf = cpf;
        isso . nome = nome;
        isso . nascimento = nascimento;
        isso . sexo = sexo;
    }
    
    // CRUD - Criar, Recuperar, Atualizar, Excluir
    
    public  String  getCpf () {
		return cpf;
	}

	public  void  setCpf ( String  cpf ) {
		isso . cpf = cpf;
	}

	public  Date  getNascimento () {
		return nascimento;
	}

	public  void  setNascimento ( data de  nascimento ) {
		isso . nascimento = nascimento;
	}

	public  Endereco  getLocalDeNascimento () {
		return localDeNascimento;
	}

	public  void  setLocalDeNascimento ( Endereco  localDeNascimento ) {
		isso . localDeNascimento = localDeNascimento;
	}

	public  String  getNomePai () {
		return nomePai;
	}

	public  void  setNomePai ( String  nomePai ) {
		isso . nomePai = nomePai;
	}

	public  String  getNomeMae () {
		return nomeMae;
	}

	public  void  setNomeMae ( String  nomeMae ) {
		isso . nomeMae = nomeMae;
	}

	public  String  getNome () {
		return nome;
	}

	public  void  setNome ( String  nome ) {
		isso . nome = nome;
	}

	public  String  getSexo () {
		retorno sexo;
	}

	public  void  setSexo ( String  sexo ) {
		isso . sexo = sexo;
	}

	public  Endereco  getEndereco () {
		return endereco;
	}

	public  void  setEndereco ( Endereco  endereco ) {
		isso . endereco = endereco;
	}

	public  String  getTemCartao () {
		return temCartao;
	}

	public  void  setTemCartao ( String  temCartao ) {
		isso . temCartao = temCartao;
	}

	public  int  getComprasRealizadas () {
		return comprasRealizadas;
	}

	public  void  setComprasRealizadas ( int  comprasRealizadas ) {
		isso . comprasRealizadas = comprasRealizadas;
	}

	// comportamento
     mudarEndereco booleano  público ( Endereco novoEndereco ) { 
        booleana realizouCompra;
		// BufferedInputStream bufferDeLeitura; // busca de cep no site dos correios
        if (realizouCompra) {
            return  false ;
        }
        isso . endereco = novoEndereco;
        return  true ;
    }
    
    público  int  realizouCompra () {
        // int idUltimaCompra;
        isso . comprasRealizadas =  isso . comprasRealizadas +  1 ;
        devolva  isso . comprasRealizadas;
    }
}