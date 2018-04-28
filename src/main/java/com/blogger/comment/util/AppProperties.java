package com.blogger.comment.util;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Will map properties with Place holder
 *
 * @author Rohit
 */

@Component
public class AppProperties {

    @Value("${session.timeout}")
    private int sessionTime;

    @Value("${country.locale.key}")
    private String countryLocaleKey;

    public int getSessionTime() {
        return sessionTime;
    }

    public String getCountryLocaleKey() {
        return countryLocaleKey;
    }

    public Locale getLocale() {
        return new Locale(countryLocaleKey);
    }

}
