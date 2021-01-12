// ARRAYS---------------------------------------------------------
Array(1,2,3,4,5,6)
//index do array (Index 2 = valor 3) index começa no zero como no python
res0(2)
// converter para SET

// LISTAS---------------------------------------------------------
List(5,6,7,7,8,9)
//index da lista (Index 4 = valor 8) index começa no zero como no python
res2(4)
//nao ver duplicatas
res2.distinct
// Add novo valor no final da lista
res2 :+ 7


//SETS------------------------------------------------------------
Set(10,11,12,13,13,14)
res6.getClass
// Podemos adicionar novos valores:( Não em ordem numerica)
res6 + 17
// Mas se tentar adicionar adicionar duplicatas, nao funciona:
res6 + 10


// MÉTODOS SINTÉTICOS---------------------------------------------
// equals(boolean)
// lembrando que val =Imutavel, var = Multavel
case class Time(hours: Int = 0, minutes: Int = 0)
val time = Time(9,1)

time == Time(9,0)
time == Time(9,1)

// hashcode()
Time.hashCode()

// copy()
var time2 = Time(9,10)
time2 = time2.copy(minutes = 29)
time2


// VOLATILE --------------------------
// PARA AS OUTRAS THREADS VEREM SUAS ATUALIZAÇOES:
case class Customer(nome: String = "", sobrenome: String = "")
@volatile var cliente1 = Customer("Augusto", "Matheus")
cliente1 = cliente1.copy(sobrenome = "Red")
cliente1


// OPTION (Ele encontra, por isso só printa "ACHEI")
Option("ACHEI")
res15.getOrElse("NAO ACHEI")

