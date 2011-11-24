package fr.libre.foobarqix

/**
 * User: ugo
 * Date: 23/11/11
 */

class FooBarQix(utils: FooBarQixUtils = new FooBarQixUtils) {

    val Foo: String = "Foo"
    val Bar: String = "Bar"
    val Qix: String = "Qix"

    def run(input: Int): String = {
        val responseBuilder: StringBuilder = new StringBuilder

        if( input % 3 == 0 ) responseBuilder.append(Foo)
        if( input % 5 == 0 ) responseBuilder.append(Bar)
        if( input % 7 == 0 ) responseBuilder.append(Qix)

        responseBuilder append utils.appendConsideringApparitionDigit( utils.splitIntOnDigit( input ) )

        if( responseBuilder.isEmpty ) responseBuilder.append(input.toString)

        responseBuilder.toString()
    }
}