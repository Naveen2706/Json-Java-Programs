package commercialdataprocess;

public interface IStocksManagementServices {
	public void displayPresentCompanySharesDetails();
	public void buyStocks(CompanyShares companySharesDetails);
	public void sellStocks(String companySymbol);
	public void displayDetailPortFolio();
}