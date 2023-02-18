public class TestaMetodo { //testando se o métodos deposita funciona
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 200;
		contaDoPaulo.deposita(80);
		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(90);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);

        if(sucessoTransferencia) {
        		System.out.println("transferencia com sucesso");
        	} else {
        		System.out.println("faltou dinheiro");
        	}
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo); 
    }
}