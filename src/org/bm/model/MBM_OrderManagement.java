/**

import java.sql.ResultSet;
import java.util.Properties;

public class MBM_OrderManagement extends X_BM_OrderManagement{

	private static final long serialVersionUID = -1L;

	public MBM_OrderManagement(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MBM_OrderManagement(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}