package src.MD2_Student;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public double[] scores;

    Scanner sc = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = sc.nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = sc.nextInt();
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public Student (String name, int age, double[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public double avg() {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

    public void changeProfile() {
        System.out.println("Enter new name: ");
        setName(this.name);
        System.out.println("New Name: " + this.name);

        System.out.println("Enter new age: ");
        setAge(this.age);
        System.out.println("New Age: " + this.age);

    }
    @Override
    public String toString() {
        return "Student" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scores=" + Arrays.toString(scores)
                + "AVG point= " + avg();
    }
}
