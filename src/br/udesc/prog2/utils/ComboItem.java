/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.utils;

/**
 *
 * @author joaomarcus
 */
public class ComboItem
{
    private int key;
    private String value;

    public ComboItem(int key, String value)
    {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }



    public int getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
}
