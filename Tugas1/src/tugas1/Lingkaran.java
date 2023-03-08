/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author LENOVO
 */
public class Lingkaran implements MenghitungBidang{
    double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double luasbidang() {
        return Math.PI*jari*jari;
    }
    
    @Override
    public double keliling() {
        return 2*Math.PI*jari;
    }}
