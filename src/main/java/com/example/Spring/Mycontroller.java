package com.example.Spring;
import com.example.TestLeetcode.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
class Mycontroller {
    @GetMapping("/")
    String index(){
        return "index";
    }
}
@RestController
class Myrestcontroller{
    @RequestMapping("/leetcode001")
    int leetcode001(String haystack, String needle){
        //http://localhost:8080/leetcode001?haystack=sadbutsad&needle=sad
         Leetcode001 leetcode001=new Leetcode001();
        return leetcode001.strStr(haystack, needle);
    }
    @RequestMapping("/leetcode002")
    boolean leetcode002(String s, String t){
        Leetcode002 leetcode002=new Leetcode002();
        return leetcode002.isIsomorphic(s, t);
    }
    @RequestMapping("/leetcode003")
    String leetcode003(String s){
        Leetcode003 leetcode003=new Leetcode003();
        
        return "";
    }
    @RequestMapping("/leetcode004")
    String leetcode004(String s){
        Leetcode004 leetcode004=new Leetcode004();
        return leetcode004.reverseVowels(s);
    }
    
}
