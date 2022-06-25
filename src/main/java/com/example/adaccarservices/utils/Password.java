package com.example.adaccarservices.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

public @interface Password {
    String message() default "*Please provide a valid Password";

    PasswordEncoder passwordEncoder = new PasswordEncoder() {
        @Override
        public String encode(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override
        public boolean matches(CharSequence charSequence, String s) {
            return charSequence.toString().equals(s);
        }
    };
}
