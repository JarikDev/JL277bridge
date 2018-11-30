package com;

import javax.swing.text.html.ImageView;

public class Main {
    public static void main(String[] args) {
        ICar iCar=new ToyotaCar(new CarBridge());
        iCar.drive();
        ICar iTrack=new ToyotaTrack(new TrackBridge());
        iTrack.drive();


    }
}

abstract class ICar {
    IBridge iBridge;

    public ICar(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}

abstract class ITrack {
    IBridge iBridge;

    public ITrack(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}

interface IBridge {
    void drive();
}

class CarBridge implements IBridge{

    @Override
    public void drive() {
        System.out.println("Car bridge");
    }
}
class TrackBridge implements IBridge{
    @Override
    public void drive() {
        System.out.println("track bridge");
    }
}

class ToyotaCar extends ICar{
    public ToyotaCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("Toyota drive");
    }
}

class AudiCar extends ICar{
    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("Toyota drive");
    }
}

class AudiTrack extends ICar{
    public AudiTrack(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("AudiTrack drive");
    }
}
class ToyotaTrack extends ICar{
    public ToyotaTrack(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("ToyotaTrack drive");
    }
}















