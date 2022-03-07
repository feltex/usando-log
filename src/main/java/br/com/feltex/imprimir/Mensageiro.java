package br.com.feltex.imprimir;

public class Mensageiro {

    public static void main(String[] args) {
        System.out.println("Iniciou o programa");

        try{
            Thread.sleep(5000);
            var x = 4 /0;

            System.out.println("Resultado da divisão é: " + x);
        }catch (ArithmeticException e){
            System.err.println("Ocorreu um erro na divisão " + e);
        } catch (InterruptedException e) {
            System.err.println("Erro de thread " + e);
        }

        System.out.println("Finalizou o programa!");
    }

}


