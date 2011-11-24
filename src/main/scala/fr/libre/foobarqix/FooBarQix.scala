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
        var check: Boolean = false

        if( input % 3 == 0 ) {
            responseBuilder.append(Foo)
            check = true
        }

        if( input % 5 == 0 ) {
            responseBuilder.append(Bar)
            check = true
        }

        if( input % 7 == 0 ) {
            responseBuilder.append(Qix)
            check = true
        }

        val result: String = utils.appendConsideringApparitionDigit( utils.splitIntOnDigit( input ) )
        if(!result.isEmpty) check = true

        responseBuilder append result

        if( !check ) responseBuilder.append(input.toString)

        responseBuilder.toString()
    }
}