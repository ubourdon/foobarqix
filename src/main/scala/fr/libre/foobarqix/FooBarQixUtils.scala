package fr.libre.foobarqix

/**
 * User: ugo
 * Date: 23/11/11
 */

class FooBarQixUtils {

    def splitIntOnDigit(input: Int): List[Int] = {
        var digits = List[Int]()
        var i = input

        while (i != 0) {
            digits ::= i % 10
            i /= 10
        }

        digits
    }
}
