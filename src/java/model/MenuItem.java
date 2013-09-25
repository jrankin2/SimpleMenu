/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.servlet.http.HttpServletRequest;
import org.jboss.weld.context.http.HttpRequestContext;

/**
 *
 * @author jrankin2
 */
public class MenuItem {

    private long dbId;
    private String name;
    private double price;
    private String imagePath;

    public MenuItem() {
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
        html += "<span class=\"price\">" + String.format("$%.02f", price) + "</span>";
        html += "</div>";
        return html;
    }

    public MenuItem updateFromRequest(HttpServletRequest request){
        String name = request.getParameter("name");
        if(name != null){
            this.setName(name);
        }
        
        String sPrice = request.getParameter("price");
        if(sPrice != null){
            double price = Double.valueOf(sPrice);
            this.setPrice(price);
        }
        
        String imagePath = request.getParameter("imagePath");
        if(imagePath != null){
            this.setImagePath(imagePath);
        }
        
        return this;
    }
    
    public static MenuItem createFromRequest(HttpServletRequest request){
        MenuItem item = new MenuItem();
        item.updateFromRequest(request);
        System.out.println("created: " + item);
        return item;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "dbId=" + dbId + ", name=" + name + ", price=" + price + ", imagePath=" + imagePath + '}';
    }
}
