package fit5042.tutex;
import fit5042.tutex.repository.entities.Property;
import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.SimplePropertyRepositoryImpl;
import java.util.*;
/**
 *
 * TODO Exercise 1.3 Step 3 Complete this class. Please refer to tutorial instructions.
 * This is the main driver class. This class contains the main method for Exercise 1A
 * 
 * This program can run without the completion of Exercise 1B.
 * 
 * @author Jian
 */
public class RealEstateAgency 
{
    private String agencyName;
    private PropertyRepository propertyRepository;

    public RealEstateAgency(String agencyName, PropertyRepository propertyRepository) {
        this.agencyName = agencyName;
        this.propertyRepository = propertyRepository;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public PropertyRepository getPropertyRepository() {
        return propertyRepository;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPropertyRepository(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }
    
    public static void main(String args []) throws Exception
    {
        Property property1 = new Property(1,"24 Boston Ave, Malvern East VIC 3145, Australia", 2, 150, 420000);
        Property property2 = new Property(2,"11 Bettina St, Claton VIC 3168, Australia", 3, 352, 360000);
        Property property3 = new Property(3,"3 Wattle Ave, Glen Huntley VIC 3163, Australia", 5, 800, 650000);
        Property property4 = new Property(4,"3 Halmilton St, Bentleigh VIC 3204, Australia", 2, 170, 435000);
        Property property5 = new Property(5,"82 Spring Rd, Hampton East VIC 3188, Australia", 1, 60, 820000);
        
        SimplePropertyRepositoryImpl propertylst= new SimplePropertyRepositoryImpl();
        propertylst.addProperty(property1);
        propertylst.addProperty(property2);
        propertylst.addProperty(property3);
        propertylst.addProperty(property4);
        propertylst.addProperty(property5);
        System.out.println("5 Properties Added Successfully!");
        System.out.println("--------------------------------------------------------------------------------------------------");
        List<Property> propertyList = propertylst.getAllProperties();
        for(int i =0; i<propertyList.size(); i++)
        {
            System.out.println(propertyList.get(i).getId()+" "+propertyList.get(i).getAddress()+" "+propertyList.get(i).getNumberOfBedrooms()+"BR(s) "
                    +propertyList.get(i).getSize()+"sqm $"+propertyList.get(i).getPrice());
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Enter the ID of the property you want to search");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Property property = propertylst.searchPropertyById(id);
        System.out.println(property.getId()+" "+property.getAddress()+" "+property.getNumberOfBedrooms()+"BR(s) "+property.getSize()+"sqm $"+property.getPrice());
        
    }
}
