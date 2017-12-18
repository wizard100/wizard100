package Hub;

import Devices.Device;
import observers.Observer;

import java.util.ArrayList;
import java.util.concurrent.Flow;

public class smartHome implements  Home  , Flow.Subscriber<Device> {
    public smartHome( )
    {

    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(Device item) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }

    private ArrayList<Observer> observers;
}

