import scala.io.StdIn.readInt

val number = readInt()

def chek_number(n:Int)={
  if(n<0){
    printf("\nNumber is negative")
  }
  else if(n==0){
    printf("\nzero")
  }
}


def chek_even_odd(n:Int)={
  if(n%2==0){
    printf("\nNumber is even")
  }
  else{
    printf("\nnumber is odd")
  }
}

chek_number(number)
chek_even_odd(number)