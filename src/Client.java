import java.util.Random;

public class Client {
    String name;
    String surname;
    int age;
    Address address;

    int add(int a, int b) {
        return a + b;
    }

    int wymyslLiczbe() {
        Random random = new Random();
        return random.nextInt(0,101);
    }

    int wymyslLiczbe(int podpowiedz) {
        return podpowiedz * 6;
    }

    void wyswietlImie() {
        System.out.println(name);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(this.age);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
