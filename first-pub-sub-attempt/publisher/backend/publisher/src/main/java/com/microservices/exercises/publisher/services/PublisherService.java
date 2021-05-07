package com.microservices.exercises.publisher.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ.Socket;
import org.zeromq.ZThread.IAttachedRunnable;

/**
 * The publisher publishes messages on the queue.
 * @author Lucas Dias
 * @since 2021-05-06 11:46
 */
@Service
public class PublisherService implements IAttachedRunnable {

    @Autowired
    private SubscriberService subscriberService;

    public void getArgsAndRun(String args) {
        run(new Object[]{args}, new ZContext(), null);
        subscriberService.run(null, new ZContext(), null);
    }

    @Override
    public void run(Object[] args, ZContext ctx, Socket socket) {

        Socket publisher = ctx.createSocket(SocketType.PUB);
        publisher.bind("tcp://*:6000");

        try {
            publisher.send(String.valueOf(args[0]));
        } catch(Exception e) {
            System.out.println(e);
        }
        ctx.destroySocket(publisher);
    }
}
