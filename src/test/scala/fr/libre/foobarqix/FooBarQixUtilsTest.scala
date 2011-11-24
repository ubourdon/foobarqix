package fr.libre.foobarqix

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{BeforeAndAfterEach, FunSuite}
import scala.Int

/**
 * User: ugo
 * Date: 23/11/11
 */

class FooBarQixUtilsTest extends FunSuite with ShouldMatchers with BeforeAndAfterEach {

    val utils: FooBarQixUtils = new FooBarQixUtils

    test("permet de couper un nombre en digit unitaire") {
        val result: List[Int] = utils.splitIntOnDigit( 123 )

        result should have size (3)
        result(0) should be (1)
        result(1) should be (2)
        result(2) should be (3)
    }

    test("permet de retourner une chaine de caractère FooBarQix suivant l'ordre d'apparation des chiffre dans le nombre") {
        utils.appendConsideringApparitionDigit( utils.splitIntOnDigit( 53 ) ) should be ("BarFoo")
    }

    test("spike") {
        utils.splitIntOnDigit( 123 ).exists( digit => digit equals 3 ) should be (true)
        utils.splitIntOnDigit( 124 ).exists( digit => digit == 3 ) should be (false)
    }
}