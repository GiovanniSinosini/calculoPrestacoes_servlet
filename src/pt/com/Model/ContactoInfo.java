package pt.com.Model;

public class ContactoInfo {

	String nomeContacto;
	String contacto;
	String valorVeiculo;
	String tipoFinanc;
	String numPrest;
	String valorPrest;

	public ContactoInfo(String nomeContacto, String contacto, String valorVeiculo, String tipoFinanc, String numPrest,
			String valorPrest) {
		super();
		this.nomeContacto = nomeContacto;
		this.contacto = contacto;
		this.valorVeiculo = valorVeiculo;
		this.tipoFinanc = tipoFinanc;
		this.numPrest = numPrest;
		this.valorPrest = valorPrest;
	}

	public String getNomeContacto() {
		return nomeContacto;
	}

	public void setNomeContacto(String nomeContacto) {
		this.nomeContacto = nomeContacto;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getValorVeiculo() {
		return valorVeiculo;
	}

	public void setValorVeiculo(String valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	public String getTipoFinanc() {
		return tipoFinanc;
	}

	public void setTipoFinanc(String tipoFinanc) {
		this.tipoFinanc = tipoFinanc;
	}

	public String getNumPrest() {
		return numPrest;
	}

	public void setNumPrest(String numPrest) {
		this.numPrest = numPrest;
	}

	public String getValorPrest() {
		return valorPrest;
	}

	public void setValorPrest(String valorPrest) {
		this.valorPrest = valorPrest;
	}

	@Override
	public String toString() {
		return "Nome = " + nomeContacto + ", Contacto = " + contacto + ", Valor do Veiculo = "
				+ valorVeiculo + ", Tipo Financiamento = " + tipoFinanc + ", Numero Prestações = " + numPrest + ", Valor Prestacao = " + valorPrest
				+ "\n";
	}
}