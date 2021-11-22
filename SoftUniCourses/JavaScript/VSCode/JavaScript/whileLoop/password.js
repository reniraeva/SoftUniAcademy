function password(input) {
    let i = 0;
    let user = input[i];
    i++;
    let password = input[i];
    i++;
    let currentPassword = input[i];
    i++;

    while (currentPassword !== password) {
        currentPassword++;
    }
    console.log(`Welcome ${user}`);
}
password(["Gosho",
    "secret",
    "secret"]);