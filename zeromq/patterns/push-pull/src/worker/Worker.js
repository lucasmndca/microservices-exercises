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
var __asyncValues = (this && this.__asyncValues) || function (o) {
    if (!Symbol.asyncIterator) throw new TypeError("Symbol.asyncIterator is not defined.");
    var m = o[Symbol.asyncIterator], i;
    return m ? m.call(o) : (o = typeof __values === "function" ? __values(o) : o[Symbol.iterator](), i = {}, verb("next"), verb("throw"), verb("return"), i[Symbol.asyncIterator] = function () { return this; }, i);
    function verb(n) { i[n] = o[n] && function (v) { return new Promise(function (resolve, reject) { v = o[n](v), settle(resolve, reject, v.done, v.value); }); }; }
    function settle(resolve, reject, d, v) { Promise.resolve(v).then(function(v) { resolve({ value: v, done: d }); }, reject); }
};
Object.defineProperty(exports, "__esModule", { value: true });
const HostBuilder_1 = require("../util/HostBuilder");
const zeromq_1 = require("zeromq");
const socket = new zeromq_1.Pull();
const host = new HostBuilder_1.HostBuilder();
// Starts a new worker
run();
function run() {
    var e_1, _a;
    return __awaiter(this, void 0, void 0, function* () {
        yield socket.connect(host.getPrimaryHost());
        console.log("Connected to the server.");
        try {
            for (var socket_1 = __asyncValues(socket), socket_1_1; socket_1_1 = yield socket_1.next(), !socket_1_1.done;) {
                const msg = socket_1_1.value;
                console.log(`Received the job number ${msg.toString()}`);
            }
        }
        catch (e_1_1) { e_1 = { error: e_1_1 }; }
        finally {
            try {
                if (socket_1_1 && !socket_1_1.done && (_a = socket_1.return)) yield _a.call(socket_1);
            }
            finally { if (e_1) throw e_1.error; }
        }
    });
}
