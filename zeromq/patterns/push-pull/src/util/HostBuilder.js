"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.HostBuilder = void 0;
const globalConfig = require("../config/global.json");
class HostBuilder {
    constructor() {
        this.method = globalConfig.method;
        this.primaryAddress = globalConfig.host.primary;
        this.secondaryAddress = globalConfig.host.secondary;
        this.port = globalConfig.port;
    }
    getPrimaryHost() {
        return `${this.method}://${this.primaryAddress}:${this.port}`;
    }
    getSecondaryHost() {
        return `${this.method}://${this.secondaryAddress}:${this.port}`;
    }
}
exports.HostBuilder = HostBuilder;
