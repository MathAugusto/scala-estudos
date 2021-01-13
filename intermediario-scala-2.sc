// REDUCE
1 to 5
// Aplicando Reduce
res0.reduce((acc,cur) => acc + cur)
// Faz o mesmo que o treco acima
res0.reduce(_+_)


// PRODUCT (multiplicacao)
res0.product


// EXISTS (boolean)
res0.exists(num => num == 3)
res0.exists(num => num == 9)


// FIND (retorna SOME ou NONE)
res0.find(num => num == 3)
res0.find(num => num == 9)


// GROUPBY (Agrupei por pares)
res0.groupBy(num => num % 2)


// TAKEWHILE
res0.takeWhile(num => num < 3)


// DROPWHILE
res0.dropWhile(num => num < 3)


// FOR (
val myNums = 1 to 3

for {
  i <- myNums
  j <- 1 to i
} yield i * j


// PATTERN MATCHING (PARECIDO COM SWITCH/CASE)

def getMiddleName(value: Option[String]): String = {
  value match {
    case Some(middleName)  => middleName
    case None => "No middle name"
  }
}

case class Customer(first: String = "",
                   middle: Option[String] = None,
                    last: String = "")
val silva = Customer("Lai", last = "La")
val costa = Customer("Oi", Option("Lo"), "La")
getMiddleName(silva.middle)
getMiddleName(costa.middle)


// CATCHING EXCEPTION------------------------
def toInt(s: String): Int =
  try{
    s.toInt
  } catch {
    case _: NumberFormatException => 0
  }

// WRAPING A CALL IN TRY
// Tentando transformar string numerica x string char
import scala.util.{Try, Success, Failure}
Try("100".toInt)
Try("Martin".toInt)
// MELHORANDO
def makeInt(s: String): Int = Try(s.toInt) match{
  case Success(n) => n
  case Failure(_) => 0
}
makeInt("35")
makeInt("Magneto")


// EXECUTION CONTEXT
import scala.concurrent.ExecutionContext
import java.util.concurrent.ForkJoinPool

implicit val ec: ExecutionContext =
  ExecutionContext.fromExecutor(new ForkJoinPool())


