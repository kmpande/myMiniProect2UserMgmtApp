package com.UMA.binding;

import lombok.Data;

@Data
public class UnlockAccountForm {
	private String UserEmail;
	private String tempPwd;
	private String newPwd;
	private String confirmPwd;
}
