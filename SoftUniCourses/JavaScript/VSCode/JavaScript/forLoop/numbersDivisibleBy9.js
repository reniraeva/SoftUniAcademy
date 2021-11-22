function numbers(input) {

    let furstNumber = Number(input[0]);
    let secondNumber = Number(input[1]);
    let sum = 0;
    let output = "";

    for (let i = furstNumber; i <= secondNumber; i++) {
        if (i % 9 === 0) {
            sum = sum+i;
            output = (output + i)+ "\n";
        }

    }

    console.log(`The sum: ${sum}`);
    console.log(output);
}
numbers(["100", "200"]); 