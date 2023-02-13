package com.todo.dev;

import com.todo.dev.security.SecurityService;
import com.todo.dev.domain.dto.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.repository.MembersRepository;
import com.todo.dev.security.TokenInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevApplicationTests {
	@Autowired
	MembersRepository membersRepository;

	@Test
	void contextLoads() {

	}


	@Test
	void loginTest() {

		LoginRequest request = new LoginRequest("park" ,"1234") ;
		Members findMember = membersRepository.login(request);
		System.out.println(findMember.toString());

	}
	@Autowired
	SecurityService securityService;

	@Test
	void valueTest() {
		Members member = new Members(
				1,"park","1234","park","01022222222"
		);
		String token = securityService.createToken(member);
		System.out.println(token);
	}

	@Test
	void parseTokenTest(){
		String token = "eyJhbGciOiJIUzUxMiJ9.eyJwaG9uZU51bWJlciI6IjAxMDIyMjIyMjIyIiwibmFtZSI6InBhcmsiLCJpZCI6MSwiZXhwIjoxNjc2MDAzMDkxfQ.Z_6xjGtwKpokdbVVXK6t-v7gma5SaF01xNaUqXhWLdXQaWtU4CQMZraWcUU9Nu9JKFKuNMRLhYxwhELkR-oQWw";
		TokenInfo info = securityService.parseToken(token);
		System.out.println(info.toString());
	}


	@Test
	void builderTest() {
		Members member = Members
				.builder()
				.id(1)
				.memberId("park")
				.memberPw("1234")
				.name("park")
				.phoneNumber("01022222222")
				.build();
		System.out.println(member);
	}
}
