/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_dio_basico;

/**
 *
 * @author Windows 10 PRO
 */
public class Main {

    
    public static void main(String[] args) {
       Cliente isaque = new Cliente();
       isaque.setNome("Isaque");
        
        
            
        Conta cc = new ContaCorrente(isaque);
        Conta cc2 = new ContaCorrente(isaque);
        Conta poupanca = new ContaPoupanca(isaque);
        
         
        
        cc.depositar(100);
        cc.transferir(100,poupanca);
        cc.imprimirExtrato();
        cc2.imprimirExtrato();
        poupanca.imprimirExtrato();
                
    }
}
