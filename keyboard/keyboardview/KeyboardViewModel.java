/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard.keyboardview;

/**
 *
 * @author mattroberts
 */
public class KeyboardViewModel {
    
    private AbstractKeyOfModel keyModel;

    public KeyboardViewModel() {
        this.keyModel = new PianoKeyModel();
    }

    public AbstractKeyOfModel getKeyModel() {
        return keyModel;
    }
    
}