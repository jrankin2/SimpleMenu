/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dbservice.DBAccessor;
import dbservice.DbAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrankin2
 */
public class DBMenuService implements IMenuService {

    private DBAccessor db;
    IMenuItemDAO menuItemDAO;

    public DBMenuService() {
        menuItemDAO = new MenuItemDAO();
    }

    @Override
    public List<MenuItem> getMenu() {
        List<MenuItem> menu = null;
        try {
            menu = menuItemDAO.getAllMenuItems();
        } catch (DbAccessException ex) {
            Logger.getLogger(DBMenuService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return menu;
    }
    
    @Override
    public MenuItem addMenuItem(MenuItem item){
        try {
            menuItemDAO.saveMenuItem(item);
        } catch (DbAccessException ex) {
            Logger.getLogger(DBMenuService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item;
    }
    
    @Override
    public MenuItem updateMenuItem(MenuItem item){
        System.out.println("updating item" + item.toString());
        try {
            menuItemDAO.saveMenuItem(item);
        } catch (DbAccessException ex) {
            Logger.getLogger(DBMenuService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return item;
    }
    
    @Override
    public void deleteMenuItem(MenuItem item){
        try {
            menuItemDAO.deleteMenuItem(item);
        } catch (DbAccessException ex) {
            Logger.getLogger(DBMenuService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public MenuItem findMenuItemById(String id){
        try {
            return menuItemDAO.findMenuItemById(id);
        } catch (DbAccessException ex) {
            Logger.getLogger(DBMenuService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
