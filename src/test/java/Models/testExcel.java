package Models;

public class testExcel {

    public testExcel(String nombre,String email,String celular){
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
    }
    private String nombre;
    private String email;
    private String celular;

    public void nombre(String nombre){

        this.nombre = nombre;
    }
    public String nombre(){

        return nombre;
    }
    public void email(String email){

        this.email = email;
    }
    public String email(){

        return email;
    }
    public void celular(String celular){

        this.celular = celular;
    }
    public String celular(){

        return celular;
    }

}
