package ar.com.thinksoft.ac.webac.web.usuario.form;

import org.apache.wicket.PageParameters;
import org.apache.wicket.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.JavascriptPackageResource;

import ar.com.thinksoft.ac.webac.web.base.BasePage;
import ar.com.thinksoft.ac.webac.web.reclamo.busquedaReclamo.BusquedaReclamoPage;


@AuthorizeInstantiation("ADMIN")
public class UsuarioPage extends BasePage {

	public UsuarioPage(final PageParameters parameters) {

		add(CSSPackageResource.getHeaderContribution(BusquedaReclamoPage.class, "../../css/UsuarioPage.css"));
		add(JavascriptPackageResource.getHeaderContribution(BusquedaReclamoPage.class,"../../js/busquedaReclamo.js"));
		
		add(new UsuariosForm("form"));
		
		

	}

}
