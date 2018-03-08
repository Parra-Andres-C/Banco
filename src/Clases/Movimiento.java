/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Date;
/**
 *
 * @author Parra G
 */
public class Movimiento {
    private java.util.Date fecha = new Date();
    private  double SaldoAnterior;
    private double monto;

    public Movimiento(double SaldoAnterior) {
        this.SaldoAnterior = SaldoAnterior;
    }
    public void Movimiento (){
        
    }
    public double getSaldoAnterior() {
        return SaldoAnterior;
    }

    public double getMonto() {
        return monto;
    }

    public void setSaldoAnterior(double SaldoAnterior) {
        this.SaldoAnterior = SaldoAnterior;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
     
}
