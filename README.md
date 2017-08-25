# ColorTreeDemo
This is a demo of a Java application designed to navigate a tree of objects, and output the relative location of each object with the color of orange.
### [Demo hosted on AWS](http://52.14.153.185:8080/JavaTreeDemo/)
## Classes
### [TreeObject](/JavaTreeDemo/src/java/TreeDemo/TreeObject.java)
This class has two variables: a String for the color, and an ArrayList of child TreeObjects. It has getters and setters, and two constructors: one for instantiating an empty object, one for instantiating directly with a color.
### [TreeObjectFactory](/JavaTreeDemo/src/java/TreeDemo/TreeObjectFactory.java)
This class generates a tree structure of objects with various colors. It has a method that outputs a different set color structure based on input string, and another method that uses that color structure to set the color for each object in the tree that it generaets.
### [TreeDemo](/JavaTreeDemo/src/java/TreeDemo/TreeDemo.java)
This class has a method that takes the top parent TreeObject in a tree, uses a recursive method to navigate and iterate through each object in sequence and another method it calls to output the location of each object with the color orange. It also has a method that sets up a test for each current color structure and returns an ArrayList with Strings, one String for the full formatted result of each color structure search.
### [HomePageServlet](/JavaTreeDemo/src/java/TreeDemo/HomePageServlet.java)
This class is a servlet set as the default home destination. On the default GET call, it collects the ArrayList of test result strings from TreeDemo and assigns them as HttpServletRequest attributes for JSTL to load onto the page.
