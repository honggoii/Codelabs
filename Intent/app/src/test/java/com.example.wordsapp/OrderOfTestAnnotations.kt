package com.example.wordsapp

import org.junit.*

class OrderOfTestAnnotations {

    @Before
    fun setUpFunction() {
        println("Set up function")
    }

    @Test
    fun test_a() {
        println("Test a")
    }

    @Test
    fun test_b() {
        println("Test b")
    }

    @Test
    fun test_c() {
        println("Test c")
    }

    @After
    fun tearDownFunction() {
        println("Tear down function")
    }

    companion object {
        @BeforeClass
        @JvmStatic
        fun setUpClass() {
            println("Set up class")
        }

        @AfterClass
        @JvmStatic
        fun tearDownClass() {
            println("Tear down class")
        }
    }
}