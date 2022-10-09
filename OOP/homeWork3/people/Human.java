/*
// ToDo: Класс Human со своими параметрами (прмер: name, surname, age, gender);
// ToDo: Enum Relation содержащий типы связей между людей (пример: Родитель, Ребенок, Муж и тд)
// ToDo: Класс Relative содержащий в себе двух людей и связь между ними (Human, Human, Relation)
// ToDo: Записать в 2 коллекции [люди], [отношения];
// ToDo: Создать сервисы для взаимодействия с Human, Relative
// ToDo: Создать контроллер в котором используем логику сервисов по поиску по спискам Human и Relative
// ToDo: в main инициализировать коллекции и вызвать контроллер
 */

package OOP.homeWork3.people;

public class Human {
    private String name;
    private String surname;
    private Gender gender;
    private String age;


    public Human(String name, String surname, Gender gender, String age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", age='" + age + '\'' +
                '}';
    }
}
