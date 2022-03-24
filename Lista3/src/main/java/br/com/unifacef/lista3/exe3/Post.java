/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.lista3.exe3;

import java.util.ArrayList;

public class Post {
    private int code, like;
    private String author, text;
    // objeto-parte
    private ArrayList<Comment> comments;

    public Post() {
        this.comments = new ArrayList();
    }

    public Post(int code, int like, String author, String text, ArrayList<Comment> comments) {
        this.code = code;
        this.like = like;
        this.author = author;
        this.text = text;
        this.comments = comments;
        
    }

    public Post(int code, String author, String text) {
        this.code = code;
        this.author = author;
        this.text = text;
        this.like = 0;
        this.comments = new ArrayList();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
    
    public void addComment(Comment comment){
        this.comments.add(comment);
        System.out.println("Comentário inserido");
    }
    
    public void removeComment(Comment comment){
        if (this.comments.remove(comment)){
            System.out.println("Comentário removido");
        }
        else {
            System.out.println("Comentário não existe");
        }
    }

    @Override
    public String toString() {
        return "Post{" + "code=" + code + ", like=" + like + 
        ", author=" + author + ", text=" + text + 
        ", comments=" + comments + '}';
    }
    
    
}
