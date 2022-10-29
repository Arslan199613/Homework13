public class Main {
    public static void main(String[] args) {
        Author author1 = new Author(" Грум ", " Уинстон ");
        Book book1 = new Book(" Форрест Гамп ", author1, 1896);
        Author author2 = new Author(" Лев ", " Толстой ");
        Book book2 = new Book(" Анна Каренина ", author2, 1878);
        book1.setYearOfPublishing(777);
        System.out.println(book1.getYearOfPublishing());
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book2));

    }
}