//https://school.programmers.co.kr/learn/courses/30/lessons/178871

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [2];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    str = input[0];
    n = Number(input[1]);
    
    for(let i = 0; i < n; i++){
        process.stdout.write(str);
    }
});