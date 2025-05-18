package dds.monedero.model;

import java.time.LocalDate;

public class Deposito extends Movimiento{

  public Deposito(LocalDate fecha, double monto) {
    super(fecha, monto);
  }

  @Override
  public double calcularValor(Cuenta cuenta) {
    return cuenta.getSaldo() + getMonto();
  }

  @Override
  public boolean fueDepositado(LocalDate fecha) {
    return esDeLaFecha(fecha);
  }
  @Override
  public boolean fueExtraido(LocalDate fecha) {
    return false;
  }
  @Override
  public double getMontoExtraccion() {
    return 0;
  }
}
