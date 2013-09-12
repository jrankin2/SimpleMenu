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
    public void setMenu(List<MenuItem> menu);
    public List<MenuItem> getMenu();
}
