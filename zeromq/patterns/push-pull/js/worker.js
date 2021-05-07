const HostBuilder = require("../util/HostBuilder");

const zmq = require("zeromq");
const socket = new zmq.Pull();
const host = new HostBuilder();

// Starts a new worker
run();

async function run() {

    await socket.connect(host.getPrimaryHost());
    console.log("Connected to the server.");

    for await (const msg of socket) {
        console.log(`Received the job number ${msg.toString()}`);
    }

}