/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_dio_basico;

/**
 *
 * @author Windows 10 PRO
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

  

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInfosComuns();
    }
    
    
    
    
    
}
