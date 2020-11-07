package Clientes.utilitario;

public class ResponseDTO extends Messages {
	
	private String codigo;
	private String mensaje;
	private Object respuesta;
	
	public ResponseDTO() {
		super();
		this.codigo = CODE_OK;
		this.mensaje = MSG_OK;
	}
	public ResponseDTO(String codigo, String mensaje, Object respuesta) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.respuesta = respuesta;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Object getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(Object respuesta) {
		this.respuesta = respuesta;
	}

}
