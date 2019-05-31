package net.koreate.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import net.koreate.dao.MemberDao;
import net.koreate.vo.MemberVo;

@RunWith(SpringRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class App2 {
	
	@Inject
	private MemberDao dao;
	
	@Test
	public void testRead() {
		MemberVo vo = dao.read("admin99");
		System.out.print("memberVo : " + vo);
	}
	
}
