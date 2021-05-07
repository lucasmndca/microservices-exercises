import { HostBuilder } from "../util/HostBuilder";
import { Pull } from "zeromq";

const socket: Pull = new Pull();
const host: HostBuilder = new HostBuilder();

// Starts a new worker
run();

async function run(): Promise<void> {

    await socket.connect(host.getPrimaryHost());
    console.log("Connected to the server.");

    for await (const msg of socket) {
        console.log(`Received the job number ${msg.toString()}`);
    }

}