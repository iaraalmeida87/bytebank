
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //criando o primeiro objeto
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.agencia = 8545;
		System.out.println(primeiraConta.agencia);
		
		primeiraConta.numero = 19008;
		System.out.println(primeiraConta.numero);
		
		primeiraConta.titular = "Angela";
		System.out.println(primeiraConta.titular);
		
		primeiraConta.saldo += 100; //acrescentando valor ao saldo anterior
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta(); //criação de um novo objeto
		segundaConta.saldo = 100;
		System.out.println(segundaConta.saldo);
		
		segundaConta.agencia = 4178;
		System.out.println(segundaConta.agencia);
		
		segundaConta.numero = 475863;
		System.out.println(segundaConta.numero);
		
		segundaConta.titular = "Heitor";
		System.out.println(segundaConta.titular);
		
		segundaConta.saldo += 400; //Acrescentando valor ao atributo saldo do objeto segundaConta
		System.out.println(segundaConta.saldo);
		
		Conta terceiraConta = primeiraConta; //referência ao mesmo objeto
		terceiraConta.saldo = 475;
		System.out.println(terceiraConta);
		System.out.println(primeiraConta); //ambos saem com mesmo código pois são referências do mesmo objeto
	}
}