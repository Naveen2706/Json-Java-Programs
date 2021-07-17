package commercialdataprocess;

import java.util.*;

public class CompanyShares {
    private String companyName;
    private String companySymbol;
    private int numberOfShares;
    private double Shareprice;
    private Date date;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName.toUpperCase();
    }

    public String getCompanySymbol() {
        return companySymbol;
    }

    public void setCompanySymbol(String companySymbol) {
        this.companySymbol = companySymbol.toUpperCase();
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        //if quantity is less than 0 printing error message.
        if (numberOfShares <= 0) {
            System.err.println("Number of Shares can not be 0 !");
        } else {
            this.numberOfShares = numberOfShares;
        }
    }

    public double getPricePerShare() {
        return Shareprice;
    }

    public void setPricePerShare(double pricePerShare) {
        if (pricePerShare <= 0.0) {
            System.err.println("Price per share can not be 0, Enter price greater than 0 !");
        } else {
            this.Shareprice = pricePerShare;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Personal Account [Company-Name=" + companyName + ", Company-Symbol=" + companySymbol + ", Quantity="
                + numberOfShares + ", Price-Per-Share=" + Shareprice + ",Date-Of-Transaction=" + date + "]";
    }
}
