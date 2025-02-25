package com.example.GymManagement.controller;

import com.example.GymManagement.model.Member;
import com.example.GymManagement.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerMember(@RequestBody Member member) {
        if (memberRepository.existsById(member.getMemberId())) {
            return ResponseEntity.badRequest().body("Member ID already exists. Please choose a unique ID.");
        }
        
        memberRepository.save(member);
        return ResponseEntity.ok("Member registered successfully!");
    }

    @GetMapping("/active")
    public ResponseEntity<List<Member>> getActiveMembers() {
        List<Member> activeMembers = memberRepository.findByActiveStatusTrue();
        return ResponseEntity.ok(activeMembers);
    }
}
