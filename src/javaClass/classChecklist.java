/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

/**
 *
 * @author Lenovo
 */
public class classChecklist {

    public Integer id;
    public String title;
    public Boolean checked;
    public Integer idcard;
  
    public boolean insert(){        
        return methodsSQL.execute("insert into checklist values (?,?,?)", 
            title, checked, idcard);
    }
    
}
