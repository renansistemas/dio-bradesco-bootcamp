package br.com.renan.functionalinterfaces;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Renan", 22),
                new User("Giovana", 22),
                new User("Leticia", 22));
        //users.forEach(System.out::println);
        //printStringValue(User::name, users);
        printStringValue(Record::toString, users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}