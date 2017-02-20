package lista2;

public class TesteCartao {

	public static void main(String[] args) {

		Cartao cartao = new Cartao(789);
		Conta conta = new Conta(123, "Pedro", 1000, 1000, 3000);

		cartao.sacar(conta, 789, 400);
		System.out.println(conta.saldo());

		cartao.mudarSenha(789, 111);

		cartao.sacar(conta, 111, 100);
		System.out.println(conta.saldo());


	}

}
