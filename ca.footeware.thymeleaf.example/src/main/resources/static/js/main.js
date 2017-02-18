/**
 * 
 */
function getWeather() {
	$.ajax("http://localhost:8080/weather").done(function(data) {
		$("#weather").html(data);
	}).fail(function(xhr, textStatus, errorThrown) {
		alert(textStatus);
	});
}
