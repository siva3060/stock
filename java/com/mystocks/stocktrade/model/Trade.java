

@Data
@Entity
public class Trade{

	@Id
	@GeneratedValue(stratedy = Generation.Auto)
	private Long tradeId;
	private Long userId;
	private Stock tradeStock;
	private int tradeVolume;
	private double stockVolumePrice;
	private double brokeragePrice;
	private double totalStockPrice;


	public Trade(tradeStock,tradeVolume){
		this.stockVolumePrice = calculateStockVolumePrice(tradeVolume);
		this.brockeragePrice = calculateBrokeragePrice(tradeVolume);
		this.totalStockPrice = calculateTotalStockPrice();
	}

	public double calculateTotalStockPrice(){
		return this.stockVolumePrice + this.brokeragePrice;
	}

	public double calculateStockVolumePrice(int stockVolume){
		double stockPrice = this.tradeStock.getStockPrice() * stockVolume;
		return stockPrice;
	}

	public double calculateBrokeragePrice(int stockVolume){

		if(stockVolume < 500){
			return percentageCalculator(0.10,stockVolume*this.stockPrice); 
		}else{
			int stockBlock = stockVolume / 100;
			return (stockBlock * (percentageCalculator(0.15,this.stockPrice* 100)));
		}
	}

	public double percentageCalculator(double percentage,int totalPrice){
		 return ((totalPrice * percentage)/100)

	}

}
