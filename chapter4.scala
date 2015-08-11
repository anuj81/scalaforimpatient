//Q1
val scores = new collection.mutable.HashMap[String,Int]
scores("key")=100
scores("mouse")=10
for ( (k,v) <-scores) yield (k,v*.10)


import java.util._
//Q2
val wordMap = new collection.immutable.HashMap[String,Int]
val in = new java.util.Scanner(new java.io.File("words.txt"))
while (in.hasNext()) {
    val a = in.next()
    wordMap(a) = wordMap.getOrElse(a,0) + 1
    println(a)
}

for ( (k,v)<-wordMap) println(k,v)
