//criação Classe Carro cpm marca, modelo e ano
class Carro{
  var marca=""
  var modelo=""
  var ano=0
} 
//outra maneira de construir uma classe
class Car(var modelo: String, var marca: String, var ano: Int)
//função principal
fun main() {

  //criar uma instancia de carro
  var Audi=Carro()
  
  //atribuir valores
  Audi.marca="R8"
  Audi.modelo="Audi"
  Audi.ano=2000

//imprimir atributos
println(Audi.marca)  
println(Audi.modelo)
println(Audi.ano)


//instanciar passando os parâmetros
val c1 = Car("Ford", "Mustang", 1970)
println (c1.marca)
//instanciar outro carro
val fusca=Car("Fusca", "VW", 1980)
println(fusca.modelo)
}
