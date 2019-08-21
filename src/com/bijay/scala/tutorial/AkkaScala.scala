package com.bijay.scala.tutorial

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class AkkaScala(myName: String) extends Actor{
  
   def receive = {
    case "hello" => println("hello from %s".format(myName))
    case _      => println("'huh?', said %s".format(myName))
    
  }
}

object Main extends App {
	val system = ActorSystem("HelloSystem")
  // default Actor constructor
      val helloActor = system.actorOf(Props(new AkkaScala("Bijay")), name = "helloactor")
      helloActor ! "hello"
      helloActor ! "buenos dias"
}