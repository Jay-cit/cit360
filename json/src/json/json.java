/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;


 
import org.json.simple.JSONObject;

public class json {

   public static void main(String[] args){
      JSONObject obj = new JSONObject();

      obj.put("Name", "Janghun");
      obj.put("Height", new Integer(6));
      obj.put("Adress", "Rexburg" );
      obj.put("School", "BYU-Idaho");

      System.out.print(obj);
   }
}