// TUPLES -------------------------------------------
Tuple2(1,"a")

val tupla = (1, "a", 2, "b")
// Seleciona o segundo elemento da tuple
tupla._2
// OUTROS MEIOS
(3,"c")
(4 -> "d")
// Fazer sempre com 2,4,6 (não impar)
(5 -> "d" -> 6)


// RANGE----------------------------------------------
1 to 15
'a' to 'g'


// MAPS -----------------------------------------------
res5.zip(res6)
res7.toMap
Map(1 -> 'a', 2 -> 'b', 3 -> 'c' )
res5(0)
//Outro jeito
20 to 29
res11.map(number => number + 1)
//Outro jeito para o mesmo de cima(mais facil mas mais feio rs)
31 to 39
res13.map(_ + 1)


// HIGH ORDER FUNCTIONS (funçao que tem outra funçao como argumento)

// Diferença MAP x FLATMAP
List("Scala", "Python", "R")
res15.map(lang => lang + "#")
res15.flatMap(lang => lang + "#")

// FILTER
List("Scala", "Python", "R", "SQL")
res18.filter(lang => lang.contains("S"))

// FOR ALL (Retorna TRUE ou FALSE)
List("Scala", "SQL")
res20.forall(lang => lang.contains("S"))
res20.forall(lang => lang.contains("a"))
