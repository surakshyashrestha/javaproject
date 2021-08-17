/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookinfo;
/**
 *
 * @author hp
 */
public class table {
    public int bookid;
    public String genre;
    public String bookname;
    public String author;
    public String language;
    public int rate;
    
    public table(int bookid, String genre, String bookname, String author, String language, int rate)
    {
        this.bookid = bookid;
        this.genre = genre;
        this.bookname = bookname;
        this.author = author;
        this.language = language;
        this.rate = rate;
        
    }


    
    public int getbookid(){
        return bookid;
    }
    public String getgenre(){
        return genre;
    }
    public String getbookname(){
        return bookname;
    }
    public String getauthor(){
        return author;
    }
    public String getlanguage(){
        return language;
    }
    public int getrate(){
        return rate;
    }
    
    public Object[] getbook(){
        String sbook = Integer.toString(bookid);
        String srate = Integer.toString(rate);
        Object book [] = {sbook, genre, bookname, author, language, srate};
        return book;
        
        
    }
}
