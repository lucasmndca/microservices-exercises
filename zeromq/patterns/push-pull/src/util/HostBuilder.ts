import * as globalConfig from "../config/global.json";

export class HostBuilder {

    method: string;
    primaryAddress: string;
    secondaryAddress: string;
    port: string;

    constructor() {
        this.method = globalConfig.method;
        this.primaryAddress = globalConfig.host.primary;
        this.secondaryAddress = globalConfig.host.secondary;
        this.port = globalConfig.port;
    }

    getPrimaryHost(): string {
        return `${this.method}://${this.primaryAddress}:${this.port}`;
    }

    getSecondaryHost(): string {
        return `${this.method}://${this.secondaryAddress}:${this.port}`;
    }

}