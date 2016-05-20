<!DOCTYPE HTML>
<html lang="en-us">
<head>
<body style="background-color:lightblue">
<meta charset="utf-8">
<meta name="author" content="florian">
<title>Get Last</title>
<script type="text/javascript">
/* Input: User enters no input.
* Processing: Calls the second function and stores the array in a variable.
* Output: Displays the array to the user.
*/
	function getValue() {
	var list = [2, 8, 5, 4, 12, 3, 15, 22, 4, 12, 66, 93, 5.3, -1.8, 5.6, -8.9];
	var fig = getLast(list);
	var value = fig;
	document.getElementById('output').innerHTML = value;
}
/* Input: User enters no input
* Processing: Computes the last value in the array and returns to the first function
* Output: Displays no output
*/
	function getLast(list) {
	var g = list.length;
	var h = list[g - 1];
	return h;
}
</script>
</head>
<body>
<h1>What is the Last Value In the Array?</h1>
<button type="button" onclick="getValue()">Compute Last Value</button><br>
<br>
<div id="output"></div>

</body> 
</html>



