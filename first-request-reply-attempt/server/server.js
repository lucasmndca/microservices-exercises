const zmq = require("zeromq");
const sock = zmq.socket("rep")
const config = require("./config.json");
const currentEnv = config.dev;


async function runServer() {
    console.log(`Server running on port ${currentEnv.portHash}`)

    try {
        await sock.bind(currentEnv.port);

        for await (const [msg] of sock) {
            console.log('Received ' + ': [' + msg.toString() + ']');
            await sock.send('World');
            // Do some 'work'
        }
    } catch (error) {
        const timestamp = new Date;
        console.error(`[${timestamp}] - ${error}`);
    }
}

runServer();