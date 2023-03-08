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
public class PersegiPanjang implements MenghitungBidang{
    double panjang;
    double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luasbidang(){
        return panjang*lebar;
    }
    
    @Override
    public double keliling(){
        return (panjang*2)+(lebar*2); 
    }
    
}
