/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contabanco;

/**
 *
 * @author Evandro
 */

// Conta Bancária
public class Conta {
    
    double saldo;
    
    void saca(double saque) {
        double novoSaldo = this.saldo - saque;
        this.saldo = novoSaldo;
    }
    
    void deposito (double deposita) {
        this.saldo += deposita;
    }
    
    
}
