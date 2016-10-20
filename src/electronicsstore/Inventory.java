/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.util.ArrayList;

/**
 * 
 * @authors Zachary Kirchens, Gregory Salazar
 */
public abstract class Inventory 
{
    //Variables-----------------------------------------------------------------
    private static String name = "Store Inventory";
    private static String description = "The store's entire inventory, which holds all items currently in stock";
    private static final ArrayList<StoreObject> inventoryList = new ArrayList<>();
    
    //Mutators------------------------------------------------------------------
    public static final void setName(String sName)
    {
        name=sName;
    }
    public static final void setDescription(String sDescription)
    {
        description=sDescription;
    }
    public static void addToInventory(StoreObject item)
    {/*The "addToInventory" Method: This method takes a StoreObject argument, 
        "item", which is then added to the "inventoryList" ArrayList object 
        using said object's "remove" method*/
     //If the item already exists in the inventory then the quantityOnHand variable is updated
        for (StoreObject lItem : inventoryList) {
            if (lItem.equals(item)) {
                lItem.setQuantityOnHand(lItem.getQuantityOnHand() + item.getQuantityOnHand());  //Adds the two quantities to the existing item in list
                return;
            }
        }
        inventoryList.add(item);
    }
    public static void removeFromInventory(StoreObject item)
    {/*The "removeFromInventory" Method: This method takes a StoreObject 
        argument, "item", which is then removed from the "inventoryList" 
        ArrayList object, using said object's "remove" method*/
        inventoryList.remove(item);
    }
    
    
    //Accessors-----------------------------------------------------------------
    public static String getName()
    {
        return name;
    }
    
    public static String getDescription()
    {
        return description;
    }
    
    //Returns a copy of the item of the specified item number to ensure the original list is not modified
    //Returns null if no such item exists
    public static StoreObject getItem(int itemNumber) {
        for (StoreObject item : inventoryList) {
            if (item.getItemNumber() == itemNumber) {
                return item.copy();
            }
        }
        return null;
    }
}
