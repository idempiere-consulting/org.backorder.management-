/**



	public class GenerateSalesOrder extends SvrProcess {
		int cnt = 0;

		ProcessInfoParameter[] para = getParameter();
			for (ProcessInfoParameter p:para) {
				String name = p.getParameterName();
				if (p.getParameter() == null)
				else if(name.equals("DocStatus")){
					DocStatus = (String)p.getParameter();
			}
		}
	}

		if (getRecord_ID()<1)

}