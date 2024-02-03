package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // @Autowired private final MemberService memberService; // 1. 필드 주입 (별로임)
    private final MemberService memberService;

//    @Autowired
//    public void setMemberService(MemberService memberService) { // 2. 세터 주입, public 노출 단점
//        this.memberService = memberService; // memberService.setMemberRepository();가 아무 개발자에게 열려있다 단점!
//    }

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService; // 3. 생성자 주입을 권장함 (의존관계가 실행 중에 동적으로 변하는 경우는 거의 없음)
    }
}

//