package common;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/2/28 16:21
 */
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {

    private String  name;
    private  int age;

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public   void   print(){
        System.out.println("122444");
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
