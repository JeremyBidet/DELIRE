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

@ManagedBean(name = "authenticate")
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
        this.password = password;
    }

    public String getRpps() {
        return this.rpps;
    }

    public void setRpps(String rpps) {
        this.rpps = rpps;
    }

    public String login() {
        FacesContext context = FacesContext.getCurrentInstance();

        // TODO: CONVERGENCE: validate credentials from the database {username, password, rpps}
        if(this.username.equals("admin") && this.password.equals(SecurityManager.sha1("pass@word1"))) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome Admin", null));
            try {
                context.getExternalContext().redirect("secure/admin.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "secure/admin";
        }
        boolean loggedIn = AuthenticationDAO.validate(this.username, SecurityManager.sha1(this.password), this.rpps);
        if (loggedIn) {
            HttpSession session = SessionBean.getSession();
            session.setAttribute("username", this.username);
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
        HttpSession session = SessionBean.getSession();
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
