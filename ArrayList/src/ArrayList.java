public class ArrayList<T> {

    // Instance Data

    private Node value1;
    private int size;

    // Default Constructor

    public ArrayList(){
        size = 0;
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

    }

    // Remove Method

    public T remove(int index){

    }

    // Get Method

    public T get(int index){
    }

    // Set Method

    public T set(int index, T data){

    }

    // Size Method

    public int size(){
        return size;
    }
}
