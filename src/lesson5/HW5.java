/**
 * Java1.HW5
 * @ author Anton Filatov
 * @ version 26.12.2021
 */

package lesson5;

class HW5 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30),
                new Person("Petrov Ivan", "Engineer", "petrov@mailbox.com", 892312313, 40000, 35),
                new Person("Sidorov Ivan", "Engineer", "sidorov@mailbox.com", 892312314, 50000, 35),
                new Person("Orlov Ivan", "Engineer", "Orlov@mailbox.com", 892312315, 60000, 40),
                new Person("Gusev Ivan", "Engineer", "Gusev@mailbox.com", 892312316, 70000, 50)
        };
        for (Person person : persons) {
            if (person.getAge() > 40) {
                System.out.println("age over 40" + " : " + person);
            }
        }
    }
}

class Person {
    private String name;
    private String post;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Person(String name, String post, String email, int phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return (name+
                "\n- " + post +
                "\n- " + email +
                "\n- " + phone +
                "\n- " + salary+
                "\n- " + age);
    }
}






