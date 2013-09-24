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
            add(new MenuItem("Chicken Nuggets", 2.00, "img/chicken_nuggets.png"));
            add(new MenuItem("Chocolate Chip Cookie", 1.00, "img/chocolate_chip_cookie.png"));
            add(new MenuItem("Double Cheeseburger", 5.00, "img/double_cheeseburger.png"));
            add(new MenuItem("Pancakes", 3.00, "img/pancakes.png"));
        }};
        
    }
    
    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }

    @Override
    public MenuItem addMenuItem(MenuItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MenuItem updateMenuItem(MenuItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMenuItem(MenuItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MenuItem findMenuItemById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
