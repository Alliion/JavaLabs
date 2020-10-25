package lab2;

public class AuthorTest {
    public static void main(String[] args) {
        Author author1=new Author("Jack London", "jlondon@gmail.com", 'M');
        Author author2=new Author("Harper Lee","harper_lee26@yandex.ru",'F');
        System.out.println(author1);
        System.out.println(author2.getGender());
        System.out.println(author2.getName());
        System.out.println(author2.getEmail());
    }
}
