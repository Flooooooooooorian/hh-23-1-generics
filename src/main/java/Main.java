public class Main {

    public static void main(String[] args) {
        Container<Boolean> booleanContainer = new Container<>(true);

        booleanContainer.setValue(false);
        System.out.println(booleanContainer.getValue());

        Container<String> stringContainer = new Container<>("Test");
    }
}
