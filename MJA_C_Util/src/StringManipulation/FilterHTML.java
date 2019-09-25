/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringManipulation;

/**
 *
 * @author cabalhaoma_sd2082
 */
public class FilterHTML {
    public String removeHTML(String str){
        str=str.replaceAll("\\<.*?\\>","");
        return str;
    }
    
}
