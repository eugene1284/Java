package HomeWork6.model.service;

import HomeWork6.classes.data.impl.Computer;
import java.util.List;

public interface Sortable<T extends Computer> { // Computer - типизация Sortable, теперь
            // все интерфейсы, которые реализуют Sortable должны быть наследниками абстрактного класса Computer

    public List<T> sort(List<T> list);
}
