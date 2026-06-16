public class IntegerNode{
    private final Integer object;
    private IntegerNode next;

    public IntegerNode(Integer object){
        this.object = object;
        this.next = null;
    }

    public Integer getObject(){return object;}
    public IntegerNode getNext(){return next;}
    public void setNext(IntegerNode next){this.next = next;}
}