package janky.service;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Service;

@Service
public class cpuService {

	public String getcpu() {


		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.execfile("getdata1.py");
		PyObject str=interpreter.eval("repr(GetData().getcpucores())");

		String n=str.toString().substring(1,str.toString().length()-1);

		System.out.println(n.toString());

		return n;
	}

}
