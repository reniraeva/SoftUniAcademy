function oldbooks(input) {
    let favourite = input[0];
    let i = 1;
    let isFoundBook = false;
    let nameBooksNext = input[i];
     while (nameBooksNext !== "No More Books") {
         if (nameBooksNext === favourite) {
           isFoundBook = true;
            break;
         }
         i++;
         nameBooksNext = input[i];
     }
     if (isFoundBook === false) {
         console.log("The book you search is not here!");
         console.log(`You checked ${i-1} books.`);
     }else{
         console.log(`You checked ${i-1} books and found it.`);
     }
 }

oldbooks(["Troy","Stronger",
"Life Style","Troy"]); 