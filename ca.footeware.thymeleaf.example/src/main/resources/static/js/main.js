/**
 * A simple GET and element update.
 */
function getWeather() {
	$.ajax("http://localhost:8080/weather").done(function(data) {
		$("#weather").html(data);
	}).fail(function(xhr, textStatus, errorThrown) {
		alert(textStatus);
	});
}

/**
 * Post a value in the URL rather than using RequestBody.
 */
function setWeather() {
	$.post("http://localhost:8080/weather/snow").done(function(data) {
		$("#setting").html("You want " + data);
	}).fail(function(xhr, textStatus, errorThrown) {
		alert(textStatus);
	});
}
