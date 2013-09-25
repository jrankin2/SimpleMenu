/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dbservice.DBAccessor;
import dbservice.DbAccessException;
import dbservice.GenericDAO;
import dbservice.MySQLAccessor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jrankin2
 */
public class MenuItemDAO extends GenericDAO<MenuItem> implements IMenuItemDAO {

    private DBAccessor db;
    private static final String TBL_MENUITEM = "menu_item";
    private static final String DELETE_ALL_MENUITEMS = "DELETE FROM menu_item";
    private static final String SELECT_ALL_MENUITEMS = "SELECT * FROM menu_item";

    public MenuItemDAO() {
        db = new MySQLAccessor("com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost:3306/restaurant",
                "root",
                "");
        super.setDb(db);
    }

    @Override
    public final void saveMenuItem(MenuItem ticket) throws DbAccessException {
        super.save(TBL_MENUITEM, ticket, "id");
    }

    @Override
    public final void deleteMenuItem(MenuItem ticket) throws DbAccessException {
        super.delete(TBL_MENUITEM, "id", ticket.getDbId());
    }

    @Override
    public final MenuItem findMenuItemById(String id) throws DbAccessException {
        if (id != null) {
            return super.findWhere(TBL_MENUITEM, "id", new Long(id));
        }
        return null;
    }

    @Override
    public final List<MenuItem> getAllMenuItems() throws DbAccessException {
        return super.getRecordsFromSQL(SELECT_ALL_MENUITEMS);
    }

    @Override
    public final void deleteAllMenuItems() throws DbAccessException {
        super.delete(TBL_MENUITEM, null, null);
    }

    @Override
    public final MenuItem entityFromMap(Map<String, Object> data) {
        MenuItem item = new MenuItem();
        try {
            item.setDbId(new Long(data.get("id").toString()));
            item.setName(data.get("name").toString());
            item.setPrice(Double.valueOf(data.get("price").toString()));
            item.setImagePath(data.get("image_path").toString());
        } catch (Exception e) {
        }

        return item;
    }

    @Override
    public final Map<String, Object> mapFromEntity(MenuItem entity) {
        Map<String, Object> fields = new HashMap<String, Object>();
        fields.put("id", (entity.getDbId() == 0L ? null : entity.getDbId()));
        fields.put("name", entity.getName());
        fields.put("price", entity.getPrice());
        fields.put("image_path", entity.getImagePath());

        return fields;
    }
}
