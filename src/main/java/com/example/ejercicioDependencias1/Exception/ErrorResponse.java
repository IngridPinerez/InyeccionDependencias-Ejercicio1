package com.example.ejercicioDependencias1.Exception;

import java.time.ZonedDateTime;

public class ErrorResponse {
    protected String mensaje;
    protected Integer code;
    protected ZonedDateTime hora;

    public ErrorResponse(String mensaje, Integer code, ZonedDateTime hora) {
        this.mensaje = mensaje;
        this.code = code;
        this.hora = hora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ZonedDateTime getHora() {
        return hora;
    }

    public void setHora(ZonedDateTime hora) {
        this.hora = hora;
    }
}
