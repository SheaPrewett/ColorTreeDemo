package TreeDemo;

import java.util.ArrayList;

/**
 * Created by student on 8/25/17.
 */
public class TreeDemo {

    // I'm sure there's a better way to handle the data stored in this variable, but persisting strings through this
    // kind of recursion is kind of throwing me for a loop
    private String resultsCache;

    public ArrayList<String> runDemo() {
        ArrayList<String> testResults = new ArrayList<String>();

        TreeDemo demo = new TreeDemo();

        TreeObject treeObject = new TreeObjectFactory().generateTree("default");
        System.out.println("Searching default color setup.");
        testResults.add(demo.findOrange(treeObject));

        treeObject = new TreeObjectFactory().generateTree("all_orange");
        System.out.println("Searching all-orange setup.");
        testResults.add(demo.findOrange(treeObject));

        treeObject = new TreeObjectFactory().generateTree("none_orange");
        System.out.println("Searching no-orange setup.");
        testResults.add(demo.findOrange(treeObject));

        return testResults;
    }

    public String findOrange(TreeObject treeObject) {
        resultsCache = "";
        int position = 1;
        int node = 1;
        String result = "";
        String color = treeObject.getColor();
        if (treeObject.getColor() == "orange") {
            resultsCache += printColorData(position, node, color, 1);
        }
        ArrayList<TreeObject> children = treeObject.getChildren();
        if (children != null && children.size() > 0) {
            orangeRecursion(node + 1, children, 1);
        }
        result = resultsCache;
        resultsCache = "";
        return result;
    }

    public void orangeRecursion(int node, ArrayList<TreeObject> children, int extra) {

        // Probably redundant check, but better safe than sorry
        if (children != null) {
            for (int index = 0; index < children.size(); index++) {
                TreeObject child = children.get(index);
                String color = child.getColor();
                if (color == "orange") {
                    resultsCache += printColorData(index + 1, node, color, extra);
                }
                ArrayList<TreeObject> nextChildren = child.getChildren();
                // Continue recursion if there are more children
                if (nextChildren != null && nextChildren.size() > 0) {
                    orangeRecursion(node + 1, nextChildren, index + 1);
                }
            }
        }

    }

    public String printColorData(int position, int node, String color, int extra) {
        String output = "Color " + color + " found at node " + node + ", branch number " + extra + ", position " + position + ".<br/>";
        System.out.println(output);
        return output;
    }

    public void debugWithHardCodedData(TreeObject treeObject) {
        // Hard-coded tree navigation for debug/setup purposes
        TreeObject object2A = treeObject.getChildren().get(0);
        TreeObject object2B = treeObject.getChildren().get(1);
        TreeObject object3AA = object2A.getChildren().get(0);
        TreeObject object3AB = object2A.getChildren().get(1);
        TreeObject object3AC = object2A.getChildren().get(2);
        TreeObject object3BA = object2B.getChildren().get(0);
        TreeObject object3BB = object2B.getChildren().get(1);
        TreeObject object4A = object3BA.getChildren().get(0);
        TreeObject object4B = object3BA.getChildren().get(1);
        TreeObject object4C = object3BA.getChildren().get(2);

        System.out.println(treeObject.getColor());
        System.out.println(object2A.getColor());
        System.out.println(object2B.getColor());
        System.out.println(object3AA.getColor());
        System.out.println(object3AB.getColor());
        System.out.println(object3AC.getColor());
        System.out.println(object3BA.getColor());
        System.out.println(object3BB.getColor());
        System.out.println(object4A.getColor());
        System.out.println(object4B.getColor());
        System.out.println(object4C.getColor());
    }
}
