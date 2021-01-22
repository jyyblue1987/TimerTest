package com.live.timertest

import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)   // 1
class TimerTest {

    @Test   // 2
    fun example1() {
        val activity = Mockito.mock(MainActivity::class.java)   // 3

        var delay: Long = 1 * 1000
        assert(activity.runMyTimer(delay) > delay)    // 6
    }
}