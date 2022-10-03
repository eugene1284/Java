package HomeWork6.service;

import HomeWork6.data.Computer;
import java.util.List;

public interface Sortable<T extends Computer> { // Computer - типизация Sortable, теперь
            // все интерфейсы, которые реализуют Sortable должны быть наследниками абстрактного класса Computer

    public List<T> sort(List<T> list);
}
