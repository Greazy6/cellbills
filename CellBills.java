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
        
        double [] electricBills = new double[6];
        
        electricBills[0] = 24.69;
        electricBills[1] = 42.49;
        electricBills[2] = 72.89;
        electricBills[3] = 12.69;
        electricBills[4] = 32.99;
        electricBills[5] = 77.36;
        
        System.out.println("Here is a list of all the bills " + cellBills[0] + " " + cellBills[1] + " " + cellBills[2] + " " + cellBills[3] + " " + cellBills[4] + " " + cellBills[5] );
        
        
        System.out.println("The first montly bill is " + cellBills[0]);
        
        System.out.println("The last monthly cell bill is " + cellBills[cellBills.length - 1]);
        
        System.out.println("A random sampling of cell bills " + cellBills[1] + " and " + cellBills[3]);
        
        System.out.println("Here is another sampling of cell Bills " + cellBills[4]);
        
        for (int i =0; i < cellBills.length; i++){
            System.out.println("Here is the list of info print from a for loop " + cellBills[i]);
        }
        
        System.out.println("Now lets try electric bills ");
        
        System.out.println("First Months Bill in the array " + electricBills[0]);
        
        System.out.println("Now lets try the last months bill in the array " + electricBills[electricBills.length - 1]);
        
        for (int i = 0; i < electricBills.length; i++){
            System.out.println("Here is the list of the electric bills fun thru a for loop " + electricBills[i]);
        }
        
        
        System.out.println("Lets try both bills first in each of the arrays " + cellBills[0] + " " + electricBills[0]);
        
        System.out.println("Now lets try the last item in each array " + cellBill[cellBills]);
        
    }
    
}
