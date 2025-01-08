package es.jorgegueyer.dev.pattern.visitor;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RegistroEntrada {

    private String cliente;

    private LocalDate fecha;

    private int importe;

    private int pagado;

    private Detalle detalle;
}
