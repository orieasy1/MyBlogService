package com.mysite.myblog.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ExampleController {
    @GetMapping("/thymeleaf/example")
    public String thymeleafExample(Model model) {   //뷰로 데이터를 넘겨주는 모델 객체
        List<Player> players = List.of(
                new Player("1번 타자", 0, "황성빈", 26, List.of("중견수", "우투좌타")),
                new Player("2번 타자", 91, "윤동희", 20, List.of("우익수", "우투우타")),
                new Player("3번 타자", 8, "전준우", 38, List.of("지명타자", "우투우타")),
                new Player("4번 타자", 29, "빅터 레이예스", 29, List.of("좌익수", "우투양타")),
                new Player("5번 타자", 65, "고승민", 23, List.of("2루수", "우투좌타")),
                new Player("6번 타자", 51, "나승엽", 22, List.of("1루수", "우투좌타")),
                new Player("7번 타자", 9, "정훈", 36, List.of("3루수", "우투우타")),
                new Player("8번 타자", 00, "손성빈", 22, List.of("포수", "우투우타")),
                new Player("9번 타자", 53, "박승욱", 31, List.of("유격수", "우투좌타")),
                new Player("선발 투수", 28, "찰리 반즈", 28, List.of("선발투수", "좌투좌타"))
        );

        model.addAttribute("players", players); //players 저장
        model.addAttribute("today", LocalDate.now());

        return "example";   //example.html라는 뷰 조회
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class Player {
        private String id;
        private int uniformNum;
        private String name;
        private int age;
        private List<String> position;
    }
}
