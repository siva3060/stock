
public class UserController{

	@Autowired
	TradeService tradeService;


	@GetMapping("/getTradeHistory")
	public @ResponseBody List<Trade> showPastOrder(@PathVariable int userId){
		return tradeRepository.getAllTranscations(userId);
	}


	@RequestMapping("/purchaseAgain")
	public 

}
