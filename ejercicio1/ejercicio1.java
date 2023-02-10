package ejercicio1;

public class ejercicio1 {

    public static void main(String[] args){

        for(int i = 1; i<101;i++){

            if(i%3 == 0){
                System.out.println(i+" fizz");
            }
            if(i%5 == 0){
                System.out.println(i+" buzz");
            }
            if((i%3 == 0) && (i%5 == 0)){
                System.out.println(i+" fizzbuzz");
            }
            else{
                System.out.println(i);
            }

        }     

    }
    
}