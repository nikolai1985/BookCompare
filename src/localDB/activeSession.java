/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localDB;

import java.util.ArrayList;

/**
 *
 * @author Reed
 */
public class activeSession
{
    ArrayList<book> books;

    public activeSession()
    {
        this.books = new ArrayList<book>();
    }
    
    public void loadResults(){
        //TODO fill the array using the generated json file
    }
    
    public void sortByPrice(){
        //TODO sort by price
    }
}
