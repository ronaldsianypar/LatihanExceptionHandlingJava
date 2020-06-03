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
public class sesudahEx1 {
    public static void main(String[] args){
        try{
            System.out.print("Ketikan Huruf : ");
            char n = (char) System.in.read();
            System.out.println("Hasil : "+n);
        }
        catch(Exception e){
            printError(e);
        }
    }

    private static void printError(Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
