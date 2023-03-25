package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/") //一根斜杠“/”表示根目录
    public String index() {
        return "index"; //返回static文件夹下的index.html模版
    }
}
