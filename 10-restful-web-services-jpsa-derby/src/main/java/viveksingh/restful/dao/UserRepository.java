/**
 * 
 */
package viveksingh.restful.dao;

import org.springframework.data.repository.CrudRepository;

import viveksingh.restful.bean.User;

/**
 * @author vivek_xz2hujv
 *
 */
public interface UserRepository extends CrudRepository<User, String> {

}
