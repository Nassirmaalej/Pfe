/*
 * package com.pfe.serviceimpl;
 * 
 * 
 * import com.pfe.entities.UserPrinciple;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * @Service public class UserDetailsServiceImpl implements UserDetailsService {
 * 
 * @Autowired com.pfe.dao.UserRepository userRepository;
 * 
 * @Override
 * 
 * @Transactional public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException {
 * 
 * com.pfe.entities.User user = userRepository.findByUsername(username)
 * .orElseThrow(() -> new
 * UsernameNotFoundException("User Not Found with -> username or email : " +
 * username) );
 * 
 * return UserPrinciple.build(user); } }
 */