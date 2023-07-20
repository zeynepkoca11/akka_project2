
package com.mycompany.actorapp2;
// Actor2.java
import akka.actor.AbstractActor;
public class Actor2 extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder().matchEquals("Hi from Actor1", message -> {
                    System.out.println("Received: " + message);
                    // "Hi from Actor1" mesajını "actor1" aktörüne gönder
                     getContext().actorSelection("/user/actor1").tell("Hi from Actor2", getSelf());
                })
                .build();
    }
}
