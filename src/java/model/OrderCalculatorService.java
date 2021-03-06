/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jrankin2
 */
public class OrderCalculatorService {
    
    private HttpServletRequest request;
    private IMenuService menuService;

    public OrderCalculatorService(HttpServletRequest request, IMenuService menuService) {
        this.request = request;
        this.menuService = menuService;
    }
    
    
    public List<MenuItem> selectedItems(){
        List<MenuItem> menu = menuService.getMenu();
        
        List<MenuItem> selectedItems = new ArrayList<MenuItem>();
        for(int i = 0; i < menu.size(); i++){
            Object item = request.getParameter("i"+i);
            if(item != null){
                System.out.println("i:"+i);
                System.out.println(menu.get(i).getName());
                selectedItems.add(menu.get(i));
            }
        }
        return selectedItems;
    }
    
    public Receipt getReceipt(){
        List<MenuItem> selectedItems = selectedItems();
        Receipt result = new Receipt(selectedItems);
        return result;
    }
}
