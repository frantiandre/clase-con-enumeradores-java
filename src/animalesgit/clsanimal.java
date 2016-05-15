/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalesgit;

/**
 *
 * @author FRANKLIN
 */
public class clsanimal {
    public enum tipo{vertebrado,invertebrado}
    public enum clase{viviparo,oviviparo}
    public enum sexo{macho,hembra}
    public enum habitat{Aereo,Terrestre,Acuatico}
    private int _Id;
    private String _Nombre;
   private tipo _Tipoa;
   private clase _Clasea;
   private sexo _Sexoa;
   private habitat _habitat;
   public clsanimal(){}
   public clsanimal(int id, String nombre,tipo tipoa,clase clasea,sexo sexoa,habitat habitas){
   this._Id=id;
   this._Nombre=nombre;
   this._Tipoa=tipoa;
   this._Clasea=clasea;
   this._Sexoa=sexoa;
   this._habitat =habitas;
      }

    public int Id() {
        return _Id;
    }

    public void Id(int Id) {
        this._Id = Id;
    }

    public String Nombre() {
        return _Nombre;
    }

    public void Nombre(String Nombre) {
        this._Nombre = Nombre;
    }

    public tipo Tipoa() {
        return _Tipoa;
    }

    public void Tipoa(tipo Tipoa) {
        this._Tipoa = Tipoa;
    }

    public clase Clasea() {
        return _Clasea;
    }

    public void Clasea(clase Clasea) {
        this._Clasea = Clasea;
    }

    public sexo Sexoa() {
        return _Sexoa;
    }

    public void Sexoa(sexo Sexoa) {
        this._Sexoa = Sexoa;
    }

    public habitat Habitat() {
        return _habitat;
    }

    public void Habitat(habitat habita) {
        this._habitat = habita;
    }
}
