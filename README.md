1. **Pure Funktionen**:
   - Pure Funktionen haben einen einzelnen Rückgabewert und führen keine Modifikationen an externen Werten durch.
   - Beispiel:
     ```scala
     def addiere(x: Int, y: Int): Int = x + y
     ```

2. **Java Streams vs. Scala**:
   - Scala überzeugt durch Unveränderlichkeit (immutable lists) und deklarativen Code, im Gegensatz zu Java Streams.
   - Beispiel:
     ```scala
     val liste = List(1, 2, 3)
     val summe = liste.map(_ * 2).filter(_ % 2 == 0).sum
     ```

3. **Funktionen in Scala**:
   - Funktionssignaturen sollten klar und prägnant sein.
   - Beispiel:
     ```scala
     def multipliziere(x: Int, y: Int): Int = x * y
     ```

4. **Higher Order Functions (HOF)**:
   - Erlauben die Übergabe von Funktionen als Argumente an andere Funktionen oder die Rückgabe von Funktionen.
   - Beispiel:
     ```scala
     def applyTwice(f: Int => Int, x: Int): Int = f(f(x))
     ```

5. **Anonyme Funktionen**:
   - Erlauben die Definition von Funktionen ohne explizite Deklaration.
   - Beispiel:
     ```scala
     val quadrat: Int => Int = x => x * x
     ```

6. **Map**:
   - Wendet eine Funktion auf jedes Element einer Liste an und erstellt eine neue Liste mit den bearbeiteten Elementen.
   - Beispiel:
     ```scala
     val liste = List(1, 2, 3)
     val verdoppelt = liste.map(_ * 2)
     ```

7. **Filter**:
   - Wählt Elemente aus einer Liste aus, die eine bestimmte Bedingung erfüllen, und erstellt eine neue Liste.
   - Beispiel:
     ```scala
     val geradeZahlen = liste.filter(_ % 2 == 0)
     ```

8. **FoldLeft**:
   - Reduziert eine Liste auf einen einzelnen Wert, indem eine Akkumulatorfunktion auf jedes Element angewendet wird.
   - Beispiel:
     ```scala
     val summe = liste.foldLeft(0)(_ + _)
     ```

9. **Produkttypen (Case Classes)**:
   - Erlauben die Definition von Datenstrukturen, die mehrere Werte zusammenfassen.
   - Beispiel:
     ```scala
     case class Person(name: String, alter: Int)
     val person = Person("Max", 30)
     ```

10. **Currying**:
    - Wandelt eine Funktion mit mehreren Argumenten in eine Sequenz von Funktionen um.
    - Beispiel:
      ```scala
      def addiereCurried(x: Int)(y: Int): Int = x + y
      val addiereMit5: Int => Int = addiereCurried(5) _
      ```

11. **FlatMap**:
    - Kombiniert die Operationen von map und flatten.
    - Beispiel:
      ```scala
      val worte = List("Hallo", "Welt")
      val buchstaben = worte.flatMap(_.toList)
      ```

12. **For Comprehensions**:
    - Bieten eine deklarative Möglichkeit, über Collections zu iterieren und Transformationen durchzuführen.
    - Beispiel:
      ```scala
      val result = for {
        x <- liste
        if x % 2 == 0
      } yield x * 2
      ```

Das sind einige der grundlegenden Konzepte und Funktionen in Scala mit Beispielen für jedes. Diese Konzepte bilden die Grundlage für die funktionale Programmierung in Scala und ermöglichen eine elegante und effektive Codierung.
