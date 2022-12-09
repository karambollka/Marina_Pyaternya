package ua.hillel.homework11;

import com.github.javafaker.Faker;

public class FakerEx {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i=0; i<3; i++) {
            String name = faker.name().firstName();
            String lastname = faker.name().lastName();

            System.out.println(name + " " + lastname);
        }
    }
}
