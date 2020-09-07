package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        // model 데이터를 실어서 뷰로 넘겨준다.
        model.addAttribute("data", "hello");
        return "hello"; // return 하는 화면 이름이다.
    }
}
