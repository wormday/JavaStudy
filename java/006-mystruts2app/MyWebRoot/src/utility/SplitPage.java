package utility;

public class SplitPage {
	/**得到分页的sql
	 * @param sql
	 * @param start
	 * @return
	 * @throws Exception
	 */
	public static String getSqlPage(String sql,Integer start,Integer range) throws Exception{
	    return sql + " limit " + start.toString() + "," + range.toString();
	}
}