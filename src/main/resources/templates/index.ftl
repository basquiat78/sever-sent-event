<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<script>

var source;

function loadScript () {
	source = new EventSource("http://localhost:8080/sse-flux");
}

function start() {
	 
	source.onmessage = function (event) {
		var data = JSON.parse(event.data);
		//var data =  event.data;
		var div = document.getElementById('sse');
		div.innerHTML += "<div> Server Sent-Event Sequence : " + data.sequence + ", LocalTime : " + data.localTime + "</div>";
	};

     source.onerror = function () {
		this.close();
	};

	source.stop = function() {
		this.source.close();
	};
	
}

window.onload = function() {
	loadScript();
	start();
};

</script>
<body>
	<div class="container">
	    <div>
	        <div id="title">
	            <h1>Spring WebFlux Server Sent-Events</h1>
	        </div>
	        <div id="sse"></div>
	    </div>
	</div>
</body>
</html>