
@Service
public class StockService{

	@Autowired
	StockRepository stockRepository;
	public 

	public List<Stock> getAllStocks(){
		return stockRepository.findAll();
	}
}
