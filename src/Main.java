public class Main {
    public static void main(String[] args) {

        MagixBox<String> stringMagixBox = new MagixBox<>(1);
        System.out.println(stringMagixBox.add("231114"));
        System.out.println(stringMagixBox.add("fsd"));
        System.out.println(stringMagixBox.add("545445"));
        System.out.println(stringMagixBox.add("9877"));
        String peek= stringMagixBox.peek();
        System.out.println(peek);
    }
}
