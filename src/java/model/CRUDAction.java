/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jrankin2
 */
public enum CRUDAction {
    Create(0), Read(1), Update(2), Delete(3), NoAction(4);
    
    private final int value;
    CRUDAction(int value){
        this.value = value;
    }
    
    public int Value(){
        return value;
    }
    
    public static CRUDAction toCRUDAction(String value){
        if(value == null){
            return NoAction;
        } else{
            int val = Integer.parseInt(value);
            return CRUDAction.toCRUDAction(val);
        }
    }
    
    public static CRUDAction toCRUDAction(int value){
        
        for(CRUDAction action : CRUDAction.values()){
            if(action.Value() == value){
                return action;
            }
        }
        return NoAction;
    }
}
