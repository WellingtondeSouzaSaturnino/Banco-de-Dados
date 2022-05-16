
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	@Override
	public void imprimirLista() {
		System.out.println("=== Lista de Clientes Conta Poupança ===");
		super.lista();
	}
}
