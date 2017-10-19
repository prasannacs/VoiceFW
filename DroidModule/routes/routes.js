var appRouter = function(app) {
	app.get("/", function(req, res) {
    	res.send("Welcome to BB8 command module");
	});

	app.get("/droidcommand", function(req, res) {
	    var droidMock = {
	        "droid": "bb8",
	        "deviceId": "ak:kj:oi:we:sa:cv"
	    }
        return res.send(droidMock);
	});	

	app.post("/rolldroid", function(req, res) {
		console.log("Roll Droid command received ",req.body)
		return res.send(getResponse(req,"Roll Droid"))
	});	

	app.post("/spindroid", function(req, res) {
		console.log("Spin Droid command received ",req.body)
		return res.send(getResponse(req,"Spin Droid"))
	});	

	app.post("/changedroidcolor", function(req, res) {
		console.log("Change Droid Color command received ",req.body)
		return res.send("Change Droid Color")
	});	


}

getResponse = function(req,command)	{
	var response = {
		"responseMessage": command,
		"alexaAppId": req.body.alexaAppId,
		"duration" : req.body.duration,
		"direction" : req.body.direction,
		"color" : req.body.color
	}
	return response	
}

var sphero = require("sphero"),
    bb8 = sphero("F3:F2:6D:55:71:09"); // change BLE address accordingly

bb8.connect(function() {
  // roll BB-8 in a random direction, changing direction every second
  setInterval(function() {
    var direction = Math.floor(Math.random() * 360);
    bb8.roll(150, direction);
  }, 1000);
});


module.exports = appRouter;
