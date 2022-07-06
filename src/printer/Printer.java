/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printer;

/**
 *
 * @author cahuc
 */
public class Printer {
    
    public static void main(String[] args) {
        
        printFile(  new TextFile() );
        
    }
    
    public static void printFile( File file ){
        System.out.println("File: "+ file.getData() );
    }
    
}
