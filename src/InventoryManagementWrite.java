import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class InventoryManagementWrite {

    public static void main(String[] args) {
        JSONObject inventoryDetails = new JSONObject();

        //JSONObject class creates a json object,
        //provides a put function to insert the details into json object
        inventoryDetails.put("type", "rice");
        inventoryDetails.put("name", "basmati");
        inventoryDetails.put("weight", 10.0);
        inventoryDetails.put("pricePerKg", 60.0);


       // JSONObject inventoryObject1 = new JSONObject();
   //     studentObject1.put("student1", inventoryDetails);

        JSONObject inventoryDetails1 = new JSONObject();

        //JSONObject class creates a json object,
        //provides a put function to insert the details into json object
        inventoryDetails1.put("type", "pulses");
        inventoryDetails1.put("name", "garden peas");
        inventoryDetails1.put("weight", 44.5);
        inventoryDetails1.put("pricePerKg", 45.5);

   //     JSONObject studentObject2 = new JSONObject();
       // inventoryObject1.put("student1", inventoryDetails1);
        JSONObject inventoryDetails2 = new JSONObject();
        inventoryDetails2.put("type", "pulses");
        inventoryDetails2.put("name", "garden peas");
        inventoryDetails2.put("weight", 20.0);
        inventoryDetails2.put("pricePerKg", 50.5);
        JSONArray inventoryArray = new JSONArray();

        inventoryArray.add(inventoryDetails);
        inventoryArray.add(inventoryDetails1);
        inventoryArray.add(inventoryDetails2);

        JSONObject inventorymain = new JSONObject();
        inventorymain.put("Inventory", inventoryArray);
        try (FileWriter file = new FileWriter("C:\\Users\\HP\\IdeaProjects\\InventoryManagementExtended\\Inventory\\inventory.json")) {
            //File Writer creates a file in write mode at the given location
            file.write(inventorymain.toJSONString());

            //write function is use to write in file,
            //here we write the Json object in the file
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("----------------Data added to Json File SuccessFully --------------------------");
        //to print our JSon object
    }
}


