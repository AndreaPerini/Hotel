
public class Camera {

	private float prezzoMinimo;
	private float prezzoMassimo;
	private int numeroPostiLetto;
	private Cliente[] clienti = new Cliente[365];

	public Camera(float prezzoMinimo, float prezzoMassimo, int numeroPostiLetto) {
		this.prezzoMinimo = prezzoMinimo;
		this.prezzoMassimo = prezzoMassimo;
		this.numeroPostiLetto = numeroPostiLetto;
		for (int i = 0; i < clienti.length; i++) {
			clienti[i] = null;
		}
	}

	public Camera() {
	}

	public float getPrezzoMinimo() {
		return prezzoMinimo;
	}

	public void setPrezzoMinimo(float prezzoMinimo) {
		this.prezzoMinimo = prezzoMinimo;
	}

	public float getPrezzoMassimo() {
		return prezzoMassimo;
	}

	public void setPrezzoMassimo(float prezzoMassimo) {
		this.prezzoMassimo = prezzoMassimo;
	}

	public int getNumeroPostiLetto() {
		return numeroPostiLetto;
	}

	public void setNumeroPostiLetto(int numeroPostiLetto) {
		this.numeroPostiLetto = numeroPostiLetto;
	}

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}

}
