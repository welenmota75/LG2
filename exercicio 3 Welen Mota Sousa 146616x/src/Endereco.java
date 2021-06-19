public class Endereco {
    
    private static final int Buscarendereco = 0;
	String pais;
    String estado;
    String cidade;
    String bairro;
    String rua;
    int numero;
    String cep;
    String complemento;
    
    public Endereco(String bairro,String cidade,String pais,String estado) {
    
    	this.bairro = bairro;
    	this.cidade = cidade;
    	this.pais = pais;
    	this.estado = estado;
    	
    	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public static int getBuscarendereco() {
		return Buscarendereco;
	}
		public boolean produto(Endereco novoproduto) {
            // BufferedInputStream bufferDeLeitura; // busca de cep no site dos correios
            if (novoproduto.cep == 0) {
                return false;
            }
            this.produto = novoEndereco;
            return true;
            public int Buscarendereco() {
		        // int idUltimaCompra;
		        this.Buscarendereco = this.Buscarendereco() + 1;
		        return this.Buscarendereco;
        }
    }


