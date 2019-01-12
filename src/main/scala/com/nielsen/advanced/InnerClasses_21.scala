package com.nielsen.advanced

// classes have other classes as members
//Java:inner classes are members of the enclosing class
//Scala: bound to the outer object

class Graph {

// class Node is a path-dependent as it is nested in the class Graph
  class Node {//Inner class
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node) {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }
  }
  var nodes: List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}

class Graph1 {
  class Node1 {
    var connectedNode1s: List[Graph1#Node1] = Nil
    def connectTo(Node1: Graph1#Node1) {
      if (connectedNode1s.find(Node1.equals).isEmpty) {
        connectedNode1s = Node1 :: connectedNode1s
      }
    }
  }
  var Node1s: List[Node1] = Nil
  def newNode1: Node1 = {
    val res = new Node1
    Node1s = res :: Node1s
    res
  }
}

object InnerClasses_21 extends App {
  val graphr: Graph = new Graph
  val noder: graphr.Node = graphr.newNode
  val nodes: graphr.Node = graphr.newNode
  val nodet: graphr.Node = graphr.newNode
  noder.connectTo(nodes)
  nodet.connectTo(noder)


 //Scala does not allow us to mix nodes defined within one graph with the nodes of another graph,
  // since the nodes of the other graph have a different type.

  val graph1: Graph = new Graph
  val node1: graph1.Node = graph1.newNode
  val node2: graph1.Node = graph1.newNode
  node1.connectTo(node2)      // legal
  val graph2: Graph = new Graph
  val node3: graph2.Node = graph2.newNode
  //node1.connectTo(node3)      // illegal!

  //Graph#Node
  val graph3: Graph1 = new Graph1
  val graph4: Graph1 = new Graph1

  val node5: graph3.Node1 = graph3.newNode1
  val node6: graph4.Node1 = graph4.newNode1
  node5.connectTo(node6)

}
