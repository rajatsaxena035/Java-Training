function count(){
	var startTime = document.getElementById('hms').innerHTML;
	var pieces = startTime.split(":");
	var time = new Date();
	time.setHours(pieces[0]);
	time.setMinutes(pieces[1]);
	time.setSeconds(pieces[2]);
	var timedif = new Date(time.valueOf()-1000);
	var newtime = timedif.toTimeString().split(" ")[0];
	document.getElementById('hms').innerHTML=newtime;
	setTimeout(count,1000);
}
count();