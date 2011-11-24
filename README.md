FooBarQix

Ecrivez un programme qui affiche les nombres de 1 à 100. Un nombre par ligne. Respectez les règles suivantes :
    Si le nombre est divisible par 3 ou contient 3, écrire “Foo” à la place de 3.
    Si le nombre est divisible par 5 ou contient 5, écrire “Bar” à la place de 5.
    Si le nombre est divisible par 7 ou contient 7, écrire “Qix” à la place de 7.

    On regarde les diviseurs avant le contenu (ex: 51 -> FooBar)
    On regarde le contenu dans l’ordre où il apparait (ex: 53 -> BarFoo)
    On regarde les multiples dans l’ordre Foo, Bar puis Qix (ex: 21 -> FooQix)
    13 contient 3 donc s’écrit “Foo”

Voici un exemple de rendu

1
2
FooFoo
4
BarBar
Foo
QixQix
8
Foo
Bar
...

_________________________________________________________________________________________
Le projet tourne sur sbt 0.11.1 et scala 2.9.1

