import java.util.Scanner;
public class CriarArray {
    public static void main(String[] args) {
        // criando array
        /*int[] num=new int[5];
        int [] numeros={10,20,30,40,50};

        num[0]=100;
        num[1]=45;
        num[3]=12;
        num[2]=1000;
        num[4]=152;
        
        for(int i=0;i<5;i++){
        System.out.printf("%d - " ,num[i]);
        }   */
         final int tam=5;
        char[] gabarito={'a', 'd', 'd', 'c', 'e'};
        char[]respostas=new char[tam];
        int nota = 0;

        respostas[0]='a';
        respostas[1]='d';
        respostas[2]='d';
        respostas[3]='c';
        respostas[4]='a';

        for(int i=0;i<tam;i++){
            if(respostas[i] == gabarito[i]){
            nota++;
        }
    }

    System.out.printf("A nota do aluno é " + nota);

    }
}
