<?php
$hostname = "localhost";
$username = "root";
$dbname = "juke";
$password = "root";
$db_server = mysqli_connect("$hostname", "$username", "$password", "$dbname");

echo "
<body>
<div style=\"color: white; text-align: center; font-size: 400%;\"> Enter your passphrase (longer than 8 characters)</div>
<input type='text' name='passphrase'></br>
<button type='button' onclick='check_passphrase()' style='width: 100%; height: 50%; background-color: green;' id=\"player_button\">

</body>
</html>
  ";
  

?>
