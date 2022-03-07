package br.com.feltex.imprimir;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MensageiroVersao2 {

    public static void main(String[] args) {
        log.info("Iniciou o programa");

        try{
            Thread.sleep(5000);
            var x = 4 /0;

            log.info("Resultado da divisão é: " + x);
        }catch (ArithmeticException e){
            log.error("Ocorreu um erro na divisão ", e);
        } catch (InterruptedException e) {
            log.error("Erro de thread ",  e);
        }
        log.info("Finalizou o programa!");


    }

}
