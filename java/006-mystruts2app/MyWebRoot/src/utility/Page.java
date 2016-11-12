package utility;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class Page{
    public Page(){}

    public static String getPage(
    	HttpServletRequest request, String appendstring, int start, int range, long count){
        String path = request.getContextPath() + "/";
        String jsppagename = path + "goto.jsp";
        return getPage(jsppagename, appendstring, start, range, count);
    }

    public static String getPageExt(
    	HttpServletRequest request, String appendstring, int start, int range, long count){
        String path = request.getRequestURI();
        String jsppagename = path.substring(path.lastIndexOf("/") + 1, path.length());
        String url = getParameter(request);
        if(appendstring != null && appendstring.trim().length() > 0)
            url = appendstring.trim() + "&" + url;
        return getPage(jsppagename, url, start, range, count);
    }

    @SuppressWarnings("unchecked")
	private static String getParameter(HttpServletRequest httpServletRequest){
        StringBuffer buf = new StringBuffer();
        Map pMap = httpServletRequest.getParameterMap();
        int idx = 0;
        for(Iterator<String> iter = pMap.keySet().iterator(); iter.hasNext();){
            String item = iter.next();
            if(!item.equals("start") && !item.equals("range")){
                String values[] = httpServletRequest.getParameterValues(item);
                for(int i = 0; i < values.length; i++){
                    if(idx > 0) buf.append("&");
                    buf.append(item);
                    buf.append("=");
                    buf.append(values[i]);
                    idx++;
                }
            }
        }
        return buf.toString();
    }

    private static String getPage(
    	String jsppagename, String appendstring, int start, int range, long count){
        long numPages = count / range + (count % range + (range - 1)) / range;
        if(count == 0) return "";
        if(numPages == 1) return "";
        StringBuffer buf = new StringBuffer();
        buf.append("   ");
        buf.append(count + " [&nbsp;");
        if(start > 0){
            buf.append("<a href=\"" + jsppagename + "?");
            buf.append("start=");
            buf.append(start - range);
            buf.append("&");
            buf.append("range=");
            buf.append(range);
            buf.append("&");
            buf.append(appendstring);
            buf.append("\"");
            buf.append(">");
            buf.append("<<");
            buf.append("</a>&nbsp;&nbsp;&nbsp;");
        }
        int currentPage = start / range + 1;
        int lo = currentPage - 5;
        if(lo <= 0) lo = 1;
        int hi = currentPage + 5;
        if(lo > 2){
            buf.append("<a href=\"" + jsppagename + "?");
            buf.append("start=0");
	    buf.append("&");
            buf.append(appendstring);
            buf.append("&");
            buf.append("\"");
            buf.append(">");
            buf.append("1");
            buf.append("</a>&nbsp;");
            buf.append("... ");
        }
        for(; lo < currentPage; lo++){
            buf.append("<a href=\"" + jsppagename + "?");
            buf.append("start=");
            buf.append((lo - 1) * range);
            buf.append("&");
            buf.append("range=");
            buf.append(range);
            buf.append("&");
            buf.append(appendstring);
            buf.append("\"");
            buf.append(">");
            buf.append(lo);
            buf.append("</a>&nbsp;");
        }
        buf.append("<b>");
        buf.append(currentPage);
        buf.append("</b>&nbsp;");
        for(currentPage++; currentPage <= hi && currentPage <= numPages; currentPage++){
            buf.append("<a href=\"" + jsppagename + "?");
            buf.append("start=");
            buf.append((currentPage - 1) * range);
            buf.append("&");
            buf.append("range=");
            buf.append(range);
            buf.append("&");
            buf.append(appendstring);
            buf.append("\"");
            buf.append(">");
            buf.append(currentPage);
            buf.append("</a>&nbsp;");
        }
        if(count > start + range){
            buf.append("&nbsp;&nbsp;<a href=\"" + jsppagename + "?");
            buf.append("start=");
            buf.append(start + range);
            buf.append("&");
            buf.append("range=");
            buf.append(range);
            buf.append("&");
            buf.append(appendstring);
            buf.append("\"");
            buf.append(">");
            buf.append(">>");
            buf.append("</a>");
        }
        buf.append("&nbsp;]");
        return buf.toString();
    }
}