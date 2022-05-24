//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
import java.net.URL;

public class read_json_test {
   public static void main(String[] args) throws Exception {
      URL path = read_json_test.class.getResource("account.json");
      File f = new File(path.getFile());
      
      System.out.println("this is the file path: "+f);
      // parsing file "JSONExample.json"
      Object ob = new JSONParser().parse(new FileReader(f));

      // typecasting ob to JSONObject
      JSONObject js = (JSONObject) ob;

      String name = (String) js.get("name");
      String type_of_account = (String) js.get("type_of_account");

      System.out.println("Name is: " + name);
      System.out.println("type_of_account: " + type_of_account);
   }
}