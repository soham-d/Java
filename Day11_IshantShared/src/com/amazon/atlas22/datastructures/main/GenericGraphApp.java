package com.amazon.atlas22.datastructures.main;

import java.util.HashMap;
import java.util.LinkedList;

import com.amazon.atlas22.datastructures.GenericGraph;
import com.amazon.atlas22.datastructures.model.RailwayStations;
import com.amazon.atlas22.datastructures.model.User;

public class GenericGraphApp {

	public static void main(String[] args) {
		
		/*HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(201, "Anna");
		map.put(301, "Dave");
		
		String name = map.get(101);
		System.out.println(name);
		
		for(int key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		
		HashMap<String, LinkedList<String>> map1 = new HashMap<String, LinkedList<String>>();
		map1.put("john", new LinkedList<String>());
		map1.put("fionna", new LinkedList<String>());
		map1.put("dave", new LinkedList<String>());
		
		LinkedList<String> list = map1.get("fionna");
		list.add("harry");
		list.add("sia");
		list.add("joe");
		
		System.out.println("KEYS: "+map1.keySet());
		
		for(String key : map1.keySet()) {
			
			LinkedList<String> data = map1.get(key);
			
			for(String str : data) {
				System.out.print(str+" ");
			}
			System.out.println();
		}*/
		
		
		// Create a Graph Data Structure of Integers :)
		// https://visualgo.net/en/graphds
		GenericGraph<Integer> graph1 = new GenericGraph<Integer>();
		graph1.addEdge(0, 1);
		graph1.addEdge(0, 2);
		
		graph1.addEdge(1, 2);
		graph1.addEdge(1, 3);
		
		graph1.addEdge(2, 4);
		
		graph1.addEdge(3, 4);
		
		graph1.addEdge(4, 5);
		
		graph1.addEdge(5, 6);
		
		System.out.println();
		graph1.printAdjList();
		
		
		
		// Create a Graph Data Structure of Users :)
		GenericGraph<User> graph2 = new GenericGraph<User>();

		User user0 = new User("0. Sia", "sia@example.com", "9999911111");
		User user1 = new User("1. Kim", "kim@example.com", "9999912345");
		User user2 = new User("2. Leo", "leo@example.com", "9999918877");
		User user3 = new User("3. Mike", "mike@example.com", "8799911877");
		User user4 = new User("4. Dave", "dave@example.com", "8999966111");
		User user5 = new User("5. Fionna", "fionna@example.com", "9988918881");
		User user6 = new User("6. Anna", "anna@example.com", "7879911901");
		
		//System.out.println(user0);
		
//		graph3.addEdge(user0, user1);
//		graph3.addEdge(user0, user2);
//
//		graph3.addEdge(user1, user2);
//		graph3.addEdge(user1, user3);
//
//		graph3.addEdge(user2, user4);
//
//		graph3.addEdge(user3, user4);
//
//		graph3.addEdge(user4, user5);
//
//		graph3.addEdge(user5, user6);
//
//		System.out.println();
//		graph3.printAdjList();



		GenericGraph<RailwayStations> graph3 = new GenericGraph<RailwayStations>();

		RailwayStations railwayStation0 = new RailwayStations("Nagpur1", "Nagpur","NGP");
		RailwayStations railwayStation1 = new RailwayStations("Nagpur2", "Nagpur","NGP2");
		RailwayStations railwayStation2 = new RailwayStations("CST", "Mumbai","CSMT");
		RailwayStations railwayStation3 = new RailwayStations("Dadar", "Mumbai","D");
		RailwayStations railwayStation4 = new RailwayStations("Thane", "Mumbai","TNA");
		RailwayStations railwayStation5 = new RailwayStations("Secunderabad", "Hyderabad","SC");
		RailwayStations railwayStation6 = new RailwayStations("Deccan", "Hyderabad","HYB");



		graph3.addEdge(railwayStation0, railwayStation1);
		graph3.addEdge(railwayStation0, railwayStation2);

		graph3.addEdge(railwayStation1, railwayStation2);
		graph3.addEdge(railwayStation1, railwayStation3);

		graph3.addEdge(railwayStation2, railwayStation4);

		graph3.addEdge(railwayStation3, railwayStation4);

		graph3.addEdge(railwayStation4, railwayStation5);

		graph3.addEdge(railwayStation5, railwayStation6);

		System.out.println();
		graph3.printAdjList();
		
	}

}
