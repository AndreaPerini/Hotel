
public class Azienda extends Cliente {

	private String nomeAzienda;
	private int partitaIVA;
	private String indirizzoFatturazione;

	public Azienda(String nome, String cognome, int numeroTelefono, String nomeAzienda, int partitaIVA,
			String indirizzoFatturazione) {
		super(nome, cognome, numeroTelefono);
		this.nomeAzienda = nomeAzienda;
		this.partitaIVA = partitaIVA;
		this.indirizzoFatturazione = indirizzoFatturazione;
	}

	public String getNomeAzienda() {
		return nomeAzienda;
	}

	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}

	public int getPartitaIVA() {
		return partitaIVA;
	}

	public void setPartitaIVA(int partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	public String getIndirizzoFatturazione() {
		return indirizzoFatturazione;
	}

	public void setIndirizzoFatturazione(String indirizzoFatturazione) {
		this.indirizzoFatturazione = indirizzoFatturazione;
	}
}