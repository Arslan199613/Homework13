public class Main {
    public static void main(String[] args) {
        Author author1 = new Author(" Грум ", " Уинстон ");
        Book book1 = new Book(" Форрест Гамп ", author1, 1896);
        Author author2 = new Author(" Лев ", " Толстой ");
        Book book2 = new Book(" Анна Каренина ", author2, 1878);
        System.out.println(book1.toString());
        System.out.println(book2.toString());

    }
}