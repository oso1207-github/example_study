/**
 * 
 */
 
 function check(){
	if (document.frm.name.value == "") {
		alert("이름을 입력해주세요.");
		document.frm.name.foucs();
		return false;
	}
	
	else if (isNaN(document.frm.renumber1.value)) {
		alert("주민번호는 숫자로 입력하세요.");
		document.frm.renumber1.focus();
		return false;
	}
	
	else if (isNaN(document.frm.renumber2.value)) {
		alert("주민번호는 숫자로 입력하세요.");
		document.frm.renumber2.focus();
		return false;
	}
	else if (doucment.frm.id.value == "") {
		alert("아아디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}
	else if (doucment.frm.password.value == "") {
		alert("패스워드를 입력해주세요.");
		document.frm.password.focus();
		return false;
	}

	else return true;
}