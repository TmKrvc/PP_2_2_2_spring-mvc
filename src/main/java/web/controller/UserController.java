package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;

@Controller
//@RequestMapping("/users")
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserDAO userDAO;



    @GetMapping()
    public String index(Model model) {
        model.addAttribute("users", userDAO.getAllUsers());
        return "allUsers";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userDAO.getUser(id));
        return "getUsers";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping
    public String create(@ModelAttribute("user") User user) {
        userDAO.addUser(user.getName(),user.getSurname());
        return "redirect:/";

    }

    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable("id") int id){
        model.addAttribute("user",userDAO.getUser(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user,@PathVariable("id") int id){
        userDAO.updateUser(id,user.getName(),user.getSurname());
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        userDAO.removeUser(id);
        return "redirect:/";
    }
}
