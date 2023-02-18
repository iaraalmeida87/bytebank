public class TestaMetodo { //testando se o métodos deposita funciona
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 200;
		contaDoPaulo.deposita(80);
		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(90);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
	}
}