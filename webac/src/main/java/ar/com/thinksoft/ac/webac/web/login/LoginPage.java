package ar.com.thinksoft.ac.webac.web.login;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.JavascriptPackageResource;

import ar.com.thinksoft.ac.webac.AccionCiudadanaSession;
import ar.com.thinksoft.ac.webac.web.HomePage.HomePage;
import ar.com.thinksoft.ac.webac.web.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(final PageParameters parameters) {

		add(CSSPackageResource.getHeaderContribution(LoginPage.class,"../css/LoginPage.css"));
		add(JavascriptPackageResource.getHeaderContribution(LoginPage.class,"../js/login.js"));
		if (((AccionCiudadanaSession)getSession()).getUsuario() != null)
			setResponsePage(HomePage.class);
		else {
			add(new LoginForm("loginForm"));
			
		}

	}

}