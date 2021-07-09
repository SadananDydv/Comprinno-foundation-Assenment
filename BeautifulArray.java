package ComprinnoSolutions;

import java.io.BufferedReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

class Beautiful 
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StreamTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !((Object) st).hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 