package Classes;

public class Book {

        String Author;
        String Title;

        public Book(String author, String title) {
            Author = author;
            Title = title;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }


}
