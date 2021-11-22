function minNum(input) {
    
    let command = input[0];
    let i = 1;
    let minNum = Number.MAX_SAFE_INTEGER;


    while (command != "Stop") {
        let number = Number(command);
        if (number < minNum) {
            minNum = number;
        }
        command = input[i];
        i++;
    }
        console.log(minNum);
}
minNum(["100",
"99",
"80",
"70",
"Stop"]);