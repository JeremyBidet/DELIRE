import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Jeremy
 */
public class SessionManager {

    public static HttpSession getSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public static HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }

    public static AuthenticationBean getUser() {
        HttpSession session = SessionManager.getSession();
        if (session != null) {
            return ((AuthenticationBean) session.getAttribute("user"));
        }
        else {
            return null;
        }
    }

    public static String getUsername() {
        HttpSession session = SessionManager.getSession();
        if (session != null) {
            return ((AuthenticationBean) session.getAttribute("user")).getUsername();
        }
        else {
            return null;
        }
    }

    public static String getUserID() {
        HttpSession session = SessionManager.getSession();
        if (session != null) {
            return (String) session.getAttribute("userid");
        }
        else {
            return null;
        }
    }
}
