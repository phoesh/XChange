package info.bitrich.xchangestream.gateio.config;

import com.fasterxml.jackson.databind.util.StdConverter;
import org.knowm.xchange.currency.CurrencyPair;

/**
 * Converts {@code CurrencyPair} to string
 */
public class CurrencyPairToStringConverter extends StdConverter<CurrencyPair, String> {

  @Override
  public String convert(CurrencyPair value) {
    return value.getBase() + "_" + value.getCounter();
  }
}
