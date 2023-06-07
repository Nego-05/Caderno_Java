// criar uma função passando um parâmetro
fun meuNome(Nome: String) {
  println("Seu nome é: " + Nome)
}
// crie uma função que retorna true ou false, passando parâmetro x na chamada da funcao
fun veroufalso(x: Boolean) {
  println(x)
}
// crie uma função que verifica a idade passada como parâmetro, se é maior de idade
fun seramaior(y: Int) {
  if (y >= 18) {
    println("É maior de idade: " + y)
  } else {
    println("É menor de idade: " + y)
  }
}

//crie uma função que passa dois parâmetros inteiros a e b, a função retorna a soma dois valores

fun soma(a: Int, b: Int): Int {
  return (a + b)
}

// função principal kotlin
fun main() {
  meuNome("Pedro")
  veroufalso(true)
  veroufalso(false)

  seramaior (15)
  seramaior (19)

  var resultado = soma(40, 58)
  println(resultado)
}