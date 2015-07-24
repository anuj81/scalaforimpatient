


# Q9

def recProd(s:String,index:Int=0) : Int = {
    s(index).toInt * { if (index+1 < s.length ) recProd(s,index+1) else 1}
}

print(recProd("Hello"))
