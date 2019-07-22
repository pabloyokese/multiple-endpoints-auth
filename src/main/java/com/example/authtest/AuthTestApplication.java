package com.example.authtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AuthTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthTestApplication.class, args);
    }

}

//@RestController
//@RequestMapping("admin")
//class TestController{
//    @GetMapping("/")
//    public String helloWorld(){
//        return "Home!";
//    }
//}

@RestController
class RestApiController{
    @GetMapping("/api/test")
    public String test(){
        return "something";
    }
}

@Controller
class RestTestController{

    @RequestMapping("/multipleHttpLinks")
    public String getMultipleHttpLinksPage() {
        return "multipleHttpElems/multipleHttpLinks";
    }

    @RequestMapping("/admin/myAdminPage")
    public String getAdminPage() {
        return "multipleHttpElems/myAdminPage";
    }

    @RequestMapping("/user/general/myUserPage")
    public String getUserPage() {
        return "multipleHttpElems/myUserPage";
    }

    @RequestMapping("/user/private/myPrivateUserPage")
    public String getPrivateUserPage() {
        return "multipleHttpElems/myPrivateUserPage";
    }

    @RequestMapping("/guest/myGuestPage")
    public String getGuestPage() {
        return "multipleHttpElems/myGuestPage";
    }

    @RequestMapping("/userLogin")
    public String getUserLoginPage() {
        return "multipleHttpElems/login";
    }

    @RequestMapping("/userLoginWithWarning")
    public String getUserLoginPageWithWarning() {
        return "multipleHttpElems/loginWithWarning";
    }

    @RequestMapping("/403")
    public String getAccessDeniedPage() {
        return "403";
    }
}

