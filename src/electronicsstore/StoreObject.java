/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 *
 * @authors Zachary Kirchens, Gregory Salazar
 */
public class StoreObject 
{
    //Variables-----------------------------------------------------------------
    String name;
    String description;
    int itemNumber;
    double price;
    int quantityOnHand;
    int quantityOnOrder;
    //Constructors--------------------------------------------------------------
    public StoreObject(String sName, String sDescription, int iItemNumber,
            double dPrice, int iQuantityOnHand, int iQuantityOnOrder)
    {/*Advanced Constructor: This Constructor takes 6 arguments to set the 
        values for the 6 variables.
        This is done by calling the mutator methods: 
        variable "name" is set to argument "sName", which is of type String 
            using the "setName" method
        variable "description" is set to argument "sDescription", which is of 
            type String using the "setDescription" method
        variable "itemNumber" is set to argument "iItemNumber", which is of 
            type int using the "setItemNumber" method
        variable "price" is set to argument "dPrice", which is of type double 
            using the "setPrice" method
        variable "quantityOnHand" is set to argument "iQuantityOnHand", which 
            is of type int using the "setQuantityOnHand" method
        variable "quantityOnOrder" is set to argument "iQuantityOnOrder", which 
            is of type int using the "setQuantityOnOrder" method*/
        this.setName(sName);
        this.setDescription(sDescription);
        this.setItemNumber(iItemNumber);
        this.setPrice(dPrice);
        this.setQuantityOnHand(iQuantityOnHand);
        this.setQuantityOnOrder(iQuantityOnOrder);
    }
    
    
    //Mutators------------------------------------------------------------------
    public final void setName(String sName)
    {/*The "setName" Method: This method takes a String argument, "sName", 
        which is then applied to the "name" variable*/
        name=sName;
    }
    public final void setDescription(String sDescription)
    {/*The "getDescription" Method: This method takes a String argument, 
        "sDescription", which is then applied to the "description" variable*/
        description=sDescription;
    }
    public final void setItemNumber(int iItemNumber)
    {/*The "setItemNumber" Method: This method takes an int argument, 
        "iItemNumber", which is then applied to the "itemNumber" variable*/
        itemNumber=iItemNumber;
    }
    public final void setPrice(double dPrice)
    {/*The "setPrice" Method: This method takes a double argument, "dPrice", 
        which is then applied to the "price" variable*/
        price=dPrice;
    }
    public final void setQuantityOnHand(int iQuantityOnHand)
    {/*The "setQuantityOnHand" Method: This method takes an int argument, 
        "iQuantityOnHand", which is then applied to the "quantityOnHand" 
        variable*/
        quantityOnHand=iQuantityOnHand;
    }
    public final void setQuantityOnOrder(int iQuantityOnOrder)
    {/*The "setQuantityOnOrder" Method: This method takes an int argument, 
        "iQuantityOnOrder", which is then applied to the "quantityOnOrder" 
        variable*/
        quantityOnOrder=iQuantityOnOrder;
    }
    
    
    //Accessors-----------------------------------------------------------------
    public String getName()
    {/*The "getName" Method: This method returns the value of the "name" 
        variable, which is of type String*/
        return name;
    }
    public String getDescription()
    {/*The "getDescription" Method: This method returns the value of the 
        "description" variable, which is of type String*/
        return description;
    }
    public int getItemNumber()
    {/*The "getItemNumber" Method: This method returns the value of the 
        "itemNumber" variable, which is of type int*/
        return itemNumber;
    }
    public double getPrice()
    {/*The "getPrice" Method: This method returns the value of the "price" 
        variable, which is of type double*/
        return price;
    }
    public int getQuantityOnHand()
    {/*The "getQuantityOnHand" Method: This method returns the value of the 
        "quantityOnHand" variable, which is of type int*/
        return quantityOnHand;
    }
    public int getQuantityOnOrder()
    {/*The "getQuantityOnOrder" Method: This method returns the value of the 
        "quantityOnOrder" variable, which is of type int*/
        return quantityOnOrder;
    }
    public boolean equals(StoreObject obj) {
        return (this.getItemNumber() == obj.getItemNumber());
    }
    
    //Returns a copy of the object
    public StoreObject copy() {
        StoreObject copy = new StoreObject(this.name, this.description, this.itemNumber,
            this.price, this.quantityOnHand, this.quantityOnOrder);
        return copy;
    }
}
