/**
 * 
 */
package viveksingh.restful.currency.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import viveksingh.restful.currency.exchange.bean.ExchangeValue;

/**
 * @author vivek_xz2hujv
 *
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	// Query method
	public ExchangeValue findByFromAndTo(String from, String to);
}
