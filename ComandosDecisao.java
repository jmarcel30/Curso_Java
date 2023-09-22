public class ComandosDecisao {
    public static void main(String[] args) {
        // comando if // 

        
        int num1 = 11;
        int num2 = 20;
        int  res = num1 + num2;

        if(res == 30){
            System.out.println("O valor é: " + res);
        } else{
            System.out.println("O valor esta incorreto");
        }
        

    // Condicional ternaria  (verdaeiro ou falso)

    //int idade = 18;
    //String  mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
    //System.out.println(mensagem);


    // switch

    int pos=1;

    switch(pos){
        case 1:
        System.out.println("Primeiro lugar");
        break;
        case 2: 
        System.out.println("Segundo lugar");
        break;

        default:
        System.out.println("Não chegou");
        break;
    }
    
 


    }
}
