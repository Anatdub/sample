
// Программа Java для иллюстрации
// концепции Composition 
import java.util.*; 
  
// Класс Book 
class Book  
{ 
  
    public String title; 
    public String author; 
      
    Book(String title, String author) 
    { 
          
        this.title = title; 
        this.author = author; 
    } 
} 
  
// Класс Libary содержит  
// список книг. 
class Library  
{ 
  
    // ссылка на список книг в библиотеке. 
    private final ArrayList<Book> books; 
      
    Library (ArrayList<Book> books) // конструктор
    { 
        this.books = books;  
    } 
      
    public ArrayList<Book> getTotalBooksInLibrary(){ 
          
       return books;   
    } 
      
} 
  
// метод main 
class TestComposition  
{ 
    public static void main (String[] args)  
    { 
          
        // Создание объектов класса Book
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch"); 
        Book b2 = new Book("Thinking in Java", "Bruce Eckel"); 
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt"); 
          
        // Создание списка, который содержит  
        //  книги. 
        ArrayList<Book> books = new ArrayList<>(); 
        books.add(b1); 
        books.add(b2); 
        books.add(b3); 
          
        Library library = new Library(books); 
          
        List<Book> bks = library.getTotalBooksInLibrary(); 
        for(Book bk : bks){ 
              
            System.out.println("Title : " + bk.title + " and " 
            +" Author : " + bk.author); 
        } 
    } 
} 
