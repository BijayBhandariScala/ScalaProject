package com.bijay.scala.tutorial

object Ifelse {
  
  val no:Int =300
  
  def main(args: Array[String]) {
    
    println("IF ELSE Example:")
    getif
    getifelse
    
  }
  
  def getif{ 
    if (no>200){
      println("am greater than no.")
    } 
  }
  
  def getifelse{
    if (no>400)
      println("am greater than number:")
    else
      println("am less than number:") 
  }
}