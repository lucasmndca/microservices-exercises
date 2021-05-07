const HostBuilder = require("../util/HostBuilder");

const zmq = require("zeromq");
const socket = new zmq.Push();
const host = new HostBuilder();

// Starts the server
run();

async function run() {

    await socket.bind(host.getPrimaryHost());
    console.log(`Server is running on ${host.port}`);
    send();
}

async function send() {
    for (let index = 0; index <= 100; index++) {
        await socket.send(`${index}`);
        await new Promise(resolve => setTimeout(resolve, 500));
    }
}