package core;

import GoogleAuth.GoogleAuth;

public class GoogleServiceAdapter implements GoogleService {

	@Override
	public void logWithGoogle(String message) {
		GoogleAuth google = new GoogleAuth();
		google.log(message);
		
	}

}
