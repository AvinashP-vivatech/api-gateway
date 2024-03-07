package com.mhealth.apigateway.services;

import com.mhealth.apigateway.entity.PUser;
import com.mhealth.apigateway.repository.PUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

 @Autowired
 private PUserRepository userRepository;

  // @Autowired
  // private PasswordEncoder bcryptEncoder;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    PUser user = userRepository.findByContactNumber(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with contact number: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getContactNumber(), "",
				new ArrayList<>());
	}

	}
