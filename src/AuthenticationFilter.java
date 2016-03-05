import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Jeremy
 */

@WebFilter(filterName = "AuthFilter", urlPatterns = { "*.xhtml" })
public class AuthenticationFilter implements Filter {

    public AuthenticationFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            HttpServletRequest reqt = (HttpServletRequest) request;
            HttpServletResponse resp = (HttpServletResponse) response;
            HttpSession ses = reqt.getSession(false);

            String contextPath = reqt.getContextPath();
            String reqURI = reqt.getRequestURI().substring(contextPath.length());
            if(!reqURI.equals("/login.xhtml") && (ses == null || (ses != null && ses.getAttribute("username") == null))) {
                resp.sendRedirect(reqt.getContextPath() + "/login.xhtml");
            }
            else {
                chain.doFilter(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
    }
}
