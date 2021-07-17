package commercialdataprocess;

import commercialdataprocess.CompanyShares;

import java.text.DecimalFormat;
import java.util.LinkedList;

public class StockPersonalAccountImpl implements IStocksManagementServices {

    LinkedList<CompanyShares> portFolio = new LinkedList<CompanyShares>();

    private DecimalFormat deciFormat = new DecimalFormat("#.##");

    @Override
    public void displayPresentCompanySharesDetails() {

        double companyOneSharePrice = Math.random() * 1000;
        double companyTwoSharePrice = Math.random() * 1000;
        double companyThreeSharePrice = Math.random() * 1000;
        double companyFourSharePrice = Math.random() * 1000;
        double companyFiveSharePrice = Math.random() * 1000;

        System.out.println("Company Stocks currently available to buy.\n");
        System.out.println("CompanyName :: Symbol :: Current-Market-Price :");
        System.out.println("Hcl :: Hcl :" + deciFormat.format(companyOneSharePrice));
        System.out.println("Tata Power :: TP :" + deciFormat.format(companyTwoSharePrice));
        System.out.println("DrReddy\t\tDR\t" + deciFormat.format(companyThreeSharePrice));
        System.out.println("Wipro\tWipro\t" + deciFormat.format(companyFourSharePrice));
        System.out.println("Bhel\t\tBhel\t" + deciFormat.format(companyFiveSharePrice));
    }

    @Override
    public void buyStocks(CompanyShares companySharesDetails) {
        portFolio.add(companySharesDetails);
    }

    public void sellStocks(String companySymbol) {
        for (CompanyShares iterator : portFolio) {
            if (iterator.getCompanySymbol().equals(companySymbol)) {
                portFolio.remove(iterator);
                System.out.println("Stock sold.\n");
            }
        }
    }

    public void displayDetailPortFolio() {
        System.out.println("\n" + "Following is your holdings.");
        for (CompanyShares iterator : portFolio) {
            System.out.println(iterator);
        }
    }
}
