/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository;
import fit5042.tutex.repository.entities.Property;

/**
 * TODO Exercise 1.3 Step 2 Complete this class.
 * 
 * This class implements the PropertyRepository class. You will need to add the keyword
 * "implements" PropertyRepository. 
 * 
 * @author Jian 
 */
import java.util.*;
public class SimplePropertyRepositoryImpl implements PropertyRepository{
    
    private ArrayList<Property> propertyList = new ArrayList<Property>();

    public SimplePropertyRepositoryImpl() {
    }

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(ArrayList<Property> propertyList) {
        this.propertyList = propertyList;
    }
    

    @Override
    public void addProperty(Property property) throws Exception {
    
    propertyList.add (property); 
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Property searchPropertyById(int id) throws Exception {
        Property property = new Property();
        for(int i =0; i<propertyList.size(); i++)
        {
            if(propertyList.get(i).getId() == id)
            {
                property = propertyList.get(i);
            }
        }
        return property;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Property> getAllProperties() throws Exception {
        
        return propertyList;
//To change body of generated methods, choose Tools | Templates.
    }
    
}
