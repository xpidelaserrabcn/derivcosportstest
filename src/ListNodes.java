import java.util.ArrayList;

public class ListNodes {

	private ArrayList<Node> nodes;
	
	public ListNodes() {
		nodes = new ArrayList<Node>();
	}
	
	/**
	 * Get the number of nodes in the list
	 * @return
	 */
	public int getSize() {
		return nodes.size();
	}
	
	/**
	 * Get a node by its name
	 * @param name Name of the node
	 * @return Node with name equals to the parameter
	 */
	public Node getNode(String name) {
		for (int i = 0; i < nodes.size(); ++i) {
			if (nodes.get(i).getName().equals(name)) {
				return nodes.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Add a node to the list
	 * @param node Node to add
	 */
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	/**
	 * Print the hierarchical tree of nodes
	 * @param nodeName Name of the root node to start printing from
	 */
	public void printNodes(String nodeName, int depth) {
		System.out.println(depth);
		//Obtain the node
		Node node = getNode(nodeName);
		
		//For each child, print it with the matching indent depending on its depth on the structure
		for (int i = 0; i < node.getChildren().size(); ++i) {
			String childName = node.getChildren().get(i).getName();
			String text = "";
			for (int j = 0; j < depth; ++j) {
				text += "    ";
			}
			System.out.println(text + "-" + childName);
			//Repeat the process starting from the child
			printNodes(childName, depth+1);
		}
	}
}
