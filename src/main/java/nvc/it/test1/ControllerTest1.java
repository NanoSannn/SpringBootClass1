package nvc.it.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest1 {
    // @RequestMapping(method=RequestMethod.GET, value = "/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody

    public String index(){
        return "<center>This root page</center><br><center>Chawanwit Tambunnak 63309010004</center><br><center><a href='/name'>go</a></center><br><center><img src='https://i.pinimg.com/236x/77/9c/41/779c4178cc7c4172346b32151a380bf2.jpg'></center>";
    }
    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return "<center>Chawanwit Tambunnak</center><br><center><a href='/aboutme'>go</a></center><br><center><a href='/'>back</a></center>";
    }
    @RequestMapping("/aboutme")
    @ResponseBody
    public String aboutme(){
        return "<center><h1>Name : Chawanwit Tambunnak</h1></center> <br> <center><h4>Tel : 0987256736</h4></center><br><center><a href='/name'>back</a></center>";
    }

}
