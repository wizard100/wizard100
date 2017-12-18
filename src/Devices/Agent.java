package Devices;

import datatTypes.HomePosition;

import java.util.concurrent.Flow;

public abstract class Agent implements Device , Flow.Publisher<Device>, Flow.Subscription{

    Agent(HomePosition pos)
    {
        position = pos;
    }

    @Override
    public void subscribe(Flow.Subscriber<? super Device> subscriber) {

    }

//    @Override
//    public void request(long n) {
//
//    }

    @Override
    public void cancel() {

    }

    HomePosition position;
}
