// Roan Silver + Brandon Malley     Last Edits: October 10th, 2023
// Collaborators:
public class ArrayList<T> {

    // Instance Data

    private Node value1;
    private int size;

    // Default Constructor

    public ArrayList(){
        size = 0;
        value1 = new Node();
    }

    // Methods

    // Default Add Method

    public boolean add(T data){
        Node newValue = new Node();
        newValue.setValue(data);

        if (size == 0){
            value1 = newValue;
        } else if (size == 1){
            value1.setChildNode(newValue);
            newValue.setParentNode(value1);
        } else{
            newValue.setParentNode(value1);
            for (int i = 1; i < size(); i++){
                newValue.setParentNode(newValue.getParentNode().getChildNode());
            } newValue.getParentNode().setChildNode(newValue);
        }
        size++;
        return true;
    }

    // Add @ Index Method

    public void add(int index, T data){
        Node newValue = new Node();
        newValue.setValue(data);
        Node tempNode = value1;

        if (index == 0){
            newValue.setParentNode(value1);
            newValue.setChildNode(value1.getChildNode());
            value1.getChildNode().setParentNode(newValue);
            value1.setChildNode(newValue);
            newValue.setValue(value1.getValue());
            value1.setValue(data);
        } else{
            for (int i = 0; i < index; i++){
                tempNode = tempNode.getChildNode();
            } tempNode.getParentNode().setChildNode(newValue);
            newValue.setParentNode(tempNode.getParentNode());
            tempNode.setParentNode(newValue);
            newValue.setChildNode(tempNode);
        } size++;
    }

    // Remove Method

    public T remove(int index){
        Node tempNode = value1;
        T retValue;

        if (index == 0){
            retValue = (T) value1.getValue();
            value1 = value1.getChildNode();
            value1.setParentNode(null);
        } else{
            for (int i = 0; i < index; i++){
                tempNode = tempNode.getChildNode();
            } retValue = (T) tempNode.getValue();
            tempNode.getParentNode().setChildNode(tempNode.getChildNode());
            tempNode.getChildNode().setParentNode(tempNode.getParentNode());
        } size--;
        return retValue;
    }

    // Get Method
  
    public T get(int index){
        Node nodeValue = value1;
        if (index == 0){
            return (T) nodeValue.getValue();
        }
        for (int k = 0; k < index; k++) {
            nodeValue = nodeValue.getChildNode();
        }
        return (T) nodeValue.getValue();
    }

    // Set Method

    public T set(int index, T data){
        Node tempNode = value1;
        T retValue;

        if (index == 0){
            retValue = (T) value1.getValue();
            value1.setValue(data);
        } else{
            for (int i = 0; i < index; i++){
                tempNode = tempNode.getChildNode();
            } retValue = (T) tempNode.getValue();
            tempNode.setValue(data);
        } return retValue;
    }

    // Size Method

    public int size(){
        return size;
    }
}
