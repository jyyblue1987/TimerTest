package com.live.timertest

open class Example {

    open fun getId(): Int {
        // get id from server and return
        return 0
    }

    open fun getUrl(id: Int): String {
        // get url from server and return
        return ""
    }
}