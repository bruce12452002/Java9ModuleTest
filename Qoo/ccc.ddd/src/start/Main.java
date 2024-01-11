package start;

import entity.Banana;
import qoo.aaa.User;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        new User();
        new Main().reflectionTest();
    }

    private void reflectionTest() {
        // User 在別的模組，所以有可能會報下面的錯
        // InaccessibleObjectException 必需 opens 或 open
        Class<User> uc = User.class;
        Stream.of(uc).forEach(c -> {
            Stream.of(c.getDeclaredFields()).forEach(f -> {
                f.setAccessible(true);
            });
        });

        // Banana 在自己的模組，不會報錯
//        Class<Banana> bc = Banana.class;
//        Stream.of(bc).forEach(c -> {
//            Stream.of(c.getDeclaredFields()).forEach(f -> {
//                f.setAccessible(true);
//            });
//        });
    }
}
