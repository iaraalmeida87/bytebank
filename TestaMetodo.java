public class TestaMetodo { //testando se o métodos deposita funciona
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 200;
		contaDoPaulo.deposita(80);
		
		System.out.println(contaDoPaulo.saldo);
	}
}
