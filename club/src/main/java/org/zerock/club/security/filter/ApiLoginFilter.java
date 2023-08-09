package org.zerock.club.security.filter;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

@Log4j2
public class ApiLoginFilter extends AbstractPreAuthenticatedProcessingFilter {

    public ApiLoginFilter(String defaulFilterProcessUrl) {
        super(defaulFilterProcessUrl);
    }


}
