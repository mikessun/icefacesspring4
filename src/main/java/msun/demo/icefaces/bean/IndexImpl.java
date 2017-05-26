package msun.demo.icefaces.bean;


/**
 * index implementor
 *
 */
public class IndexImpl implements Index{
	private String msg; 
	
	public String getMessage() {		
		return msg;
	}

	@Override
	public void setMessage(String msg) {
		this.msg = msg;		
	}
	
 
}