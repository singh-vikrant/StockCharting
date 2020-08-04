package com.vikrant.stockmarket.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {

	private String jwtToken;
	private String username;
	private String usertype;
	private String header;
}
