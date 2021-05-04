const zmq = require('zeromq');
const sock = zmq.socket('req');

async function runClient() {
  console.log('Connecting to hello world server…');

  //  Socket to talk to server
  sock.connect('tcp://localhost:5555');

  for (let i = 0; i < 10; i++) {
    console.log('Sending Hello ', i);
    await sock.send('Hello');
    const [result] = await sock.receive();
    console.log('Received ', result.toString(), i);
  }
}

runClient();