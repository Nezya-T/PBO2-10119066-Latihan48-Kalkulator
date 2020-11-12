/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan48.kalkulator;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariks
 * Nim      : 10119066
 * Kelas    : IF2
 */
public class PBO210119066Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);
        System.out.println("VALUE 1 = "+ kal.getValue1());
        System.out.println("VALUE 2 = "+ kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject("thia project shown you how to manage method in java");
        System.out.println("Result Add is \t\t = "+ kal.add(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Minus is \t = "+ kal.minus(kal.getValue1(), kal.getvalue2()));
        System.out.println("Result Multiplication is \t = "+ kal.multiplication(kal.getValue1(), kal.getvalue2()));
        System.out.println("Result Division is \t = "+ kal.division(kal.getValue1(), kal.getvalue2()));
        
    }
    
}
