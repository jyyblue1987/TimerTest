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
        val example = Mockito.mock(Example::class.java)   // 3

        Mockito.`when`(example.getId()).thenReturn(100)   // 4
        Mockito.`when`(example.getUrl(100))
            .thenReturn("https://codechacha.com")    //  5

        assertEquals(100, example.getId())    // 6
        assertEquals("https://codechacha.com",
            example.getUrl(example.getId()))    // 7
    }
}