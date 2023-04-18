public class Container<L> {

    private L value;

    public Container(L value){
        this.value = value;
    }

    public L getValue() {
        return value;
    }

    public void setValue(L value) {
        this.value = value;
    }
}
