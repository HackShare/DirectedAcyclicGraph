Directed Acyclic Graph Shortest Path
=========

A directed acyclic graph, is a directed graph with no directed cycles. That is, it is formed by a collection of vertices 
and directed edges, each edge connecting one vertex to another, such that there is no way to start at some vertex v and 
follow a sequence of edges that eventually loops back to v again

##Complexity
	  Worst case performance  O(|E| + |V|)
	  Worst case space complexity O (|V|)

##Install

This library has the java implementation of directed acyclic graph (DAG) shortest path algorithm to find the shortest path in a DAG G=[V,E].The 
following code snippet shows how to get the shortest path,

    DAGShortestPath dagShortestPath=new DAGShortestPath();
	dagShortestPath.findShortestPath();

###Input
	8 9
	1 4 1
	1 5 2
	2 4 3
	3 5 4
	3 8 5
	4 6 6
	4 7 7
	4 8 8
	5 7 9

First integer is the total number of vertices |V| in the graph G. The next integer is the number of edges |E| in the graph.
Next |E| lines has the edges information (u, v, w). All inputs must be given through terminal.

###Output
	Distance for 1 is 0
	Distance for 2 is 0
	Distance for 3 is 0
	Distance for 4 is 1
	Distance for 5 is 2
	Distance for 6 is 7
	Distance for 7 is 8
	Distance for 8 is 5
  
##Project Contributor

* Dinesh Appavoo ([@DineshAppavoo](https://twitter.com/DineshAppavoo))