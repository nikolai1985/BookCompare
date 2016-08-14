/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localDB;

import java.util.Date;

/**
 *
 * @author Reed
 */
public class book
{
    String sbn;
    String title;
    String location;
    Date day;
    double price;
    
    public String getSbn()
    {
        return sbn;
    }

    public void setSbn(String sbn)
    {
        this.sbn = sbn;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public Date getDay()
    {
        return day;
    }

    public void setDay(Date day)
    {
        this.day = day;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
