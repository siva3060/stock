

public class TradeController{


	@Autowired
	StockService stockService;

	@Autowired
	TradeService tradeService;

	@Autowired
	QuoteService quoteService;


//StockPurchase Estimate
	@GetMapping("/getQuote")
	public Quote  quoteEstimate(int stockId ,int stockVolume){
		return quoteService.estimateQuote(stockId,stockVolume);
	}

//Purchase Stock
	public void purchaseStock(Quote currentQuote,Long userId){
		tradeService.purchaseStock(quoteService.reteriveQuote(),stockVolume);
	}

// Display List of all avalible stocks in the database 
	public @ResonseBody ReponseEntity<Stock> showStocks(){
		return new ResponseEntity(stockService.getAllStocks(),HttpStatus.ok);
	}

//Display Past Orders 
}
