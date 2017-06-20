(
~listener = {|msg, time, replyAddr, recvPort|
	if (msg[0] != "/status.reply", {
		// Log all received messages to the console.
		("PhET event received on port" + recvPort + "from " + replyAddr.ip + ":" + replyAddr.port + ":" + msg).postln;
	});
};

thisProcess.addOSCRecvFunc(~listener);
)
