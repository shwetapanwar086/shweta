
@Controller
public class SupplierController {
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping(value="SupplierAddition"), method=RequestMethod.GET
	public String addSupplier(@RequestParam("suppid") int suppid, 
	@RequestParam("suppname") String suppname, @RequestParam("suppdesc") String suppdesc)
	{
		System.out.println("SupplierID: "+suppid);
		System.out.println("SupplierName: "+suppname);
		System.out.println("SupplierDesc: "+suppdesc);
		
		Supplier supplier=new Supplier();
		supplier.setSuppid(suppid);
		supplier.setSuppname(suppname);
		supplier.setSuppdesc(suppdesc);
		
		supplierDAO.insertSupplier(supplier);
		
		return "Supplier";
	}
	@RequestMapping("Supplier")
	public String showSupplierPage()
	{
		return "Supplier";
}
