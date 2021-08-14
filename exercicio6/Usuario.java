package exercicio6;
import  java.util.Date;

public class Usuario {
	
	    int idUsuario;  // chave unica
	    String cpf;
	    Date dataNasc;
	    Endereco localDeNascimento;
	    String nomePai;
	    String nomeMae;    
	    String nome;
	    String sexo;
	    Endereco endereco;
	    String temCartao;
	    boolean comprasRealizadas;
	    
	    // construtor
	    public  Usuario ( String cpf , String nome , Date datanasc , String sexo ) {  
	       this (cpf, nome, datanasc, sexo);
	    }
	    
	    // CRUD - Criar, Recuperar, Atualizar, Excluir
	    
	    public  int  getIdUsuario () {
			return idUsuario;
		}
	    public  int  setIdUsuario () {
			this.idUsuario = idUsuario;
		}
	    public  String  getCpf () {
			return cpf;
		}

		public  void  setCpf ( String  cpf ) {
			this. cpf = cpf;
		}

		public  Date  getDataNasc () {
			return dataNasc;
		}

		public  void  setDataNasc  ( Date dataNasc ) {
			this.dataNasc = dataNasc;
		}

		public  Endereco  getLocalDeNascimento () {
			return localDeNascimento;
		}

		public  void  setLocalDeNascimento ( Endereco  localDeNascimento ) {
			this.localDeNascimento = localDeNascimento;
		}

		public  String  getNomePai () {
			return nomePai;
		}

		public  void  setNomePai ( String  nomePai ) {
			this.nomePai = nomePai;
		}

		public  String  getNomeMae () {
			return nomeMae;
		}

		public  void  setNomeMae ( String  nomeMae ) {
			this.nomeMae = nomeMae;
		}

		public  String  getNome () {
			return nome;
		}

		public  void  setNome ( String  nome ) {
			this.nome = nome;
		}

		public  String  getSexo () {
			return sexo;
		}

		public  void  setSexo ( String  sexo ) {
			this.sexo = sexo;
		}

		public  Endereco  getEndereco () {
			return endereco;
		}

		public  void  setEndereco ( Endereco  endereco ) {
			this.endereco = endereco;
		}

		public  String  getTemCartao () {
			return temCartao;
		}

		public  void  setTemCartao ( String  temCartao ) {
			this.temCartao = temCartao;
		}

		public  Boolean  getComprasRealizadas () {
			return comprasRealizadas;
		}

		public  void  setComprasRealizadas ( Boolean  comprasRealizadas ) {
			this.comprasRealizadas = comprasRealizadas;
		}

	
	  public Boolean mudarEndereco ( Endereco novoEndereco ) { 
	      boolean realizouCompra;
			
	      if (comprasRealizadas) {
	          return  false;
	      }else {	      
	        return  true;
	      }
	    }
	    
	    public  boolean realizouCompra () {
	        
	        return  this(comprasRealizadas, temCartao);
	    }
	    
	  	
}