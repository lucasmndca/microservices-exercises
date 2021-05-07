package com.microservices.exercises.publisher.services;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Socket;
import org.zeromq.ZThread.IAttachedRunnable;

public class SubscriberService implements IAttachedRunnable {

    @Override
    public void run(Object[] objects, ZContext ctx, Socket socket) {
        Socket subscriber = ctx.createSocket(SocketType.SUB);
        subscriber.connect("tcp://localhost:6001");
        subscriber.subscribe("AUTH".getBytes(ZMQ.CHARSET));

        int count = 0;
        while (count < 5) {
            String string = subscriber.recvStr();
            System.out.println(string);
            if (string == null)
                break; //  Interrupted
            count++;
        }
        ctx.destroySocket(subscriber);
    }
}
