package com.janky;
import java.util.ArrayList;
import java.util.List;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;

@Service
public class jankyService {


	List<Integer>jn= new ArrayList<Integer>();
	public Integer getframes()
	{
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.execfile("getdata1.py");
		PyObject str=interpreter.eval("repr(GetData().getJenkyFrames())");
		String n=str.toString();


		jn.add(Integer.parseInt(n));

		return jn.get(jn.size()-1);
	}
}
