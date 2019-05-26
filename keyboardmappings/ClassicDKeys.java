/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardmappings;

import java.util.HashMap;
import javafx.scene.input.KeyCode;

/**
 *
 * @author mattroberts
 */
public class ClassicDKeys extends HashMap<KeyCode, Integer>{

    public ClassicDKeys() {
        put(KeyCode.A, 2);//D
        put(KeyCode.W, 3);//D#
        put(KeyCode.S, 4);//E
        put(KeyCode.D, 5);//F
        put(KeyCode.R, 6);//F#
        put(KeyCode.F, 7);//G
        put(KeyCode.T, 8);//G#
        put(KeyCode.G, 9);//A
        put(KeyCode.Y, 10);//A#
        put(KeyCode.H, 11);//B
        put(KeyCode.J, 12);//C
        put(KeyCode.I, 13);//C#
        put(KeyCode.K, 14);//D
        put(KeyCode.O, 15);//D#
        put(KeyCode.L, 16);//E
        put(KeyCode.SEMICOLON, 17);//F
        put(KeyCode.OPEN_BRACKET, 18);//F#
        put(KeyCode.QUOTE, 19);//G
        put(KeyCode.CLOSE_BRACKET, 20);//G#
    }
    
    
    
}
