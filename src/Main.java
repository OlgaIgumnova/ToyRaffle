import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        store.addToy(1, "Робот", 9, 15);
        store.addToy(2, "Машинка", 6, 13);
        store.addToy(3, "Кукла", 30, 60);
        store.addToy(4, "Пазл", 10, 6);

        store.setToyWeight(2, 30);

        store.play();

        try {
            store.getPrizeToy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
