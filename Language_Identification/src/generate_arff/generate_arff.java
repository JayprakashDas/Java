package generate_arff;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class generate_arff {
	 public static TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>();
	    public static TreeMap<String,Integer> sorted_map_words = new TreeMap<String,Integer>();
	    public static TreeMap<String, Integer> sorted_dict = new TreeMap<String, Integer>();
	    public static TreeMap<String, Integer> sorted_AS_dict = new TreeMap<String, Integer>();
	    public static TreeMap<String, Integer> sorted_ABC_dict = new TreeMap<String, Integer>();
	    
	    public static void read()
	    {
	    	try
	        {
	            //FileInputStream fis = new FileInputStream("Trigram_1000.txt");
	            FileInputStream fis = new FileInputStream("Trigram-language.txt");
	            BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
	            String line;
	            while((line = br.readLine())!=null)
	            {
	            	sorted_map.put(line.trim().substring(0,line.indexOf("\t")).trim(),0);
	            }
	            fis.close();
	        }catch(IOException f){}  
	    }
	    public static void read_words()
	    {
	    	int k=0;
	    	try
	        {
	            FileInputStream fis = new FileInputStream("Words-language.txt");
	            BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
	            String line;
	            while((line = br.readLine())!=null)
	            {
	            	String words[]=line.split("\t");
	            	sorted_map_words.put(words[0].trim(),k++);
	            }
	            fis.close();
	        }catch(IOException f){}  
	    }
	    public static String vector_represent(String word)
	    {
	    	String vector="";
	    	
	    	TreeMap<String,Integer> vctr = new TreeMap<String,Integer>();
	    	vctr.putAll(sorted_map);

	    	
	    	char[] y=word.toCharArray();
	        
	        //System.out.println(word);

	        for(int j=0;j<y.length-2;j++)
	        {
	       	 	String x=y[j]+""+y[j+1]+""+y[j+2]+"";
	       	 	
	       	 	if(vctr.containsKey(x))
	       	 	{
	       	 		int k=vctr.get(x);
	       	 		if(k==1)
	       	 		{
	       	 		}
	       	 		else
	       	 		{
		       	 		k=k+1;
		       	 		vctr.put(x, k);
	       	 		}
	       	 	}
	        }  
	        
			for (Map.Entry entry : vctr.entrySet()) 
			{
				vector+=entry.getValue()+",";
			}
			
//			System.out.println(vector);

	    	return vector;
	    }
	    
	    public static void dict_word(){
	        
	        int k=0;
	        try
	        {
	            FileInputStream fis = new FileInputStream("emnlp_dict.txt");
	            BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
	            String line;
	            while((line = br.readLine())!=null)
	            {
	            	String words[]=line.split("\t");
	            	sorted_dict.put(words[0].trim(),k++);
//	                System.out.println(words[0]);
	            }
	            fis.close();
	        }catch(IOException f){}
	    }
	    
	      
	    public static void abc_dict_word(){
	        int k=0;
	        try
	        {
	            FileInputStream fis = new FileInputStream("abc-Corpus.txt");
	            BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
	            String line;
	            while((line = br.readLine())!=null)
	            {
	            	String words[]=line.split("\t");
	            	sorted_ABC_dict.put(words[0].trim(),k++);
	                //System.out.println(words[0]);
	            }
	            fis.close();
	        }catch(IOException f){}
	    }
	    
	    public static int acro_check(String acro){
	        
	        int first = 0, all = 0, any = 0;
	        int result = 0;
	        
	        char [] y = acro.toCharArray();
	        for(int i=0; i<acro.length(); i++)
	        {
	            //String euivalentRoman = "";
	            //String hexCode = Integer.toHexString(line.codePointAt(i)).toUpperCase();
	            String hexCode = Integer.toHexString(acro.codePointAt(i)).toUpperCase();
	            String hexCodeWithAllLeadingZeros = "0000" + hexCode;
	            String hexCodeWithLeadingZeros = hexCodeWithAllLeadingZeros.substring(hexCodeWithAllLeadingZeros.length()-4);
	            
	                    if (i==0)
	                    {
	                        if(hexCodeWithLeadingZeros.equals("0041"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0042"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0043"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0044"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0045"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0046"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0047"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0048"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0049"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004A"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004B"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004C"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004D"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004E"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004F"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0050"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0051"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0052"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0053"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0054"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0055"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0056"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0057"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0058"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0059"))
	                        {
	                            first = 1;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("005A"))
	                        {
	                            first = 1;
	                        }
	                    }
	                    else
	                    {
	                        if(hexCodeWithLeadingZeros.equals("0041"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0042"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0043"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0044"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0045"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0046"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0047"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0048"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0049"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004A"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004B"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004C"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004D"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004E"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("004F"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0050"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0051"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0052"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0053"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0054"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0055"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0056"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0057"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0058"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("0059"))
	                        {
	                            any++;
	                        }
	                        if(hexCodeWithLeadingZeros.equals("005A"))
	                        {
	                            any++;
	                        }
	                    }
	                    
	        }
	        
	        if(any > 0)
	        {
	            if(acro.length() == any + first)
	            {
	                all = 1;
	            }
	        }
	        
	                if(all == 1)
	                {
	                    result = 1;
	                    //System.out.println(result1);
	                    //System.out.println("result 1");
	                }
	                else
	                {
	                    if(any > 0)
	                    {
	                        result = 2;
	                        //System.out.println(result2);
	                        //System.out.println("result 2");
	                    }
	                    else
	                    {
	                        if(first == 1)
	                        {
	                            result = 3;
	                            //System.out.println(result3);
	                            //System.out.println("result 3");
	                        }
	                    }
	                }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        // TODO code application logic here
	        int l=0,cntr=0, cntrdict=0;
	        
	        int cntrtest=0;
			read();
			read_words();
	                dict_word();
	               
	                abc_dict_word();
			Global.file_append("Vector-language.arff","@relation Language");
			Global.file_append("Vector-AS1.arff","@relation Language");
			

			for (Map.Entry entry : sorted_map.entrySet()) 
			{
				//System.out.println(entry.getKey());
				Global.file_append("Vector-language.arff","@ATTRIBUTE WORD"+l+"  NUMERIC");
				l++;
				Global.file_append("Vector-AS1.arff","@ATTRIBUTE WORD"+l+"  NUMERIC");
				l++;
			}
//			Global.file_append("Vector-language.arff","@ATTRIBUTE WORD_ORI NUMERIC");
	                
	                Global.file_append("Vector-AS1.arff","@ATTRIBUTE Dict NUMERIC");
	                
	                
	                
//	                Global.file_append("Vector-AS1.arff","@ATTRIBUTE ABCDict NUMERIC");
	                
	                Global.file_append("Vector-AS1.arff", "@ATTRIBUTE ACROfirst NUMERIC");
	                Global.file_append("Vector-AS1.arff", "@ATTRIBUTE ACROany NUMERIC");
	                Global.file_append("Vector-AS1.arff", "@ATTRIBUTE ACROall NUMERIC");
	                
	                //Global.file_append("Vector-AS1.arff", "@ATTRIBUTE Word_position NUMERIC");
			//Global.file_append("Vector-AS1.arff", "@ATTRIBUTE Word_length NUMERIC");
			
	                StringBuffer str=new StringBuffer();
			
			Global.file_append("Vector-language.arff","@ATTRIBUTE class {ACRO, UNIV, NE, EN, HI, UN, BD, WM}");
			Global.file_append("Vector-AS1.arff","@ATTRIBUTE class {ACRO, UNIV, NE, EN, HI, UN, BD, WM}");

			Global.file_append("Vector-language.arff","@DATA");
			Global.file_append("Vector-AS1.arff","@DATA");
			try
	        {
	            FileInputStream fis = new FileInputStream("testfinal.txt");
	            BufferedReader br = new BufferedReader(new InputStreamReader(fis,"UTF-8"));
	            String line;
	            while((line = br.readLine())!=null)
	            {
	               
	                cntrtest++;
	                //System.out.println(cntrtest);
	            	cntr++;
	            	if(cntr==100)
	            	{
	            		break;
	            	}
	                //String words[]=line.toLowerCase().split(" ");
	                String words[]=line.split(" ");
	                
	                for(int i=0;i<words.length;i++)
	                {
	                    
	                    
	                    int acrocheck = 0;
	                    int acroresult1 = 0 , acroresult2 = 0, acroresult3 = 0;
	                        cntrtest++;
	                       // System.out.println(cntrtest);
	                       // System.out.println(words[i]);
		                 String word=words[i].substring(0,words[i].indexOf("$"));
	                         String tag=words[i].substring(words[i].indexOf("$")+1);
		                 
	                        // System.out.println(word);
	                         System.out.println(tag);
	                                                  
	                         
		                 
		                 int x=0, y=0, a=0;
		                 
		                 if(sorted_map_words.containsKey(word))
		                	 x=sorted_map_words.get(word);
		                 //System.out.println(x+"######"+word);
		                 
	                         if(sorted_dict.containsKey(word))
	                         {     y = 1;
	                                cntrdict++;
	                                System.out.println(cntrdict+":"+ word);
	                                if(tag.equals("as"))
	                                    System.out.println(cntrdict+":"+ word+"-"+tag);
	                         }   
	                         else
	                             y = 0;
	                         
//	                         
	                         
	                         if(sorted_ABC_dict.containsKey(word))
	                         {     a = 1;
	                                cntrdict++;
	                                System.out.println(cntrdict+":"+ word);
	                              
	                         }   
	                         else
	                             a = 0;
	                         
		                acrocheck = acro_check(word);
	                        
	                        if(acrocheck == 1)
	                        {
	                            acroresult1 = 0;
	                            acroresult2 = 0;
	                            acroresult3 = 1;
	                        }
	                        else if(acrocheck == 2)
	                                {
	                                    acroresult1 = 0;
	                                    acroresult2 = 1;
	                                    acroresult3 = 0;
	                                }
	                        else if (acrocheck == 3)
	                                {
	                                    acroresult1 = 1;
	                                    acroresult2 = 0;
	                                    acroresult3 = 0;
	                                }
	                        
	                        
	                         Global.file_append("Vector-AS1.arff",vector_represent(word)+","+y+","+acroresult1+","+acroresult2+","+acroresult3+","+tag);
//	                         Global.file_append("Vector-AS2.arff",y+","+a+","+tag);
	                        Global.file_append("Vector-language.arff",vector_represent(word)+","+tag);
		            }
		            
	            }
	            fis.close();		
	        }catch(IOException f){} 
			
		

	    }
}
