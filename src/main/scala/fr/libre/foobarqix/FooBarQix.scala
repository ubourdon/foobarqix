package fr.libre.foobarqix

/**
 * User: ugo
 * Date: 23/11/11
 */

object FooBarQix {
    val FOO: String = "Foo"
    val BAR: String = "Bar"
    val QIX: String = "Qix"
    val EMPTY: String = ""
}

class FooBarQix(utils: FooBarQixUtils = new FooBarQixUtils) {

    def run(input: Int): String = {
        val fbqResponse: String =
            appendConsideringDivisibleNumber(input) +
            appendConsideringApparitionDigit( utils.splitIntOnDigit( input ) )

        if( fbqResponse.isEmpty ) input.toString else fbqResponse
    }

    private def appendConsideringDivisibleNumber( input: Int ): String = {
        val responseBuilder: StringBuilder = new StringBuilder

        if( input % 3 == 0 ) responseBuilder.append(FooBarQix.FOO)
        if( input % 5 == 0 ) responseBuilder.append(FooBarQix.BAR)
        if( input % 7 == 0 ) responseBuilder.append(FooBarQix.QIX)

        responseBuilder.toString()
    }

    private def appendConsideringApparitionDigit(digits: List[Int]): String = {
        digits.map {
            digit =>
                digit match {
                    case 3 => FooBarQix.FOO
                    case 5 => FooBarQix.BAR
                    case 7 => FooBarQix.QIX
                    case _ => FooBarQix.EMPTY
                }
        }.mkString
    }
}