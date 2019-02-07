/**
 * 
 */
package viveksingh.restful.currency.conversion.bean;

import java.math.BigDecimal;

/**
 * @author vivek_xz2hujv
 *
 */
public class CurrencyConversionBean {

	private Long id;

	private String from;

	private String to;

	private BigDecimal quantity;

	private BigDecimal conversionMultiple;

	private BigDecimal totalCalculatedValue;

	private int servicePort;

	/**
	 * Default.
	 */
	public CurrencyConversionBean() {
		super();
	}

	/**
	 * @param id
	 * @param from
	 * @param to
	 * @param quantity
	 * @param conversionMultiple
	 * @param totalCalculatedValue
	 */
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalCalculatedValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculatedValue = totalCalculatedValue;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	/**
	 * @param conversionMultiple the conversionMultiple to set
	 */
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	/**
	 * @return the totalCalculatedValue
	 */
	public BigDecimal getTotalCalculatedValue() {
		return totalCalculatedValue;
	}

	/**
	 * @param totalCalculatedValue the totalCalculatedValue to set
	 */
	public void setTotalCalculatedValue(BigDecimal totalCalculatedValue) {
		this.totalCalculatedValue = totalCalculatedValue;
	}

	/**
	 * @return the servicePort
	 */
	public int getServicePort() {
		return servicePort;
	}

	/**
	 * @param servicePort the servicePort to set
	 */
	public void setServicePort(int servicePort) {
		this.servicePort = servicePort;
	}

}
