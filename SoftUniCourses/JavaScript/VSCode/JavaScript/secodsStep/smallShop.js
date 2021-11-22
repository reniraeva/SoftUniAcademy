function smallShop(input) {
    
    let product = input[0];
    let city = input[1];
    let quantity = Number(input[2]);

    switch (product) {
        case "coffee":
            if (city === "Varna") {
                console.log(quantity * 0.45);              
            }else if (city ==="Plovdiv") {
                console.log(quantity * 0.40);
            }else if (city === "Sofia") {
                console.log(quantity * 0.50);
            }
            break;
        case "water":
            if (city === "Varna" || city ==="Plovdiv") {
                console.log((quantity * 0.70));          
            }else if (city === "Sofia") {
                console.log(quantity * 0.80);  
            }
            break;
         case "beer":
            if (city === "Varna") {
                console.log(quantity * 1.10);              
            }else if (city ==="Plovdiv") {
                console.log(quantity * 1.15);  
            }else if (city === "Sofia") {
                console.log(quantity * 1.20);  
            }
         break;
        case "sweets":
            if (city === "Varna") {
                console.log(quantity * 1.35);              
            }else if (city ==="Plovdiv") {
                console.log(quantity * 1.30);  
            }else if (city === "Sofia") {
                console.log(quantity * 1.45);  
            }
            break;
        case "peanuts":
                if (city === "Varna") {
                    console.log(quantity * 1.55);            
                }else if (city ==="Plovdiv") {
                    console.log(quantity * 1.50);  
                }else if (city === "Sofia") {
                    console.log(quantity * 1.60);  
                }
            break;
    }
}
smallShop(["water","Plovdiv","3"]);