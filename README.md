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

13. **Pipelines**:
    - Pipelines dienen dazu, Funktionen miteinander zu verketten, wobei der Rückgabewert einer Funktion als Parameter für die nächste Funktion verwendet wird.
    - Beispiel:
      ```scala
      val pipelineResult = liste
        .map(_ * 2)
        .filter(_ % 3 == 0)
        .sum
      ```

14. **IO-Typ**:
    - Der IO-Typ kapselt Operationen, die Seiteneffekte verursachen, und ermöglicht ihre verzögerte Ausführung.
    - Beispiel:
      ```scala
      import cats.effect.IO

      val ioAktion: IO[Unit] = IO(println("Hallo Welt"))
      ```

15. **Streams / LazyList**:
    - Streams und LazyLists repräsentieren Sequenzen von Elementen mit der Möglichkeit der Lazy Evaluation.
    - Beispiel:
      ```scala
      val unendlicherStream = Stream.from(1)
      val endlicherStream = (1 to 100).toStream
      ```

16. **Parallele Prozesse**:
    - Parallele Prozesse ermöglichen die gleichzeitige Ausführung von verschiedenen Teilen eines Programms auf mehreren CPU-Kernen.
    - Beispiel:
      ```scala
      import scala.concurrent.Future
      import scala.concurrent.ExecutionContext.Implicits.global

      val zukunft: Future[Int] = Future { 5 + 5 }
      ```

17. **Pattern Matching**:
    - Pattern Matching ist ein mächtiges Konstrukt in Scala, das verwendet wird, um Datenstrukturen zu durchsuchen und entsprechend zu handeln.
    - Beispiel:
      ```scala
      val zahl = 1
      val ergebnis = zahl match {
        case 0 => "Null"
        case 1 => "Eins"
        case _ => "Andere Zahl"
      }
      ```

18. **Sets**:
    - Sets speichern eindeutige Werte und eignen sich gut, um Duplikate zu vermeiden.
    - Beispiel:
      ```scala
      val set = Set(1, 2, 3)
      ```

19. **Maps**:
    - Maps bestehen aus Schlüssel-Wert-Paaren und ermöglichen das Mapping von einem Wert zu einem anderen.
    - Beispiel:
      ```scala
      val map = Map("eins" -> 1, "zwei" -> 2, "drei" -> 3)
      ```

20. **Tupel**:
    - Tupel sind geordnete Sammlungen von Elementen verschiedener Typen und haben eine feste Größe.
    - Beispiel:
      ```scala
      val paar = (1, "zwei")
      ```


21. **Traits**:
    - Traits sind ähnlich wie Interfaces in anderen Sprachen und ermöglichen die Definition von Wiederverwendbarkeit von Methoden und Feldern.
    - Beispiel:
      ```scala
      trait Greeting {
        def greet(): Unit = println("Hello!")
      }

      class Person extends Greeting

      val person = new Person
      person.greet() // Ausgabe: Hello!
      ```

22. **Higher-Kinded Types (HKT)**:
    - Erlaubt die Definition von abstrakten Typen, die über Typkonstruktoren parametrisiert sind.
    - Beispiel:
      ```scala
      trait Functor[F[_]] {
        def map[A, B](fa: F[A])(f: A => B): F[B]
      }
      ```

23. **Typeclasses**:
    - Typeclasses ermöglichen die Implementierung von Polymorphismus ohne Vererbung.
    - Beispiel:
      ```scala
      trait Printable[A] {
        def format(value: A): String
      }

      object PrintableInstances {
        implicit val printableString: Printable[String] = (value: String) => value
        implicit val printableInt: Printable[Int] = (value: Int) => value.toString
      }

      object Printable {
        def format[A](value: A)(implicit printable: Printable[A]): String = printable.format(value)
      }

      import PrintableInstances._
      val strResult = Printable.format("Hello") // Ausgabe: Hello
      val intResult = Printable.format(42)      // Ausgabe: 42
      ```


**Wichtige Fachbegriffe**

- **Call by reference:** Parameter werden als Referenz übergeben, sodass Änderungen an ihnen außerhalb der Funktion wirksam sind.
  Beispiel: 
  ```java
  void changeValue(int[] arr) {
      arr[0] = 100;
  }
  ```

- **Call by value:** Parameter werden als Kopie übergeben, Änderungen innerhalb der Funktion wirken sich nicht auf den Wert außerhalb der Funktion aus.
  Beispiel:
  ```java
  void changeValue(int x) {
      x = 100;
  }
  ```

- **Eager evaluation:** Ausdrücke werden sofort ausgewertet.
  Beispiel:
  ```scala
  val result = 3 + 4  // Ergebnis wird sofort berechnet
  ```

- **Impure functions:** Funktionen, die eine der Regeln für pure functions verletzen.
  Beispiel:
  ```java
  int calculate(int x) {
      return x + Math.random(); // Verletzt Regel 2, da Rückgabewert von Zufallszahl abhängt
  }
  ```

- **Lazy evaluation:** Ausdrücke werden erst ausgewertet, wenn ihr Ergebnis benötigt wird.
  Beispiel:
  ```scala
  val lazyResult = (1 to 1000000).map(_ * 2) // Wert wird erst bei Bedarf berechnet
  ```

- **Pure functions:** Funktionen, die drei Regeln erfüllen: nur ein Rückgabewert, abhängig nur von den Parametern und keine Veränderung existierender Werte.
  Beispiel:
  ```scala
  def add(a: Int, b: Int): Int = a + b // Pure Funktion, da nur von den Parametern abhängig
  ```

- **Referenzielle Transparenz:** Eine Funktion ist referenziell transparent, wenn ihr Aufruf durch ihren Rückgabewert ersetzt werden kann, ohne das Programmverhalten zu ändern.
  Beispiel:
  ```scala
  val sum = (x: Int, y: Int) => x + y
  println("Sum of 4+5: " + sum(4, 5))  // Kann durch println("Sum of 4+5: " + 9) ersetzt werden
  ```

- **Rekursion:** Eine Funktion, die sich selbst aufruft, mit einem Abbruchkriterium, um Endlosschleifen zu vermeiden.
  Beispiel:
  ```scala
  def factorial(n: Int): Int = {
      if (n <= 1) 1
      else n * factorial(n - 1)
  }
  ```
