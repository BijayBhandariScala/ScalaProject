package com.bijay.scala.tutorial

object Variable {
  
   var data=100   //1st way
   //data= 101
   
  
  def main(args: Array[String]) {
      println("I am variable:") 
      println(data)
      value
      character
  }
   
   def value{            
      val data:Int= 200    //2nd way
      println(data)
   }
   
   def character{
     val d:String= "Bijay B"   //String
     println(d)
   }
  
}