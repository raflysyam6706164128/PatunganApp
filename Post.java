package org.d3ifcool.patungan;

/* Custom Post Class */

public class Post {

    // declare the class atribute
    private String postTitle;
    private long price;
    private String due;
    private int img;


    // custom constructor for Post Class
    public Post(String postTitle, long price, String due, int img) {
        this.postTitle = postTitle;
        this.price = price;
        this.due = due;
        this.img = img;
    }

    // method for get post title
    public String getPostTitle() {
        return postTitle;
    }

    // method for get post price
    public long getPrice() {
        return price;
    }

    // method for get post due date
    public String getDue() { return this.due; }

    // method for get post image
    public int getImg() {return img;}
}