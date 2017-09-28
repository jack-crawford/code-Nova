//import express framework
const express = require('express');

//create configurable server object
const app = express();

//listens to GET requests (like browsers) at the root
app.get('/', function (req, res) {

	//sends client back 'Hello World'
		res.send('Hello World!');
});

//boots up server on port 8080 (arbitrary choice)
app.listen(8080, function () {

	//Visit localhost:8080 in your browser!
		console.log('Visit port 8080!');
});
