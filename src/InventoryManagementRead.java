
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManagementRead {

    public static void main(String[] args) {

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("C:\\Users\\HP\\IdeaProjects\\InventoryManagementExtended\\Inventory\\inventory.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject inventory = (JSONObject) obj;
            JSONArray inventoryArray = (JSONArray) inventory.get("Inventory");
            System.out.println(inventoryArray);

            for (int i = 0; i < inventoryArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) inventoryArray.get(i);
                double pricePerKg = (double) jsonObject.get("pricePerKg");

                double weight = (double) jsonObject.get("weight");
                String type = (String) jsonObject.get("type");
                String name = (String) jsonObject.get("name");

                System.out.println("inventoryDetail " + i + " is ......");
                System.out.println("name::" + name);
                System.out.println("weight::" + weight);
                System.out.println("pricePerKg::" + pricePerKg);
                System.out.println("type::" + type);

                double value = weight * pricePerKg;
                switch (i) {
                    case 0:
                        System.out.println("value for Rice is:: " + value + '\n');
                        break;
                    case 1:
                        System.out.println("value for Pulses is:: " + value + '\n');
                        break;
                    case 2:
                        System.out.println("value for Wheat is:: " + value);
                        break;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


