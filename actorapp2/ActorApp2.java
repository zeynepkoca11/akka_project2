package com.mycompany.actorapp2;
// ActorApp2.java
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class ActorApp2 {
    public static void main(String[] args) {
        // AKKA Aktör Sistemi oluştur ve "actor2" aktörünü başlat
        ActorSystem system = ActorSystem.create("akka-system");
        ActorRef actor2 = system.actorOf(Props.create(Actor2.class), "actor2");
        actor2.tell("Hi from Actor1", ActorRef.noSender());
        // AKKA Aktör Sistemini kapat
        system.terminate();
    }
}
