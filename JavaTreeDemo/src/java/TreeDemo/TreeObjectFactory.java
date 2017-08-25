package TreeDemo;

import java.util.ArrayList;

/**
 * Created by Shea Prewett on 8/25/17.
 * This class generates a tree of objects with String color data
 */
public class TreeObjectFactory {

    public TreeObject generateTree(String colorSettings) {

        ArrayList<String> colorFormat = configureColors(colorSettings);
        int colorIndex = 0;

        // Put together each individual tree object
        TreeObject topLevelTreeObject = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;
        TreeObject secondLevelTreeObjectA = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;
        TreeObject secondLevelTreeObjectB = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;

        TreeObject thirdLevelTreeObjectAFirst = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;
        TreeObject thirdLevelTreeObjectASecond = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;
        TreeObject thirdLevelTreeObjectAThird = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;

        TreeObject thirdLevelTreeObjectBFirst = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;
        TreeObject thirdLevelTreeObjectBSecond = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;

        TreeObject fourthLevelTreeObjectAFirst = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;
        TreeObject fourthLevelTreeObjectASecond = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;
        TreeObject fourthLevelTreeObjectAThird = new TreeObject(colorFormat.get(colorIndex));
        colorIndex++;

        // Assign the tree objects to ArrayList fields to build out the tree hierarchy

        ArrayList<TreeObject> thirdLevelTreeChildrenA = new ArrayList<TreeObject>();
        thirdLevelTreeChildrenA.add(fourthLevelTreeObjectAFirst);
        thirdLevelTreeChildrenA.add(fourthLevelTreeObjectASecond);
        thirdLevelTreeChildrenA.add(fourthLevelTreeObjectAThird);
        thirdLevelTreeObjectBFirst.setChildren(thirdLevelTreeChildrenA);

        ArrayList<TreeObject> secondLevelTreeChildrenA = new ArrayList<TreeObject>();
        secondLevelTreeChildrenA.add(thirdLevelTreeObjectAFirst);
        secondLevelTreeChildrenA.add(thirdLevelTreeObjectASecond);
        secondLevelTreeChildrenA.add(thirdLevelTreeObjectAThird);
        secondLevelTreeObjectA.setChildren(secondLevelTreeChildrenA);

        ArrayList<TreeObject> secondLevelTreeChildrenB = new ArrayList<TreeObject>();
        secondLevelTreeChildrenB.add(thirdLevelTreeObjectBFirst);
        secondLevelTreeChildrenB.add(thirdLevelTreeObjectBSecond);
        secondLevelTreeObjectB.setChildren(secondLevelTreeChildrenB);

        ArrayList<TreeObject> topLevelTreeChildren = new ArrayList<TreeObject>();
        topLevelTreeChildren.add(secondLevelTreeObjectA);
        topLevelTreeChildren.add(secondLevelTreeObjectB);
        topLevelTreeObject.setChildren(topLevelTreeChildren);

        return topLevelTreeObject;
    }

    // Build an array of color string values to easily test various cases
    public ArrayList<String> configureColors(String configuration) {
        ArrayList<String> colorFormat = new ArrayList<String>();
        // Check the configuration string for instructions
        if (configuration == "all_orange") {
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("orange");
            // Interpret all non-specialized color configurations as default, instead of requiring a specific string
        } else if (configuration == "none_orange") {
            colorFormat.add("red");
            colorFormat.add("blue");
            colorFormat.add("red");
            colorFormat.add("blue");
            colorFormat.add("red");
            colorFormat.add("blue");
            colorFormat.add("red");
            colorFormat.add("blue");
            colorFormat.add("red");
            colorFormat.add("blue");
            colorFormat.add("red");
        } else {
            colorFormat.add("red");
            colorFormat.add("blue");
            colorFormat.add("orange");
            colorFormat.add("red");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("red");
            colorFormat.add("orange");
            colorFormat.add("orange");
            colorFormat.add("blue");
            colorFormat.add("red");
        }
        return colorFormat;
    }

}
