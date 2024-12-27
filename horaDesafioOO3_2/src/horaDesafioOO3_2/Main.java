package horaDesafioOO3_2;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. 
		 * Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. 
		 * Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
		 */
		
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		
		cat1.makeSound();
		cat1.scratchesTheFurniture();
		dog1.makeSound();
		dog1.wagsTheTail();
		
	}
}
