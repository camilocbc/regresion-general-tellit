package Models;

public class DatosDetalleReporte {

    public DatosDetalleReporte(){

    }
    private String idEnvio;
    private String destino;
    private String mensaje;
    private String fechaProcesado;
    private String estado;
    private String referencia;
    private String usuario;
    private String tipo;
    private String totalMensaje;

    public void setIdEnvio(String idEnvio){
        this.idEnvio = idEnvio;
    }
    public String getIdEnvio(){
        return idEnvio;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    public String getDestino(){
        return destino ;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMensaje(){
        return mensaje;
    }
    public void setFechaProcesado(String fechaProcesado){
        this.fechaProcesado = fechaProcesado;
    }
    public String getFechaProcesado(){
        return fechaProcesado;
    }
    public void setEstado(String estado){
        this.estado =estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setReferencia(String referencia){
       this.referencia = referencia;
    }
    public String getReferencia(){
        return referencia;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTotalMensaje(String totalMensaje){
        this.totalMensaje = totalMensaje;
    }
    public String getTotalMensaje(){
        return totalMensaje;
    }

}
