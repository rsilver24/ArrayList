public class ArrayList<T> {

    private Node value1;
    private int size;

    public ArrayList(){
        size = 0;
    }

    public boolean add(T data){
        Node newValue = new Node();
        Node subNode = new Node();
        newValue.setValue(data);
        for (int i = 0; i <= size(); i++){
            newValue.setParentNode(newValue.getChildNode());
        }
    }

    public void add(int i, T data){

    }

    public T remove(int i){

    }

    public T get(int i){
        Node nodeValue = new Node();
        if (i == 0){
            nodeValue = value1;
            return (T) nodeValue;
        }
        for (int k = 0; k < i; k++) {
            nodeValue = nodeValue.getChildNode();
        }
        return (T) nodeValue.getValue();
    }

    public T set(int i, T data){

    }

    public int size(){
        return size;
    }
}