package object;

import java.util.ArrayList;

import object.pro.*;

public class ProcessManager {
	ArrayList<Process> process = new ArrayList<>();
	
	public ArrayList<Process> getProcess() {
		return process;
	}
	public void setProcess(ArrayList<Process> process) {
		this.process = process;
	}
	public ProcessManager() {
		add(new XemThongTin());
		add(new NhapStudent());
		add(new NhapTeacher());
		add(new SapXepPerson());
		add(new TimKiemVaIn());
		add(new InThongTin());
		add(new XoaThongTinID());
		add(new SuaThongTinID());
		add(new XoaTatCa());
	}
	public void add(Process p) {
		process.add(p);
	}
}
