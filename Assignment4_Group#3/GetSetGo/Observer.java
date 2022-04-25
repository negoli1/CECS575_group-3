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
public interface Observer {

    /**
     *
     * @param m
     */
    public void DescUpdate(Message m);
    public void LocUpdate(Message m);
}
