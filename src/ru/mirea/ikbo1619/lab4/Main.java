package ru.mirea.ikbo1619.lab4;

public class Main {

    public static void main(String[] args) {
	Author author1 = new Author("Pushkin", "pushkin@yandex.ru",'m');
	System.out.println(author1);
	author1.setEmail("pushkin228@yandex.ru");
	System.out.println(author1);
	System.out.println(author1.getName());
    }
}
