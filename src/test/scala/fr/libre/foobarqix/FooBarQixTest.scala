package fr.libre.foobarqix

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{BeforeAndAfterEach, FunSuite}

/**
 * User: ugo
 * Date: 23/11/11
 *
 * Ecrivez un programme qui affiche les nombres de 1 à 100. Un nombre par ligne. Respectez les règles suivantes :
 *  Si le nombre est divisible par 3 ou contient 3, écrire “Foo” à la place de 3.
 *  Si le nombre est divisible par 5 ou contient 5, écrire “Bar” à la place de 5.
 *  Si le nombre est divisible par 7 ou contient 7, écrire “Qix” à la place de 7.
 */

class FooBarQixTest extends FunSuite with ShouldMatchers with BeforeAndAfterEach {
    val FBQ_3_VALUE: String = "FooFoo"
    val FBQ_5_VALUE: String = "BarBar"
    val FBQ_7_VALUE: String = "QixQix"

    var foo: FooBarQix = _

    override def beforeEach() {
        foo = new FooBarQix
    }

    test("1 donne 1") {
       foo.run(1) should be ("1")
    }

    test("6 est divisible par 3 => donne Foo") {
        foo.run(6) should be ("Foo")
    }

    test("10 est divisible par 5 => donne Bar") {
        foo.run(10) should be ("Bar")
    }

    test("14 est divisible par 7 => donne Qix") {
        foo.run(14) should be ("Qix")
    }

    test("3 est divisible par 3 et contient 3 => donne FooFoo") {
        foo.run(3) should be (FBQ_3_VALUE)
    }

    test("5 donne BarBar") {
        foo.run(5) should be (FBQ_5_VALUE)
    }

    test("7 donne QixQIx") {
        foo.run(7) should be (FBQ_7_VALUE)
    }

    test("30 est divisible par 3 et 5, et contient 3 => FooBarFoo") {
        foo.run(30) should be ("FooBarFoo")
    }

    test("35 est divisible par 5 et 7 et contient 3 et 5 => BarQixFooBar") {
        foo.run(35) should be ("BarQixFooBar")
    }

    test("70 est divisible par 5 et 7 et contient 7 => BarQixQix") {
        foo.run(70) should be ("BarQixQix")
    }

    test("The special one: 53 contient 5 puis 3 => BarFoo") {
        foo.run(53) should be ("BarFoo")
    }

    test("51 est divisible par 3 et contient 5 => FooBar") {
        foo.run(51) should be ("FooBar")
    }

    test("21 est divisible par 3 puis par 7 (ordre Foo, Bar, Qix pour les multiples) => FooQix") {
       foo.run(21) should be ("FooQix")
    }

    test("100 => Bar") {
        foo.run(100) should be ("Bar")
    }
}