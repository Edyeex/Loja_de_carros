public class Car {
  private String Marca;
  private String Modelo;
  private int Ano;
  private int Valor;

  Car(String Marca, String Modelo, int Ano, int Valor) {
	this.Marca = Marca;
	this.Modelo = Modelo;
	this.Ano = Ano;
	this.Valor = Valor;

  }
  public double valorVenda(){
	double valorFinal = (Valor * 0.1) + Valor;
	return valorFinal;
  }
  public String getMarca() {
	return Marca;
  }
  public String getModelo() {
	return Modelo;
  }
  public int getAno() {
	return Ano;
  }


}
