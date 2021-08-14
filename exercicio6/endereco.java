package exercicio6;
public class Endereco {
	
	 private  static  final  int Buscarend =  0 ;
	 
	 String rua;
	 String complemento;
	 String bairro;
	 String cidade;
	 int cep;
	 String estado;
	 String pais;	  	
	 int num;
	    	        
  public  Endereco ( String  bairro , String  cidade, String estado, String  pais ) {
		} {
	    
	   this. bairro = bairro;
	   this. cidade = cidade;
	   this. estado = estado;
	   this. pais = pais;	    	
	    	
	    public  String getPais () {
			return pais;
		}
		public  void setPais ( String pais) {
			this.pais = pais;
		}
		public  String getEstado () {
			return estado;
		}
		public  void setEstado ( String estado) {
			this. estado = estado;
		}
		public  String getCidade () {
			return cidade;
		}
		public  void setCidade ( String cidade) {
			this. cidade = cidade;
		}
		public  String getBairro () {
			return bairro;
		}
		public  void setBairro (String bairro ) {
			this.bairro = bairro;
		}
		public  String getrua () {
			return rua;
		}
		public  void setrua ( String rua) {
			this. rua = rua;
		}
		public  int getNum () {
			return num;
		}
		public  void setNum ( int numero) {
			this.num = numero;
		}
		public  int getCep () {
			return cep;
		}
		public  void setCep ( int cep) {
			this.cep = cep;
		}
		public  String getComplemento () {
			return complemento;
		}
		public  void setComplemento ( String complemento) {
			this.complemento = complemento;
		}
		public  static  int getBuscarend () {
			return  Buscarend ;
		}
			public  boolean produto ( Endereco novoproduto) {	            
	            if (novoproduto.cep ==  0 ) {
	                return  false;
	            }else {
	                 return  true;
	            }
	            public  int Buscarend () {			        
			        this.Buscarend  =  this.Buscarend() +  1 ;
			        return  this.Buscarend();
	    }

}
