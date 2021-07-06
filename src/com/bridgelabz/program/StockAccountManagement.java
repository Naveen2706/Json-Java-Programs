package com.bridgelabz.program;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccountManagement {
    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();

        FileReader reader = new FileReader("C:\\Users\\HP\\IdeaProjects\\StockAccountManagement\\src\\com\\bridgelabz\\jsonfile\\stockDetails.json");

        Object object = jsonParser.parse(reader);

        JSONObject stockJsonObj = (JSONObject)object;

        JSONArray stockArray = (JSONArray)stockJsonObj.get("StockDetails");

        for(int i=0; i<stockArray.size(); i++) {

            JSONObject StockDetails = (JSONObject) stockArray.get(i);

            String stockName = (String) StockDetails.get("stockName");
            double numberOfShare = (double) StockDetails.get("numberOfShares");
            double sharePrice = (double) StockDetails.get("sharePrice");

            System.out.println("Stock Details of ::");
            System.out.println("Stock Name: " + stockName);
            System.out.println("Number Of Share: " + numberOfShare);
            System.out.println("Share Price: " +sharePrice);

            double totalValue=0;
            double amount = numberOfShare * sharePrice;
            totalValue = amount + totalValue;
            System.out.println("Total Value is:: " + totalValue + '\n');
        }

    }

}