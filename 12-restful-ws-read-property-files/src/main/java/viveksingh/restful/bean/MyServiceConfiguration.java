/**
 * 
 */
package viveksingh.restful.bean;

/**
 * @author vivek_xz2hujv
 *
 */
public class MyServiceConfiguration {

	private int one;
	private int two;
	private int three;
	
	/**
	 * Default.
	 */
	public MyServiceConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param one
	 * @param two
	 * @param three
	 */
	public MyServiceConfiguration(int one, int two, int three) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
	}

	/**
	 * @return the one
	 */
	public int getOne() {
		return one;
	}

	/**
	 * @return the two
	 */
	public int getTwo() {
		return two;
	}

	/**
	 * @return the three
	 */
	public int getThree() {
		return three;
	}
	
}
