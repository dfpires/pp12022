/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.lista3.exe3;

/**
 *
 * @author professor
 */
public class Comment {
    private int code;
    private String author, text;

    public Comment() {
    }

    public Comment(int code, String author, String text) {
        this.code = code;
        this.author = author;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "Comment{" + "code=" + code + ", author=" + author + ", text=" + text + '}';
    }
    
    
}
