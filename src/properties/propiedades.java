/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import java.io.IOException;
import java.util.Properties;


public class propiedades extends Properties{
    
    public propiedades (String idioma)
    {
    if(idioma.equals("ESPANOL"))
    {
        getProperties("espanol.properties");
        
    }
    else if (idioma.equals("INGLES"))
    {
    getProperties("ingles.properties");
    }
    
    }
    private void getProperties(String idiom){
        try{
        this.load(getClass().getResourceAsStream(idiom));
        
        }
        catch (IOException ex)
        {
            
        }
    }
}
