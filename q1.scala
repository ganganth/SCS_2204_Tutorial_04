def function_of_interest(amount:Int)={
  
  
  if(amount>2000000){
    var answer=amount*6.5/100
    print(answer)
  }
  else if(amount>200000){
    var answer=amount*3.5/100
    print(answer)
  }
  else if(amount>20000){
    var answer=amount*4/100
    print(answer)
  }
  else{
    var answer=amount*2/100
    print(answer)
  }
  
  
}

function_of_interest(10000)