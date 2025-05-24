/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_dio_basico;

import java.util.List;

/**
 *
 * @author Windows 10 PRO
 */
public class Banco {
    private String nome;
    private List<Conta> contasList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContasList() {
        return contasList;
    }

    public void setContasList(List<Conta> contasList) {
        this.contasList = contasList;
    }
    
}
