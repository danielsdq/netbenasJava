/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Recep.04
 */
public class Man {
    
    private int num ;
    private String paciente;
    private String consulta;

    public Man(int num, String paciente, String consulta) {
        this.num = num;
        this.paciente = paciente;
        this.consulta = consulta;
    }
    
    
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    public void marCons(){
        System.out.println("Paciente "+this.getPaciente()+" Numero "+this.getNum());
    }
    
}
