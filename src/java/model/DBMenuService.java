/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dbservice.DBAccessor;
import dbservice.DbAccessException;
import dbservice.MySQLAccessor;
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
    public void setMenu(List<MenuItem> menu) {
        //lol not
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
}
