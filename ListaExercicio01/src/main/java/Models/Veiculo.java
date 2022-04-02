/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Enums.TipoVeiculo;

/**
 *
 * @author Steh Castell
 */
public class Veiculo {
    public String modelo;
    public TipoVeiculo tipoVeiculo;
    public String tipoMotor;
    public double valorBase;
    public boolean importado;
    public boolean ar;
    public boolean cambioAutomatico;
    public boolean pinturaDiferente;
    public boolean vidroAutomatico;
    public boolean alarme;
    public boolean tetoSolar;
    public boolean kitMultimidia;
    public boolean potenciaMotor;
    
    private final double valorAr = 3000.00;
    private final double valorCambioAutomatico = 5000.00;
    private final double valorPinturaDiferente = 2500.00;
    private final double valorVidroAutomatico = 6000.00;
    private final double valorAlarme = 600.00;
    private final double valorTetoSolar = 4000.00;
    private final double valorKitMultimidia = 1800.00;
    private final double valorPotenciaMotor = 2000.00;

    public Veiculo() {
    }

    public Veiculo(String modelo, TipoVeiculo tipoVeiculo, String tipoMotor, double valorBase, boolean importado, boolean ar, boolean cambioAutomatico, boolean pinturaDiferente, boolean vidroAutomatico, boolean alarme, boolean tetoSolar, boolean kitMultimidia, boolean potenciaMotor) {
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;
        this.tipoMotor = tipoMotor;
        this.valorBase = valorBase;
        this.importado = importado;
        this.ar = ar;
        this.cambioAutomatico = cambioAutomatico;
        this.pinturaDiferente = pinturaDiferente;
        this.vidroAutomatico = vidroAutomatico;
        this.alarme = alarme;
        this.tetoSolar = tetoSolar;
        this.kitMultimidia = kitMultimidia;
        this.potenciaMotor = potenciaMotor;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public boolean isPinturaDiferente() {
        return pinturaDiferente;
    }

    public void setPinturaDiferente(boolean pinturaDiferente) {
        this.pinturaDiferente = pinturaDiferente;
    }

    public boolean isVidroAutomatico() {
        return vidroAutomatico;
    }

    public void setVidroAutomatico(boolean vidroAutomatico) {
        this.vidroAutomatico = vidroAutomatico;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public boolean isKitMultimidia() {
        return kitMultimidia;
    }

    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }

    public boolean isPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(boolean potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }    
    
    public double calculaValorFinal(){
        double valorCarro = getValorBase();
        if(isAr() == true)
            valorCarro += valorAr;
        if(isCambioAutomatico() == true)
            valorCarro += valorCambioAutomatico;
        if(isPinturaDiferente() == true)
            valorCarro += valorPinturaDiferente;
        if(isVidroAutomatico() == true)
            valorCarro += valorVidroAutomatico;
        if(isAlarme() == true)
            valorCarro += valorAlarme;
        if(isTetoSolar() == true)
            valorCarro += valorTetoSolar;
        if(isKitMultimidia() == true)
            valorCarro += valorKitMultimidia;
        if(isPotenciaMotor() == true)
            valorCarro += valorPotenciaMotor;         
        
        if(isImportado() == false && getTipoMotor() != "1.0")
            valorCarro += valorCarro * 0.20;
        if(isImportado() == true)
            valorCarro += valorCarro * 0.30;       
        if(getTipoMotor() == "1.0")
            valorCarro -= valorCarro * 0.10;
        
        return valorCarro;
    }
}
