/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 *
 * @author Greg
 */
public class ElectronicsStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test implementation:
        StoreObject item = new StoreObject("name", "desc", 0, 0.0, 5, 0);   //Create sample item with a certain quantity
        Inventory.addToInventory(item); //Add it to the inventory
        item = Inventory.getItem(0);    //Get a copy of the item we just added
        item.setQuantityOnHand(10); //Set that item's quantity to 10
        Inventory.addToInventory(item); //Add this item to the inventory
        System.out.println(Inventory.getItem(0).getQuantityOnHand());   //Result is the sum of the quantities
    }
}
