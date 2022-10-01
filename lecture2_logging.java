import java.io.IOException;
import java.util.logging.*;

public class lecture2_logging {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(lecture2_logging.class.getName());
        FileHandler fh = new FileHandler("lecture2_log.xml");
        logger.addHandler(fh);

        
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);


        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
}