function maxNumber(input) {
    
    let command = input[0];
    let i = 1;
    let maxNum = Number.MIN_SAFE_INTEGER;


    while (command != "Stop") {
        let number = Number(command);
        if (number > maxNum) {
            maxNum = number;
        }
        command = input[i];
        i++;

    }
        console.log(maxNum);
}

maxNumber(["10",,
"20","-30","Stop"]);