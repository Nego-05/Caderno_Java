  fun main(args: Array<String>) {
    class Carro {
    val marca = "Audi";
    val modelo = "R8";
    val ano = 2000;
  }

  // Criar um objeto(instanciar)
  var fuca = Carro()

  // Access the properties and add some values to it
  fuca.marca = "Audi"
  fuca.modelo = "R8"
  fuca.ano = 2000;

  println(fuca.marca)   // Mostra Audi
  println(fuca.modelo)   // Mostra R8
  println(fuca.ano)    // Mostra 2000 

  //instaciar outro carro e imprimir os atributos
  val must=Carro()

  must.marca="Ford"
  must.modelo="Mustang"
  must.ano=1969

  println(must.marca)
  println(must.modelo)
  println(must.ano)
  


}