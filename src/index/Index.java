/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Наталья
 */
public class Index {

    
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("onegin.txt");
        Scanner in = new Scanner(f);
        double k = 0;
        HashMap<String, Integer> map = new HashMap();
        String s, m;
        int i;
        for (i = 0; in.hasNext(); i++) {
            s = in.next().toLowerCase();
            if (!s.isEmpty()){
            if ( s.length()-1 >0 && (s.charAt(s.length()-1) == '.' || s.charAt(s.length()-1) == '!' || s.charAt(s.length()-1) == ',' || s.charAt(s.length()-1) == '*' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == ';'|| s.charAt(s.length()-1) == ':' || s.charAt(s.length()-1) == '?')){
                    s = s.substring(0, s.length()-1);
            }
            if (!map.containsKey(s)){
                int u = 1;
                map.put(s, u);
            } else {
                map.put(s, map.get(s)+1);
            }}
        }
        for (Iterator<String> j = map.keySet().iterator();j.hasNext() ;) {
            m = j.next();
            k = map.get(m)*100./i;
            System.out.printf("%20s %4f%% %n",m,k);
        }
        System.out.println(map.size());
    }
    
    
}
