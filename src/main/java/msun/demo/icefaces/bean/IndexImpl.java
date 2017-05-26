package msun.demo.icefaces.bean;

import org.springframework.stereotype.Service;

/**
 * index implementor
 *
 */
@Service
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