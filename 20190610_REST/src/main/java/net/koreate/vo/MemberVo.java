package net.koreate.vo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVo {
	private int mno;
	private String userid;
	private String userpw;
	private String userName;
	private boolean enabled;
	private Date regDate;
	private Date updateDate;
	private int boradConut;
	private int commentConut;
	private int deliveryCount;
	private List<AuthVo> authList;
}
