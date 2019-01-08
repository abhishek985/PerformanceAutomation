package janky.service;

import org.json.JSONObject;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;

@Service
public class memService {

	public String getmem(String pname) {


		System.out.println(pname);
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.execfile("getdata1.py");
		PyObject str=interpreter.eval("repr(GetData().getmeminfo('"+pname+"'))");

		System.out.println(str);
		String n=str.toString().substring(1,str.toString().length()-1);

		//System.out.println(n.toString());

		JSONObject jsonObj = new JSONObject(n);
	    jsonObj.get("Native_Heap_Free");
		jsonObj.get("Native_Heap_Alloc");
		jsonObj.get("Native_Pss");
		jsonObj.get("Total_Pss");
		jsonObj.get("Total_Heap_Alloc");
		jsonObj.get("Total_Heap_Free");
		
		
		return n;
	}

}
