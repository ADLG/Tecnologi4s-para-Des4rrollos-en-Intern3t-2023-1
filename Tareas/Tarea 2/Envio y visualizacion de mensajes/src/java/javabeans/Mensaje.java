package javabeans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje {

  private String remite;
  private String destino;
  private String concopia;
  private String texto;
  private String fecha;

  public Mensaje() {}
  // Constructor que permite crear un objeto
  // Mensaje a partir de los datos del mismo

  public Mensaje( String remite, String destino, String texto, String concopia,String fecha) {
    this.remite = remite;
    this.concopia = concopia;
    this.destino = destino;
    this.texto = texto;
    this.fecha = fecha;
  }

  public void setRemite( String remite ) {
    this.remite = remite;
  }

  public String getRemite() {
    return this.remite;
  }
  
  public void setConcopia( String concopia ) {
    this.concopia = concopia;
  }

  public String getConcopia() {
    return this.concopia;
  }

  public void setDestino( String destino ) {
    this.destino = destino;
  }

  public String getDestino() {
    return this.destino;
  }

  public void setTexto( String texto ) {
    this.texto = texto;
  }

  public String getTexto() {
    return this.texto;
  }
  
  public void setFecha( String fecha ) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    fecha = dtf.format(LocalDateTime.now());
  }

  public String getFecha() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    fecha = dtf.format(LocalDateTime.now());
    return this.fecha;
  }
  
  public String getFechaActual() {
    return fecha;
  }


}