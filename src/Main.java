public class Main {

	/**
	 * Main method to run the application. It allows a user to create a hierarchical menu and print it 
	 * @param args
	 * @throws Exception A parent name does not exist
	 */
	public static void main(String[] args) throws Exception {
		//First, Create a list of nodes and the first node, 
		//which is imaginary and holds the whole structure
		ListNodes nodes = new ListNodes();
		Node root = new Node();
		nodes.addNode(root);
		
		//From now, let's ask the user about the new entries
		while (true) {
			//Ask the next tab name and its parent name
			System.out.println("Enter the new tab name or type Print to see the menu:");
			String name = System.console().readLine();
			
			//If the user wants to see the tree, print it
			if (name.equals("Print")) {
				nodes.printNodes("root", 0);
				System.exit(0);
			}
			//Otherwise, ask for the parent node of the new node
			else {
				System.out.println("Enter the parent tab name (empty if no parent):");
				String parentName = System.console().readLine();
				
				//If the user says there is no parent, attach it to our imaginary node
				if (parentName.equals("")) parentName = "root";
				Node parent = nodes.getNode(parentName);
				
				//If the entered parent name doesn't exist, there has been a failure
				if (parent == null) throw new Exception ("The tab " + parentName + " does not exist");
				
				//Create the new node and add it into the list
				Node node = new Node(name, parent);
				nodes.addNode(node);
			}
		}
	}
}
