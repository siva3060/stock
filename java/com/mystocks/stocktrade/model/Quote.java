

@Data
public class Quote{
	
	private Stock stock;
	private int stockVolume;
	private double stockVolumePrice;
	private double brockeragePrice;
	private double totalStockPrice;	
	
	public Quote(currentStock,quoteVolume){
		this.stock = currentStock;
		this.stockVolume = quoteVolume;
		this.stockVolumePrice = calculateStockVolumePrice(tradeVolume);
		this.brockeragePrice = calculateBrokeragePrice(tradeVolume);
		this.totalStockPrice = calculateTotalStockPrice();
	}

	public double calculateTotalStockPrice(){
		return this.stockVolumePrice + this.brokeragePrice;
	}


	// do i need to use this key word when referencing if yes why if no why ??
	public double calculateStockVolumePrice(int stockVolume){
		double stockPrice = stock.getStockPrice() * stockVolume;
		return stockPrice;
	}

	public double calculateBrokeragePrice(int stockVolume){

		if(stockVolume < 500){
			return percentageCalculator(0.10,stockVolume * stock.stockPrice); 
		}else{
			int stockBlock = stockVolume / 100;
			return (stockBlock * (percentageCalculator(0.15,stock .stockPrice* 100)));
		}
	}

	public double percentageCalculator(double percentage,int totalPrice){
		 return ((totalPrice * percentage)/100)
	}



}
