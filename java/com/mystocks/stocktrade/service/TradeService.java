
@Service
public class TradeService{

	@Autowired
	TradeRepository tradeRepository;


	// bro work on diff object for solution or adapat new method for this method 
	public Trade  estimatePurchse(Stock stock,int stockVolue){
		Trade currentTrade = new Trade(stock,stockVolume);
		return currentTrade;
	}

	public void purchaseStock(Stock stock,int stockVolume,Long userId){
		Trade currentTrade = new Trade(stock,stockVolume);
		currentTrade.setCoustmerId(userId)
		currentTrade.setTradeDate(LocalDate.now());
		tradeRepository.save(currentTrade);
	}

	public void purchaseStock(Quote currentQuote,int userId){

		Trade currentTrade = new Trade();
		
		currentTrade.setTradeVolume(currentQuote.getQuoteVolume());
		currentTrade.setStockVolumePrice(currentQuote.getStockVolumePrice());
		currentTrade.setBrockeragePrice(currentQuote.getBrockeragePrice());
		currentTrade.setTotalStockPrice(currentQuote.getTotalStockPrice());
		currentTrade.setCoustmerId(userId)
		currentTrade.setTradeDate(LocalDate.now());
		tradeRepository.save(currentTrade);
	}

	public void getAllTranscations(int userId){
		tradeRepository.findAllById(userId);
	}

}
