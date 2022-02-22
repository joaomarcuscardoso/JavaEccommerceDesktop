/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.utils;

/**
 *
 * @author rfcjo
 */
public class Instance {
    private static VerifyAdmin instanceVerifyAdmin = new VerifyAdmin();
    
    
    public static VerifyAdmin getInstanceVerifyAdmin()  {
        return instanceVerifyAdmin;
    }
}
