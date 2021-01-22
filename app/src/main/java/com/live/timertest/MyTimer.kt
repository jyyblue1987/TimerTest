package com.live.timertest

interface onListener {
    public fun onComplete();
}

open class MyTimer(name: String, boolean: Boolean) {
    fun schedule(delay: Long, listener: onListener )
    {
        try {
            Thread.sleep(delay);
        } catch (e:InterruptedException) {
            e.printStackTrace();
        }

        if( listener != null )
            listener.onComplete();
    }
}