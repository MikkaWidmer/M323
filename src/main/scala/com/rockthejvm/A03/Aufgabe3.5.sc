sealed trait Tree[A]
case class Leaf[A](value: A) extends Tree[A]
case class Node[A](children: List[Tree[A]]) extends Tree[A]

def flattenTree[A](tree: Tree[A]): List[A] = tree match {
  case Leaf(value) => List(value)
  case Node(children) => children.flatMap(flattenTree)
}

// Beispielaufruf
val tree = Node(List(Leaf(1), Node(List(Leaf(2), Leaf(3))), Leaf(4)))
val flattenedLeaves = flattenTree(tree)
println(flattenedLeaves) // Ausgabe: List(1, 2, 3, 4)
