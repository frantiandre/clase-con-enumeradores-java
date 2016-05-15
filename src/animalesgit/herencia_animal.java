/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalesgit;
import animalesgit.clsanimal;
import animalesgit.clsanimal.clase;
import animalesgit.clsanimal.tipo;
import animalesgit.clsanimal.sexo;
import animalesgit.clsanimal.habitat;
/**
 *
 * @author FRANKLIN
 */
public class herencia_animal extends clsanimal {
    public enum tipoanimal{domestico, salvaje}
    private tipoanimal _animal;
    
    public herencia_animal(){}
        public herencia_animal(String nombre,tipo tipoa,clase clasea,sexo sexoa,habitat habitas,tipoanimal animal){
        super (nombre,tipoa,clasea,sexoa,habitas);
        this._animal=animal;
        }

    public tipoanimal Animal() {
        return _animal;
    }

    public void Animal(tipoanimal animal) {
        this._animal = animal;
    }
        
  public String caracteristicas(){
            return "";
            
        }
  }
