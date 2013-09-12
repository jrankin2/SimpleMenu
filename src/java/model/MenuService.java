/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrankin2
 */
public class MenuService implements IMenuService {
    private List<MenuItem> menu;

    {
        menu = new ArrayList<MenuItem>(){{
            add(new MenuItem("Large Beverage", 2.00));
            add(new MenuItem("Small Beverage", 1.00));
            add(new MenuItem("Cheeseburger", 5.00));
            
        }};
        
    }
    
    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
    
    
}
