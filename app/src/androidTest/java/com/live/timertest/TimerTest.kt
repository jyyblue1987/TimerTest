package com.live.timertest

import androidx.test.core.app.ActivityScenario
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)   // 1
class TimerTest {
    @Test   // 2
    fun example1() {
        ActivityScenario.launch(MainActivity::class.java).onActivity { activity ->
            // do something with your activity instance
            val measure: TimeMeasure = TimeMeasure()

            var delay: Long = 60 * 1000
            activity.runTimer(delay, measure)
            Thread.sleep(delay + 1000)
            assert(measure.delay > delay)    // 6
        }
    }
}