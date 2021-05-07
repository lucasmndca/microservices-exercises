"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
const HostBuilder_1 = require("../util/HostBuilder");
const zeromq_1 = require("zeromq");
const socket = new zeromq_1.Push();
const host = new HostBuilder_1.HostBuilder();
// Starts the server
run();
function run() {
    return __awaiter(this, void 0, void 0, function* () {
        yield socket.bind(host.getPrimaryHost());
        console.log(`Server is running on ${host.port}`);
        send();
    });
}
function send() {
    return __awaiter(this, void 0, void 0, function* () {
        let index = 1;
        while (index <= 100) {
            setTimeout(() => null, 500);
            yield socket.send(`${index}`);
            index++;
        }
    });
}
