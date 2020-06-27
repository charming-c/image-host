package arraylist.set;

import java.util.Objects;

public class Person{
    int age;

    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Person person) {
        if(age>person.getAge())
        return 1;
        else return 0;
    }

//    @Override
//    public boolean equals(Object o) {
//        System.out.println("调用了equals方法");
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        if(((Person) o).age==person.getAge()&&((Person) o).name==person.getName()) return true;
//        else return false;
//    }
//
//    @Override
//    public int hashCode() {
//        System.out.println("调用了hashCode方法");
//        return 55;
//    }
}
