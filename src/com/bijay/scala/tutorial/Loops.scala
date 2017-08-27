package com.bijay.scala.tutorial

object Loops {
  
  def main(args: Array[String]) {
    
      println("I am loop example:") 
      loop()
      
  }
  
  def loop(){
    var a= 10;
    
    while (a<20) {
      println("value:"+a)
      a=a+1
      
    }
  }
}