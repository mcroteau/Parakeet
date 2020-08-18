package io.github.mcroteau.resources.filters;

import io.github.mcroteau.resources.Cache;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CacheFilter implements Filter {

    @Override
    public void init(FilterConfig config) throws ServletException { }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        Cache.cacheRequest(req);
        Cache.cacheResponse(resp);

        chain.doFilter(request, response);

    }

    @Override
    public void destroy() { }

}
