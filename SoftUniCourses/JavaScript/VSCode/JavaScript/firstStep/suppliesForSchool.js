function suppliesForShool(input){
    let packagesOfPens = Number(input[0]);
    let packagesOfMarkers = Number(input[1]);
    let cleanerLiters = Number(input[2]);
    let precentagerRediction = Number(input[3]);
    
    let pricePacegePens = 5.80;
    let pricePacegeMarkers = 7.20;
    let priceCleanrLiter = 1.20; 
    
    let sum = (packagesOfPens*pricePacegePens)+(packagesOfMarkers*pricePacegeMarkers)+(cleanerLiters*priceCleanrLiter);
    let totalSum = sum-(sum *(precentagerRediction/100));

    console.log(totalSum);
}
suppliesForShool(["2","3","4","25"]);
