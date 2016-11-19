/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Janghun
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     HashMap hash = new HashMap();
     
     hash.put("One", 1);
     hash.put("Two", 2);
     hash.put("Three", 3);
     hash.put("Four", 4);
     hash.put("Five", 5);
     hash.put("Six", 6);
     
     System.out.println(hash.get("one"));
     System.out.println(hash.get("Two"));
     
     System.out.println(hash.values());
     
     System.out.println(hash.size());
     
     Iterator tor = hash.keySet().iterator();
     
     while(tor.hasNext()) {
         String key = (String) tor.next();
         System.out.println(key + " : " + hash.get(key));
     }
    }
}

