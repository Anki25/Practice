package niit.controller;


@Controller
public class LoginController {

	
	@RequestMapping("/")
	public ModelAndView showWelcome(){
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
}
