public class Main {
  public static void main(String[] args){
  Car car = new Car("Chevrolet", "Onix", 2024, 175_000);

	System.out.println(car.getMarca());
	System.out.println(car.getModelo());
	System.out.println(car.getAno());
	System.out.println("Valor da venda: " + car.valorVenda());
  }
}