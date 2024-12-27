package horaDesafioOO3_1;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. 
		 * Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
		 *  Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na 
		 *  classe principal para definir preços e mostrar informações.
		 */
		
	CarModel car1 = new CarModel();
	
	car1.setBrand("Lexus");
	car1.setModel("Moooon");
	car1.setYearOfManufactureo(2010);
	car1.setSaleValue(1500);
	car1.setSaleValue1(1000);
	car1.setSaleValue2(500);
	car1.setColor("Red");
	
	car1.showCarDetail();
	
	}
}