package org.zerock.club.security.filter;

import lombok.extern.log4j.Log4j2;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
public class ApiCheckFilter extends OncePerRequestFilter {

    private AntPathMatcher antPathMatcher;
    private String parttern;

    public ApiCheckFilter(String parttern) {
        this.antPathMatcher = new AntPathMatcher();
        this.parttern = parttern;
    }



    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        log.info("REQUESTURI: "+ request.getRequestURI());

        log.info(antPathMatcher.match(parttern, request.getRequestURI()));

        if (antPathMatcher.match(parttern, request.getRequestURI())) {


            log.info("ApiCheckFilter............................");
            log.info("ApiCheckFilter............................");
            log.info("ApiCheckFilter............................");

            return;

        }

        filterChain.doFilter(request, response);    // 필터의 다음 단계로 넘어가는 역할 - SecurityConfig를 통해서 스프링 빈으로 설정
    }
}
