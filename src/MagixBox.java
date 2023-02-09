import java.util.Random;

public class MagixBox <T>{
    protected T[] item;
    protected int size;


    public MagixBox(int size) {
        this.item =  (T[]) new Object[size];
        this.size = size;
    }

    boolean add(T items){
        for (int i = 0; i < item.length; i++)
            if (item[i] == null) {
                item[i] = items;
                return true;
            }
        return false;
    }

    T peek() {
        for (int i = 0; i < item.length; i++)
            if (item[i] == null) {
                throw new RuntimeException("коробка не полна");
            }

        Random random = new Random();
        return (T) item[random.nextInt(item.length)];

    }
}


