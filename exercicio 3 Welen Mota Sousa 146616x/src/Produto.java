
public class Produto{
	private static final int ComprarProduto = 0;
	String Nome;
	Double preco;
	Double desconto;
	Interger codigo;
	Boolean ativo;
	String tipo;
	private Endereco endereco;
	
	public void produto (Interger codigo,Boolean ativo,String tipo) {
		this.ativo = ativo;
		this.codigo = codigo;
		this.tipo = tipo;
		
		   public boolean mudarEndereco(Endereco novoEndereco) {
		        // BufferedInputStream bufferDeLeitura; // busca de cep no site dos correios
		        if (novoEndereco.cep == 0) {
		            return false;
		        }
		        this.endereco = novoEndereco;
		        return true;
		    }
		    
		    public int ComprarProduto() {
		        // int idUltimaCompra;
		        this.ComprarProduto = this.ComprarProduto + 1;
		        return this.ComprarProduto;
		    }
			public String getNome() {
				return Nome;
			}
			public void setNome(String nome) {
				Nome = nome;
			}
			public Double getPreco() {
				return preco;
			}
			public void setPreco(Double preco) {
				this.preco = preco;
			}
			public Double getDesconto() {
				return desconto;
			}
			public void setDesconto(Double desconto) {
				this.desconto = desconto;
			}
			public Interger getCodigo() {
				return codigo;
			}
			public void setCodigo(Interger codigo) {
				this.codigo = codigo;
			}
			public Boolean getAtivo() {
				return ativo;
			}
			public void setAtivo(Boolean ativo) {
				this.ativo = ativo;
			}
			public String getTipo() {
				return tipo;
			}
			public void setTipo(String tipo) {
				this.tipo = tipo;
			}
			public Endereco getEndereco() {
				return endereco;
			}
			public void setEndereco(Endereco endereco) {
				this.endereco = endereco;
			}
			public static int getComprarproduto() {
				return ComprarProduto;
			}
		
	}