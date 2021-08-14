package exercicio6;

public class Produto {
	
	   public Produto(String nome, int codProduto, String tipoProduto, float preco, float desconto, Boolean ativo, Endereco endereco, int codProd, String tipoProd) {
				super();
		Nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.codProduto = codProd;
		this.ativo = ativo;
		this.tipoProduto = tipoProd;
		this.endereco = endereco;
	  }	
		
	   private static int CompraProd = 0;
	   String Nome;
	   Boolean ativo;
	   int codProduto;
	   String tipoProduto;
	   float preco;
	   float desconto;  
	   private Endereco endereco;
		    
		    public void produto (int codProduto,Boolean ativo,String tipoProduto) {
		        this.ativo = ativo;
		        this.codProduto = codProduto;
		        this.tipoProduto = tipoProduto;
		    }
		        
		    public boolean alterarEndereco(Endereco novoEndereco){	                
		           if (novoEndereco.cep == 0) {
		               return false;
		           }else {
		               return true;
		           }
		    }
		            
		    public int ComprarProduto() {
		              
		         this.CompraProd = this.CompraProd + 1;
		                return this.CompraProd;
		    }
		            public String getNome() {
		                return Nome;
		            }
		            public void setNome(String nome) {
		                Nome = nome;
		            }
		            public float getPreco() {
		                return preco;
		            }
		            public void setPreco(float preco) {
		                this.preco = preco;
		            }
		            public float getDesconto() {
		                return desconto;
		            }
		            public void setDesconto(float desconto) {
		                this.desconto = desconto;
		            }
		            public int getCodigo() {
		                return codProduto;
		            }
		            public void setCodigo(int codigo) {
		                this.codProduto = codigo;
		            }
		            public Boolean getAtivo() {
		                return ativo;
		            }
		            public void setAtivo(Boolean ativo) {
		                this.ativo = ativo;
		            }
		            public String getTipoProduto() {
		                return tipoProduto;
		            }
		            public void setTipoProduto(String tipo) {
		                this.tipoProduto = tipoProduto;
		            }
		            public Endereco getEndereco() {
		                return endereco;
		            }
		            public void setEndereco(Endereco endereco) {
		                this.endereco = endereco;
		            }
		            public static int getComprarproduto() {
		                return CompraProd;
		            }

	}