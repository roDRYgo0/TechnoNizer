/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class classCards {

    public static Integer idproject;
    
    public static List<Card> cards = new ArrayList<>();
    public static List<Card> cardsSearch = new ArrayList<>();
    
    public static int spaceCard(int num){
        int row = (num+1)/4;
        if((num+1)%4!=0)
            row++;
        if(row<=3)
            return 0;
        else
            return row - 3;
    }
    
    public static void select() {
        try {
            cards = new ArrayList<>();
            cardsSearch = new ArrayList<>();
            
            ResultSet rs = methodsSQL.getExecute(
                    "SELECT *,"
                    + "(SELECT COUNT(*) FROM checklist l WHERE c.id=l.idcard),"
                    + "(SELECT COUNT(*) FROM checklist l WHERE c.id=l.idcard AND l.checked = 1) "
                    + "FROM cards c WHERE idproject=?", idproject);
            while(rs.next()) {
                Card card = new Card();
                card.id = rs.getInt(1);
                card.title = rs.getString(2);
                card.description = rs.getString(3);
                card.color = rs.getString(4);
                card.idproject = idproject;
                card.totalActivities = rs.getInt(9);
                card.activitiesCompleted = rs.getInt(10);
                cards.add(card);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
}
