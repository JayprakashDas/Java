package generate_arff;
import java.io.*;

public class Global {
	 public static String file_read(String path) 
     {
         String str="";
         try
         {
             FileInputStream fis = new FileInputStream(path);
             BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
             String line;
             while((line = br.readLine())!=null)
             {
                 str+=line+"\n";
             }
             fis.close();
         }catch(IOException f){}    
         return str;
     }
     public static void file_update(String path,String txt) 
     {
         try
         {
             FileOutputStream fos = new FileOutputStream(path);
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos,"UTF-8"));
             bw.write(txt);
             bw.flush();
             fos.close();
         }catch(IOException f){}    
     }
     public static void file_append(String path,String txt) 
     {
    	 try
    	 {
    	        
             OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(path, true), "UTF-8");
             BufferedWriter fbw = new BufferedWriter(writer);
             fbw.write(txt);
             fbw.newLine();
             fbw.close();
         }
    	 catch (Exception e) 
         {
             System.out.println("Error: " + e.getMessage());
         }
     }

    public static void file_append(String cmItxt, double CMI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
