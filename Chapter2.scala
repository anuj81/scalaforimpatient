


// Q9

def recProd(s:String,index:Int=0) : Int = {
    s(index).toInt * { if (index+1 < s.length ) recProd(s,index+1) else 1}
}

print(recProd("Hello"))

//Q 10
def powCalc(x:Int, n:Int) : Double = {
  if (n> 0 && n%2 == 0) {
    powCalc(x,n/2) * powCalc(x,n/2)
  }
  else if (n >0 && n%2 == 1) {
    x * powCalc(x,n-1)
  }
  else if (n==0) {
    1
  }
  else {
    1/powCalc(x,-1*n)
  }
}
