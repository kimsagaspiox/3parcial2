
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Duplicador {
    public Duplicador() {
    }

    public boolean Duplicado(String s){
        Stack<Character> pila = new Stack<>();
        
        char[] str = s.toCharArray();
        for(char ch : str) { 
            
            if (ch == ')'){
                char cima = pila.peek();
                pila.pop();
                
                int elementos = 0;
                
                while (cima != '('){
                    elementos++;
                    cima = pila.peek(); 
                    pila.pop(); 
                }
                if (elementos < 1){ 
                    return true; 
                }
            }else{ 
                pila.push(ch);
            }
        }
    return false;
    }
}
