package br.furb.dsc;

public class InformacaoCEP {

	private String cep;

	private String estado;

	private String endereco;

	private String bairro;

	private String cidade;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "InformacaoCEP [cep=" + cep + ", estado=" + estado + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade
				+ "]";
	}
}
