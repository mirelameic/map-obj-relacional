package model.bean;

import java.sql.Date;

public class Artista{
    private String nome;
    private String descricao;
    private String estiloPrincipal;
    private String estiloArt;
    private String paisOrig;
    private Date dataNassc;
    private Date dataMorte;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getEstiloPrincipal(){
        return this.estiloPrincipal;
    }

    public void setEstiloPrincipal(String estiloPrincipal){
        this.estiloPrincipal = estiloPrincipal;
    }

    public String getEstiloArt(){
        return this.estiloArt;
    }

    public void setEstiloArt(String estiloArt){
        this.estiloArt = estiloArt;
    }

    public String getPaisOrig(){
        return this.paisOrig;
    }

    public void setPaisOrig(String paisOrig){
        this.paisOrig = paisOrig;
    }

    public Date getDataNassc(){
        return this.dataNassc;
    }

    public void setDataNassc(Date dataNassc){
        this.dataNassc = dataNassc;
    }

    public Date getDataMorte(){
        return this.dataMorte;
    }

    public void setDataMorte(Date dataMorte){
        this.dataMorte = dataMorte;
    }
    
}
