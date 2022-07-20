package com.museubd.model.bean;
import java.sql.Date;

public class Permanentes{
    private int num_obj5;
    private boolean emExposicao;
    private Date dataAquisicao;

    public int getNum_obj5(){
        return this.num_obj5;
    }

    public void setNum_obj5(int num_obj5){
        this.num_obj5 = num_obj5;
    }

    public boolean isEmExposicao(){
        return this.emExposicao;
    }

    public boolean getEmExposicao(){
        return this.emExposicao;
    }

    public void setEmExposicao(boolean emExposicao){
        this.emExposicao = emExposicao;
    }

    public Date getDataAquisicao(){
        return this.dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao){
        this.dataAquisicao = dataAquisicao;
    }
}
