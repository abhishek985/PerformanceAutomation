package janky.service;
import java.util.ArrayList;
import java.util.List;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;
@Service
public class jankyService {


	List<Integer>jn= new ArrayList<Integer>();
	public Object[] getframes()
	{
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.execfile("getdata1.py");
		PyObject str=interpreter.eval("repr(GetData().getJenkyFrames())");
		String n=str.toString();
		jn.add(Integer.parseInt(n));
		
		
	// ---------	
		if(jn.size()<2)
			//return jn.get(jn.size()-1);
			return new Object[] {jn.get(jn.size()-1)};
		//System.out.println(jn.get(jn.size()));		
	//	---------
		
		else if(jn.size()>=2) {
			int last =jn.get(jn.size()-1);
			int seclast=jn.get(jn.size()-2);
			Integer diff= last-seclast;

			System.out.println(diff);
			String s;

			//PyObject s1=interpreter.eval("repr(GetData().getframestats('tv.airtel.smartstick'))");
			//System.out.println(s1.toString());
			
			if(diff>20)
			{
				PyObject st=interpreter.eval("repr(GetData().getcurrentevent())");
				s=st.toString();
				//String s1[]= {s,diff.toString()}
				//return s1;
				return new Object[] {diff,s};
			}
			return new Object[] {diff};
			//return diff;
		}
		return null;

	}
}