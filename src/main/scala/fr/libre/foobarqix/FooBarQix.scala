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
        val responseBuilder: StringBuilder = new StringBuilder

        if( input % 3 == 0 ) responseBuilder.append(FooBarQix.FOO)
        if( input % 5 == 0 ) responseBuilder.append(FooBarQix.BAR)
        if( input % 7 == 0 ) responseBuilder.append(FooBarQix.QIX)

        responseBuilder append utils.appendConsideringApparitionDigit( utils.splitIntOnDigit( input ) )

        if( responseBuilder.isEmpty ) responseBuilder.append(input.toString)

        responseBuilder.toString()
    }
}