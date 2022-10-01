package lecture6;
public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format("%s %d", firstName, salary);
        return res;
    }

    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override // тут мы переопределяем hashCode, нашим хэшом является id
    public int hashCode() {
        return id;
    }
}
