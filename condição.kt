fun main() {
  print("Qual sua idade?")
  val idade = readLine()!!
  println("sua idade é: "+idade)
  //numeros digitados no teclado sao interpretados como texto
  //string
  //convert string to Int
    val num = idade.toInt()

    if (num >= 18) {
      println("você é maior de idade")
    }else{
      println("você é menor de idade")
    }
    
}
