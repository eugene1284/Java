import java.io.File;
import java.lang.System.Logger.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class lecture2 {
    public static void main(String[] args, java.util.logging.Level level) {

        // создаём строку из 1000000 плюсиков двумя способами
        /* 1. */ String str = "";
        for (int i = 0; i < 100; i++) { // выполнение данного цикла занимает 41 секунды
            str += "+";
        }

        /* 2. */ StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) { // выполнение данного цикла занимает менее 1 сек
            sb.append("+");
        }

        String[] name = { "С", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА";
        System.out.println(sk.toLowerCase()); // сергей ка
        System.out.println(String.join("", name)); // Сергей
        System.out.println("String.join: " + String.join("", "С", "е", "р", "г", "е", "й")); // Сергей
        System.out.println("String.join: " + String.join(",", "С", "е", "р", "г", "е", "й")); // С,е,р,г,е,й

        File f1 = new File("file.txt");
        File f2 = new File("/users/...");

        // Обработка исключений (под исключениями мы понимаем ошибку)
        try {
            // код, в котором может появиться ошибка
        } catch (Exception e) {
            // TODO: handle exception
            // обработка, если ошибка случилась
        } finally {
            // код, который выполнится в любом случае
        }

        System.out.println("");
        System.out.println("Блок Работа с исключениями:");
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }

        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

        System.out.println("");
        System.out.println("Блок Логгирование:");
        Logger logger = Logger.getLogger(lecture2.class.getName());
        ConsoleHandler ch = new ConsoleHandler(); // это чтобы наши ошибки выводились в терминал
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(sFormat);
        //ch.setFormatter(xml);

        logger.log(level.WARNING, "Тестовое логирование1");
        logger.info("Тестовое логирование2");

    }
}
