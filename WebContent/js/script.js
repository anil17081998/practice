function validation() {
	var ttname = document.forms["menucard"]["txtname"].value;
	if(ttname=="") {
		alert("Title is required");
		document.forms["menucard"]["txtname"].focus();
		return false;
	}
	if ((ttname.length < 2) || (ttname.length > 65)) {
		alert("Title should have 2 to 65 characters.");
		document.forms["menucard"]["txtname"].select();
		return false;
	}
	if (/[^a-zA-Z ]/.test(ttname)) {
		alert("Name has to be a Alphabet");
		return false;
	}
	var tprice = document.forms["menucard"]["txtprice"].value;
	if(tprice=="") {
		alert("Price is required.");
		document.forms["menucard"]["txtprice"].focus();
		return false;
	}
	if (/[^0-9/.]/.test(tprice)) {
		alert("Price has to be a number.");
		return false;
	}
	var dateoflunch = document.forms["menucard"]["launch"].value;
	if(dateoflunch=="") {
		alert("Date of lunch is Required.");
		document.forms["menucard"]["launch"].focus();
		return false;
	}	
	var catselect = document.forms["menucard"]["categary"].value;
	if(catselect=="") {
		alert("Categary is required.");	
		return false;
	}
	}




