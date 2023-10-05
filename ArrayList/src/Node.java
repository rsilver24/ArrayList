// Roan Silver      Created: September 21st 2023        Last Edits: September 26th, 2023
// Collaborators: Luke O'Drobinak & Ethan Ayers       Peer Comments: September 4th, 2023
public class Node<T> {

    // Instance Data !!!

    private Node parentNode;
    private Node childNode;
    private T value;

    // CONSTRUCTORS :D

    // Default "Empty" Constructor
    public Node(){
        parentNode = null;
        childNode = null;
        value = null;
    }

    // 1 Input Constructor
    public Node(T valueInput){
        this.value = valueInput;
        parentNode = null;
        childNode = null;
    }

    // 3 Input Constructor
    public Node(T valueInput, Node parentNodeInput, Node childNodeInput){
        this.value = valueInput;
        this.parentNode = parentNodeInput;
        this.childNode = childNodeInput;
    }

    // ACCESSORS :)

    public Node getParentNode(){
        return parentNode;
    }

    public Node getChildNode(){
        return childNode;
    }

    public T getValue(){
        return value;
    }

    // MUTATORS :/

    public void setParentNode(Node newParentNode){
        parentNode = newParentNode;
    }

    public void setChildNode(Node newChildNode){
        childNode = newChildNode;
    }

    public void setValue(T newValue){
        value = newValue;
    }

    // Method Overrides >:(

    public String toString(){
        return "Node: " + value;
    }

    public boolean equals(Node passingNode){
        if (this.getValue().equals(passingNode.getValue())){
            return true;
        } return false;
    }
}
