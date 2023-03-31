/**
 * 
 */
 
 function check(){
	if (doucment.frm.id.value == "") {
		alert("아아디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}
	else if (document.frm.age.value == "") {
		alert("나이를 입력해주세요.");
		document.frm.age.foucs();
		return false;
	}
	else if (isNaN(document.frm.age.value)) {
		alert("나이는 숫자로 입력하세요.");
		document.frm.age.focus();
		return false;
	}
	else return true;
}