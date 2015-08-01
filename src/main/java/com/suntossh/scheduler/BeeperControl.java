package com.suntossh.scheduler;

import static java.util.concurrent.TimeUnit.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

class BeeperControl {
  private final ScheduledExecutorService scheduler =
    Executors.newScheduledThreadPool(1);

  public void beepForAnHour() {
    final Runnable beeper = new Runnable() {
      public void run() { System.out.println("beep"); }
    };
    final ScheduledFuture<?> beeperHandle =
      scheduler.scheduleAtFixedRate(beeper, 10, 5, SECONDS);
    scheduler.schedule(new Runnable() {
      public void run() { beeperHandle.cancel(true); }
    }, 60 * 1, SECONDS);
  }
  
  public static void main(String[] args) {
	BeeperControl beeperControl = new BeeperControl();
	beeperControl.beepForAnHour();
	System.out.println("Main Returns");
}
}