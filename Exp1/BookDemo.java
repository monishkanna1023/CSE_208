public class BookDemo{
    public static void main(String[] args){
        TextBook Iamreading=new TextBook("BKFF1971CB", "Post Office", "Charles Bukowski");
        Iamreading.Display();
        Iamreading.Update_Book_Details("BKNF1997MA", "Tuesdays with Morrie", "Mitch Albom");
        Iamreading.Display();
    }
}

class TextBook{
    String BookID,BookName, BookAuthor;
    TextBook(String Id, String name, String author){
        BookID=Id;
        BookName=name;
        BookAuthor=author;        
    }
    void Update_Book_Details(String ID, String Name, String Author){    
        BookID=ID;
        BookName=Name;
        BookAuthor=Author;    
    }
    void Display(){
        System.out.println("Name of the Book :"+ BookName);
        System.out.println("Author           :"+ BookAuthor);
        System.out.println("Book ID          :"+ BookID);
        System.out.println("/--------------------------------------------------------------------------------------------------------------------------/");
    }
}
