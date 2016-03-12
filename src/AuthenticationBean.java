import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.sun.istack.internal.NotNull;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Jeremy.
 */

@ManagedBean(name = "authentication")
@SessionScoped
public class AuthenticationBean implements Serializable {

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String rpps;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = SecurityManager.sha1(password);
    }

    public String getRpps() {
        return this.rpps;
    }

    public void setRpps(String rpps) {
        this.rpps = rpps;
    }

    public String login() {
        FacesContext context = FacesContext.getCurrentInstance();

        // Bypass the DB validation and log in as a test user
        if(this.username.equals("test") && this.password.equals(SecurityManager.sha1("test"))) {
            HttpSession session = SessionManager.getSession();
            session.setAttribute("user", this);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "You are logging in as Test user", null));
            try {
                context.getExternalContext().redirect("secure/medical_record.xhtml");
            } catch(IOException e) {
                e.printStackTrace();
            }
            return "secure/medical_record";
        }

        // Bypass the DB validation and redirect to the administration UI
        if(this.username.equals("admin") && this.password.equals(SecurityManager.sha1("pass@word1"))) {
            HttpSession session = SessionManager.getSession();
            session.setAttribute("user", this);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome Admin", null));
            try {
                context.getExternalContext().redirect("secure/admin.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "secure/admin";
        }

        // DB validation before log in
        boolean loggedIn = AuthenticationDAO.validate(this.username, this.password, this.rpps);
        if (loggedIn) {
            HttpSession session = SessionManager.getSession();
            session.setAttribute("user", this);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome" + this.username, null));
            try {
                context.getExternalContext().redirect("secure/medical_record.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "secure/medical_record";
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error - Invalid credentials", null));
            return "login";
        }
    }

    public String logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = SessionManager.getSession();
        session.invalidate();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Bye bye" + this.username, null));
        try {
            context.getExternalContext().redirect("login.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "login";
    }

}
