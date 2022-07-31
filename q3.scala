import scala.io.StdIn.readLine


val word = readLine()
def toupper(n:String) :String=n.toUpperCase()
def tolower(n:String):String=n.toLowerCase()

var ans1=toupper(word)
var ans2=tolower(word)
println(ans1)
println(ans2)
  
  

def formatNames(name:String)={
  var n1=toupper(name)
  println(n1)
  var n2=tolower(name)
  println(n2)
  
  var len = name.length();
  
  var s_str1=name.substring(0,2)
  var s_paetstr=toupper(s_str1)
  var s_reststr=name.substring(2,len)
  println(""+s_paetstr+s_reststr)
  
  var e_str1=name.substring(len-2,len)
  var e_paetstr=toupper(e_str1)
  var e_reststr=name.substring(0,len-2)
  println(""+e_reststr+e_paetstr)
  
  
  
  
}


formatNames("saman")