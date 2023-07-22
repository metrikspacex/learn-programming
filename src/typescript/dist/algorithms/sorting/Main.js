"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const BubbleSort_1 = require("./BubbleSort");
function Main() {
    const bs = new BubbleSort_1.BubbleSort();
    bs.sort([20, 35, -15, 7, 55, 1, -22]);
}
Main();
