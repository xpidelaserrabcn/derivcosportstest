import java.util.ArrayList;

public class Node {
	
	String name;
	int depth;
	Node parent;
	ArrayList<Node> children;

	/**
	 * Create the imaginary node
	 */
	public Node() {
		name = "root";
		depth = 0;
		parent = null;
		children = new ArrayList<Node>();
	}
	
	/**
	 * Create a new node
	 * @param name Name of the node
	 * @param parent Parent of the node
	 */
	public Node(String name, Node parent) {
		this.name = name;
		depth = parent.getDepth() + 1;
		this.parent = parent;
		children = new ArrayList<Node>();
		parent.addChild(this);
	}
	
	/**
	 * Get the name of the node
	 * @return Name of the node
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the depth of the node
	 * @return
	 */
	public int getDepth() {
		return depth;
	}
	
	/**
	 * Get the parent of the node
	 * @return Parent of the node
	 */
	public Node getParent() {
		return parent;
	}
	
	/**
	 * Get the children of the node
	 * @return List of children of the node
	 */
	public ArrayList<Node> getChildren() {
		return children;
	}
	
	/**
	 * Add a new child to the list of children
	 * @param child New node
	 */
	public void addChild(Node child) {
		children.add(child);
	}
}

