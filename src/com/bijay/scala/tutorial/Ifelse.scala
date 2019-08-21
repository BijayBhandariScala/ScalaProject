package com.bijay.scala.tutorial

object Ifelse {
  
  val number:Int =300
  
  def main(args: Array[String]) {
    
    println("IF ELSE Example, Entered number is:" +number)
    getif
    getifelse
    
  }
  
  def getif{ 
    val num1:Int=200
    if (number>num1){
      println("num to compare." +number)
      println("am greater than no." +num1)
    } 
  }
  
  def getifelse{
    val num2:Int=400
    println("num to compare." +number)
    if (number>num2)  
      println("am greater than number:" +num2)
    else
      println("am less than number:" +num2) 
  }
}