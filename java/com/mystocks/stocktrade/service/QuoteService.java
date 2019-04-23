
public class QuoteService{

	@Autowired
	StockRepository stockRepository;	

	Quote tempQuote;

	public Quote estimateQuote(int stockId,int stockVolume){
		Stock estimateStock = stockRepository.findStockById(stockId);
		Quote estimateQuote = new Quote(estimateStock,stockVolume);
		saveTempQuote(estimateQuote);
	}


	public void  saveTempQuote(Quote tempQuote){
		this.tempQuote = tempQuote; 
	}

	public void retreiveTempQuote(){
		return tempQuote;
	}
}
