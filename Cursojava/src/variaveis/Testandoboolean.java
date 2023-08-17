package variaveis;

public class Testandoboolean {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");
		int idade = 10;
		int quantidadePessoa = 3;
		boolean acompanhado = quantidadePessoa >=2;
		
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Sua idade é " + idade + " anos você Pode comorar a bebida");
		} else {
			
				System.out.println("Sua idade é "+idade+" Você não pode comprar bebidas ");
				System.out.println("Pois e de menor e esta desacompanhado");
			}
			
			}
}
