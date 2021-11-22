function cake(input) {

    let length = Number(input[0]);
    let width = Number(input[1]);

    let sizeCake = length * width;

    let i = 2;
    let command = input[i];
    let piecesNum = 0;

    while (command !== "STOP") {
        let partsCake = Number(command);
        piecesNum = piecesNum + partsCake;

        if (piecesNum > sizeCake) {
            console.log(`No more cake left! You need ${piecesNum - sizeCake} pieces more.`);
            break;
        }
        i++;
        command = input[i];
    }
    if (command === "STOP") {
        if (piecesNum <= sizeCake) {
            console.log(`${sizeCake - piecesNum} pieces are left.`);

        }
    }
}
cake(["10", "10", "20", "20", "20", "20", "21"]);