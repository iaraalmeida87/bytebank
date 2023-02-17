
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.agencia = 8545;
		System.out.println(primeiraConta.agencia);
		primeiraConta.numero = 19008;
		System.out.println(primeiraConta.numero);
		primeiraConta.titular = "Angela";
		System.out.println(primeiraConta.titular);
	}
}