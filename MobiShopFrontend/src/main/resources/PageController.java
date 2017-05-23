import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("AboutUs")
	public String aboutUs()
	{
		return "AboutUs";
	}
	@RequestMapping("Register")
	public String showRegister()
	{
		return "Register";
	}
}

