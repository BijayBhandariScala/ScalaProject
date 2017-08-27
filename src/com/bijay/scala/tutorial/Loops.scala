package com.bijay.scala.tutorial

object Loops {
  
  def main(args: Array[String]) {
    
      println("I am a while loop example:") 
      whileloop()
      println("I am a do while loop example:") 
      dowhile()
      println("I am a for loop example:") 
      forloop()
      
  }
  
  def whileloop(){
    var a= 10;
    
    while (a<20) {
      println("value:"+a)
      a=a+1
      
    }
  }
    
    def dowhile(){
      var a=10;
      
      do{
        println("value is:"+a)
        a=a+1
      }   
        while(a<20)
  }
    
    def forloop(){
      var a=1;
      for( a<-1 to 10){
        println("value of a:" +a)
        
      }
    
    }
}
