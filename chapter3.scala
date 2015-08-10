import util.Random

val a = new Array[Int](10)
val r = new Random
for (i <- 0 until 10) {
    a(i)=r.nextInt(10)
}

for (i <- 0 until 10) {
    println(a(i))
}

