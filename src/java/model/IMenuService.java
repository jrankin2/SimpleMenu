/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author jrankin2
 */
public interface IMenuService {
    public List<MenuItem> getMenu();
    public MenuItem addMenuItem(MenuItem item);
    public MenuItem updateMenuItem(MenuItem item);
    public void deleteMenuItem(MenuItem item);
    public MenuItem findMenuItemById(String id);
}
