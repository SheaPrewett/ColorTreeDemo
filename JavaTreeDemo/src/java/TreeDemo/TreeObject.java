package TreeDemo;

import java.util.ArrayList;

/**
 * Created by student on 8/25/17.
 * Object with color data, and an ArrayList for linking child objects of the same type
 */
public class TreeObject {

    private String color;
    private ArrayList<TreeObject> children;

    public TreeObject() {}

    public TreeObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<TreeObject> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeObject> children) {
        this.children = children;
    }


}
