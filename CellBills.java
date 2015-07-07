/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellbills;

/**
 *
 * @author ericgreise
 */
public class CellBills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] cellBills = new double [6];
        
        cellBills[0] = 45.24;
        cellBills[1] = 54.67;
        cellBills[2] = 42.55;
        cellBills[3] = 44.61;
        cellBills[4] = 65.29;
        cellBills[5] = 49.75;
        
        System.out.println("Here is a list of all the bills " + cellBills[0] + " " + cellBills[1] + " " + cellBills[2] + " " + cellBills[3] + " " + cellBills[4] + " " + cellBills[5] );
        
        
        System.out.println("The first montly bill is " + cellBills[0]);
        
        System.out.println("The last monthly cell bill is " + cellBills[cellBills.length - 1]);
        
        System.out.println("A random sampling of cell bills " + cellBills[1] + " and " + cellBills[3]);
        
        System.out.println("Here is another sampling of cell Bills " + cellBills[4]);
        
        
        
        
    }
    
}
