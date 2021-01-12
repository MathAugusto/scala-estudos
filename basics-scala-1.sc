// METODOS---------------------------------------------
def square(x: Int) = x * x
square(2)

"Matheus Augusto".split(" ")


// CLASSES-----------------------------------------
class Hello(mensagem: String) {
  println(mensagem)
}

new Hello("Olá em Scala")


//OBJETOS------------------------------------------
object Ola {
  def mensagem_1 = "Mensagem do Objeto"
}
Ola.mensagem_1


// CAMPOS IMUTAVEIS (usando val)
class Imutavel{
  val recado1: String = "Recado IMUTAVEL"
}
(new Imutavel).recado1


// CAMPOS MUTAVEIS (usando var inves de val) Tornando mutavel
class Mutavel{
  var recado2: String = "Recado"
}
val valor_recado2 = new Mutavel

valor_recado2.recado2 = "Recado MUTAVEL"

println(valor_recado2.recado2)


// NAMED ARGUMENTS
def nome(firstname: String,
         lastname: String,
         middlename: String = ""):
  String = firstname + " " + middlename + " " + lastname

nome(firstname = "Math", lastname = "Augs")


// ACESSIBILIDADE ( PRIVADO X PUBLICO)
class Welcome{
  private val message: String = "welcome"
}
class BemVindo{
  val message: String = "bemvindo"
}

// CASE CLASS E CASE OBJECTS------------------------------------
case class Pessoa(nome: String, idade: Int, tel: String)

val Fulano = Pessoa("Fulano", 29, "011988888888")
val Ciclano = Pessoa("Ciclano", 98, "01309000000")

println(Fulano, Ciclano)
