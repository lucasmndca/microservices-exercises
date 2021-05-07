import { HostBuilder } from "../util/HostBuilder";
import { Push } from "zeromq";

const socket: Push = new Push();
const host: HostBuilder = new HostBuilder();

// Starts the server
run();

async function run(): Promise<void> {

    await socket.bind(host.getPrimaryHost());
    console.log(`Server is running on ${host.port}`);
    send();
}

async function send(): Promise<void> {
    let index: number = 1;
    while (index <= 100) {
        await socket.send(`${index}`);
        index++;
    }
}