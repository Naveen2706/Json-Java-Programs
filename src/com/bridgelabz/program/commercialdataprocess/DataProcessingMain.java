package commercialdataprocess;

import java.util.*;

public class DataProcessingMain {
    IStocksManagementServices iStockMangmtServObject;
    Scanner scannerObject;
    Date date = Calendar.getInstance().getTime();

    public DataProcessingMain() {
        iStockMangmtServObject = new StockPersonalAccountImpl();
        scannerObject = new Scanner(System.in);
    }

    public void userSelection() {
        boolean isExit = false;
        while (!isExit) {
            iStockMangmtServObject.displayPresentCompanySharesDetails();

            System.out.println("\n" + "Enter number as per choice :\n1 - Buy Stocks.\n2 - Sell Stocks."
                    + "\n3 - Display Detailed Port-Folio.\n4 - Exit.");
            int userChoice = scannerObject.nextInt();

            switch (userChoice) {
                case 1:
                    //Asking user what stocks he/she wants to buy and of how much amount.Storing the data inside linkedlist.
                    System.out.print("Enter how manys company stocks you want to buy : ");
                    int userInput = scannerObject.nextInt();
                    for (int iterator = 1; iterator <= userInput; iterator++) {
                        CompanyShares companySharesObject = new CompanyShares();
                        System.out.print("Enter the Company Name : ");
                        companySharesObject.setCompanyName(scannerObject.next());
                        System.out.print("Enter the Stock Symbol : ");
                        companySharesObject.setCompanySymbol(scannerObject.next());
                        System.out.print("Enter Per Share Price : ");
                        double pricePerShare = scannerObject.nextDouble();
                        companySharesObject.setPricePerShare(pricePerShare);
                        System.out.print("Enter the amount of which you want to buy shares.");
                        double amount = scannerObject.nextDouble();
                        int quantity = (int) (amount / pricePerShare);
                        companySharesObject.setNumberOfShares(quantity);
                        companySharesObject.setDate(date);
                        iStockMangmtServObject.buyStocks(companySharesObject);
                    }
                    System.out.println("\n Stocks inserted sucessfully !\n");
                    break;
                case 2:
                    //Selling stocks from port-folio.
                    System.out.println("Enter Stock Symbol to sell the stocks.");
                    iStockMangmtServObject.sellStocks(scannerObject.next().toUpperCase());
                    break;
                case 3:
                    //prints all stock details.
                    iStockMangmtServObject.displayDetailPortFolio();
                    break;
                case 4:
                    //Exit from while loop that will stop exit from continues program execution.
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid Input.");
            }
        }
        scannerObject.close();
    }

    public static void main(String[] args) {
        DataProcessingMain dataProcessingMainObject = new DataProcessingMain();
        dataProcessingMainObject.userSelection();
    }
}
