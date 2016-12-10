package $package;


import javax.portlet.RenderRequest
import javax.portlet.RenderResponse
import com.liferay.util.bridges.mvc.MVCPortlet

class HelloWorldController : MVCPortlet() {

    override fun doView(req: RenderRequest, res: RenderResponse) {
        req.setAttribute("testAttribute", "Hello World!")
        super.doView(req, res)
    }
}