package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //싱글톤 + 컨트롤러로 등록
public class BoardController {

    //method+url 요청 분석 --> 함수하나!
    @GetMapping("createPost")
    public String createPost() {
        return "createPost";
    }

    @GetMapping("deletePost")
    public String deletePost() {
        return "deletePost";
    }

    @GetMapping("editPost")
    public String editPost() {
        return "editPost";
    }

    @PostMapping("viewPost")
    public String viewPost() {
        return "viewPost";
    }
}
