/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingjava;

/**
 *
 * @author Ronald Sianipar
 */
public class sebelumEx3 {
    public static void main(String[] args){
        byte [] b= new byte[5];
        System.out.print("Input Bilangan Bulat : ");
        try{
            System.in.read(b);
        }
        catch(java.io.IOException e);
        int N=Integer.valueOf(b).intValue();
        System.out.println("Hasil : "(N+2));
    }
}
