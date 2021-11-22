function read(input) {
    let i = 0;
    let command = input[i];
    i++;
    while (command !== "Stop") {
        console.log(command);
        command = input[i];
        i++;
    }
}
read(["Nakov", "SoftUni",
    "Sofia", "Bulgaria",
    "SomeText", "Stop",
    "AfterStop", "Europe",
    "HelloWorld"]);
