import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Jeremy
 */
public class SessionBean {

    public static HttpSession getSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }

    public static String getUsername() {
        HttpSession session = SessionBean.getSession();
        if (session != null) {
            return session.getAttribute("username").toString();
        }
        else {
            return null;
        }
    }

    public static String getUserID() {
        HttpSession session = SessionBean.getSession();
        if (session != null) {
            return (String) session.getAttribute("userid");
        }
        else {
            return null;
        }
    }
}
