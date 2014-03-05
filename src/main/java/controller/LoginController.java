package controller;
 
import javax.servlet.http.HttpServletRequest;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAO.UserDAO;
 
@Controller
public class LoginController {
 
    @Autowired
    private UserDAO userDao;
 
    @RequestMapping(value="/guest")
    public ModelAndView login(HttpServletRequest request) {

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        if (userName != null) {
        	
        }
            
 
        // Prepare the result view (guest.jsp):
        return new ModelAndView("index.jsp", "userDao", userDao);
    }
}