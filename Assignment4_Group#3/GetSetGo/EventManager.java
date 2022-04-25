/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author naina
 */
import java.util.ArrayList;
import java.util.List;
 
public class EventManager{
     
    private static List<Observer> observers = new ArrayList<>();
    
    
    public static void notifyDescUpdate(Message m) {
        for(Observer o: observers) {
            o.DescUpdate(m);
        }
    }
    
    public static void notifyLocUpdate(Message m) {
        for(Observer o: observers) {
            o.LocUpdate(m);
        }
    }
}
