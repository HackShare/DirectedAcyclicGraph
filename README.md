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
following code snippet shows how to get the topological order,

    DAGShortestPath dagShortestPath=new DAGShortestPath();
	dagShortestPath.findShortestPath();

###Input
	3 3
	1 2 1
	2 3 2
	1 3 3

First integer is the total number of vertices |V| in the graph G. The next integer is the number of edges |E| in the graph.
Next |E| lines has the edges information (u, v, w). All inputs must be given through terminal.

###Output
	 Distance for 1 is 0
	 Distance for 2 is 1
	 Distance for 3 is 3
  
##Project Contributor

* Dinesh Appavoo ([@DineshAppavoo](https://twitter.com/DineshAppavoo))