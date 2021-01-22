package com.live.timertest;

interface onListener {
    public void onComplete();
}
public class MyTimer {
    MyTimer(String name, boolean isDaemon)
    {

    }

    public void schedule(long delay, onListener listener )
    {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if( listener != null )
            listener.onComplete();
    }

}
