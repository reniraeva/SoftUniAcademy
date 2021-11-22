function titles(input) {
    
 let age = Number(input[0]);
 let gendar = input[1];
  
 switch (gendar) {
     case "m":
         if (age >= 16) {
             console.log("Mr.");
         }else{
              console.log("Master");
         }
         break;
     case "f":
        if (age >= 16) {
            console.log("Ms.");
        }else{
             console.log("Miss");
        }
         break;
  }

}
titles(["12","f"]);
