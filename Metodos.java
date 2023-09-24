public class Metodos {
    public static void main(String[] args) {
        //chamda do metodo


        // pode passar mais de um parametro

        int r;
        //criando um metodo simples 
        exemplo();

        // metodo com parametro de entrada
        msg("Ola mundo ");

        // pode passar mais de um parametro
        msg2("Jmarcel", 6);

        // metodos de saida 
        r = soma(100, 500);
        System.out.println(r);
        
         // somar varios numeros 
        System.out.println(somar(10,1,50,5,633,844,5,654,12,145));
        System.out.println(somar(2.5,6.8));
    }
// criando um metodo simples 
    public static void exemplo(){
        int num = 100;
        int num2 = 230;
        int res = num + num2;

        System.out.println(res);
    }
// metodo com parametro de entrada
    public static void msg(String m){
        System.out.println(m);
    }

    // pode passar mais de um parametro


    public static void msg2(String a, int l){

        for(int i=0;i<l;i++){
            System.out.println(a);
        }

    

    }


    //medotos de saida 
    public static int soma(int n1, int n2){
        int res = n1*n2;
        return res;

    }    
   // somar varios numeros com array 
    public static int somar(int... numeros){
        int res = 0;
        for (int n:numeros){
        res+= n;
    }
    return res;
}

// Sobre carga ==> são medotos com mesmo nome mas com tipos de valores de entrada diferentes. 
    public static Double somar(Double... numeros){
        Double res = 0.0;
        for (Double n:numeros){
        res+= n;
    }
    return res;
}
    


}
