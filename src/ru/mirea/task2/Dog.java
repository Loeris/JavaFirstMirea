package ru.mirea.task2;

public class Dog {
    private String petName;
    private int age;
    private boolean isChangePetName = false;
    private boolean isChangeAge = false;

    public Dog() {

    }

    public Dog(String petName, int age) {
        this.petName = petName;
        isChangePetName = true;
        this.age = age;
        isChangeAge = true;
    }

    @Override
    public String toString() {
        return "Я собака. Кличка: " + petName + ". Возраст: " + age + ".";
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int humanAge() {
        return age*7;
    }
}
