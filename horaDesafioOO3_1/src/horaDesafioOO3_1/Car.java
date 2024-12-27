package horaDesafioOO3_1;

public class Car {

	private String brand;
	private String model;
	private int yearOfManufacture;
	private double saleValue;
	private double saleValue1;
	private double saleValue2;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufactureo(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public double getSaleValue() {
		return saleValue;
	}
	public void setSaleValue(double saleValue) {
		this.saleValue = saleValue;
	}
	
	public double getSaleValue1() {
		return saleValue1;
	}
	public void setSaleValue1(double saleValue1) {
		this.saleValue1 = saleValue1;
	}
	public double getSaleValue2() {
		return saleValue2;
	}
	public void setSaleValue2(double saleValue2) {
		this.saleValue2 = saleValue2;
	}
	
	public double showLowerSalePrice() {
		double lowerPrice = saleValue;
		if (saleValue1 < lowerPrice) {
			lowerPrice = saleValue1;
		} if (saleValue2 < lowerPrice) {
			lowerPrice = saleValue2;
		}
		return lowerPrice;
	}
	
	public double showHigherSalePrice() {
		double higherPrice = saleValue;
		if (saleValue1 > higherPrice) {
			higherPrice = saleValue1;
		} if (saleValue2 > higherPrice) {
			higherPrice = saleValue2;
		}
		return higherPrice;
	}
	
	public double calculateAveragePrice() {
		return ((saleValue + saleValue1 + saleValue2) / 3);
	}
	
	public void showCarDetail() {
		System.out.println("Marca: " + getBrand());
		System.out.println("Modelo: " + getModel());
		System.out.println("Ano de fabricação: " + getYearOfManufacture());
		System.out.println("Valor de venda: R$" + getSaleValue());
		System.out.println("Valor de venda 1: R$" + getSaleValue1());
		System.out.println("Valor de venda 2: R$" + getSaleValue2());
		System.out.println("O menor valor pelo qual o carro foi vendido é R$" + showLowerSalePrice());
		System.out.println("O maior valor pelo qual o carro foi vendido é R$" + showHigherSalePrice());
		System.out.printf("O preço médio do carro nas ultimas três vendas é R$" + calculateAveragePrice());
	}
	
}
