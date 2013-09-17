/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jrankin2
 */
public class MenuItem {
    private long dbId;
    private String name;
    private double price;
    private String imagePath;

    public MenuItem(){
        
    }
    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public MenuItem(String name, double price, String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
    }

    public long getDbId() {
        return dbId;
    }

    public void setDbId(long dbId) {
        this.dbId = dbId;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String toHTML(int itemNumber) {
        String html = "";
        html += "<div class=\"item\" id=\"i" + itemNumber + "\">";
        html += "<img src=\"" + imagePath + "\" />";
        html += "<span class=\"title\">" + name + "</span>";
        html += "<span class=\"price\">"+ String.format("$%.02f",price) + "</span>";
        html += "</div>";
        return html;
    }
}
