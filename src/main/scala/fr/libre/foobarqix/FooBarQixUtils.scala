package fr.libre.foobarqix

/**
 * User: ugo
 * Date: 23/11/11
 */

class FooBarQixUtils {

    def splitIntOnDigit(input: Int): List[Int] = {
        var l = List[Int]()
        var i = input

        while (i != 0) {
            l ::= i % 10
            i /= 10
        }

        l
    }
}