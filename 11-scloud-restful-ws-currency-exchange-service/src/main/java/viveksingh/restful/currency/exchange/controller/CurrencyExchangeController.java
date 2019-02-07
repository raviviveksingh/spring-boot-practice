/**
 * 
 */
package viveksingh.restful.currency.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import viveksingh.restful.currency.exchange.bean.ExchangeValue;
import viveksingh.restful.currency.exchange.repository.ExchangeValueRepository;

/**
 * @author vivek_xz2hujv
 *
 */
@RestController
public class CurrencyExchangeController {

	@Autowired
	Environment environment;

	@Autowired
	ExchangeValueRepository exchangeValueRepository;

	@GetMapping(value = "/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable final String from, @PathVariable final String to) {

		final ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);

		exchangeValue.setServicePort(Integer.parseInt(environment.getProperty("local.server.port")));

		return exchangeValue;
	}
}
