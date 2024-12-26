package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //싱글톤 + 컨트롤러로 등록
public class MemberController {

    //method+url 요청 분석 --> 함수하나!
    @GetMapping("create")
    public String create() {
       return "create";
    }

    @PostMapping("create2")
    public String create2(MemberVO memberVO, Model model) {
        //Model이라는 클래스는 html에 값을 전달할 때 사용하는 것.
        //이 메서드 실행할때만 필요하기 때문에
        //이 메서드의 파라메터로 선언하면 스프링이 찾아서 주소를 넣어줌.
        //model변수에 200번에 있더라라고 주소를 넣어줌.
        //객체(부품)은 주소만 알면 객체의 기능(메서드)을 쓸 수 있다.
        //html에 전달할 값 지정하자.!!!
       // model.addAttribute("id", memberVO.getId());
       // model.addAttribute("pw", memberVO.getPw());
        model.addAttribute("memberVO", memberVO);
        //여러개 넘길 수 있다.

//    public String create2(String id, String pw,
//                          String name, String tel) {
        //id=apple&pw=1234&name=park&tel=9999
        //파라메터이름과 호출되는 함수의 매개변수명은 같아야함.
        //input name="파라메터명"
        //input의 name="이름"과 호출되는 매개변수명은 같아야함.
        //System.out.println(id + " " + pw + " " + name + " " + tel);
        System.out.println(memberVO);

        //회원가입 결과를 html에 보내야할 것 같음.
        //html안에서는 컨트롤러가 보낸 결과를 프린트해야할 것 같음.!
        return "create2"; //회원가입 처리후 응답페이지
    }
    
    @GetMapping("delete")
    public String delete(String id, Model model) {
        System.out.println(id);
        model.addAttribute("id", id);
        return "delete";
    }

    @GetMapping("update")
    public String update(String id, Model model) {
        System.out.println(id);
        model.addAttribute("id", id);
        return "update";
    }

    @PostMapping("read")
    public String read(int id) {
        //http의 body로 전달된 id=100을 받아야 함.
        //String id = request.getParameter("id");
        //int id2 = Integer.parseInt(id);
        System.out.println("id = " + id);
        return "read";
    }
}
