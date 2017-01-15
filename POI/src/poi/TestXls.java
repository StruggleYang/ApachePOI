package poi;

import java.util.ArrayList;
import java.util.List;

public class TestXls {
	public static void main(String[] args) throws Exception {
		List objList = new ArrayList();
		rankTab rt = new rankTab(1,"经理",4000);
		rankTab rt1 = new rankTab(2,"主管",5000);
		rankTab rt2 = new rankTab(3,"主任",6000);
		rankTab rt3 = new rankTab(4,"总裁",10000);
		objList.add(rt);
		objList.add(rt1);
		objList.add(rt2);
		objList.add(rt3);
		PoiWriteXls.xlsExport(objList);
	}

}
