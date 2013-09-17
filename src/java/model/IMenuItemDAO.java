/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dbservice.DbAccessException;
import java.util.List;

/**
 *
 * @author jrankin2
 */
public interface IMenuItemDAO {
    
    public void saveMenuItem(MenuItem ticket) throws DbAccessException;
    public void deleteMenuItem(MenuItem ticket) throws DbAccessException;
    public MenuItem findMenuItemById(String id) throws DbAccessException;
    public List<MenuItem> getAllMenuItems() throws DbAccessException;
    public void deleteAllMenuItems() throws DbAccessException;
}
