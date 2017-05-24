package chat;


import java.io.UnsupportedEncodingException;
import java.util.Vector;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class ChatMgr
{
  private static Vector<MsgBean> msgList;
  private HttpServletRequest request;
  private ServletContext servletContext;

  @SuppressWarnings("unchecked")
public void setServletContext(ServletContext servletContext)
  {
    this.servletContext = servletContext;
    synchronized (servletContext) {
      if (servletContext.getAttribute("msgList") == null) {
        msgList = new Vector<MsgBean>();
        MsgBean mb = new MsgBean(1, "채팅이 시작되었습니다", "Admin");
        msgList.add(mb);
        servletContext.setAttribute("msgList", msgList);
      }
    }
    msgList = (Vector<MsgBean>)servletContext.getAttribute("msgList");
  }

  public String getResMsg() {
    String msg = this.request.getParameter("msg");
    String jarrStr = null;
    if ((msg != null) && (!msg.equals(""))) {
      long userLast = addMsg(msg);
      if (userLast >= 0L)
        try {
          jarrStr = getMsgAfterLast(msg); } catch (Exception e) {
          e.printStackTrace();
        }
    }
    return jarrStr;
  }

  public long addMsg(String msg)
  {
    if ((msg == null) || (msg.equals(""))) return -1L;

    JSONObject jobj = (JSONObject)JSONValue.parse(msg);
    long userLast = ((Long)jobj.get("msgid")).longValue();
    String content = (String)jobj.get("content");

    if ((content == null) || (content.equals(""))) return userLast;
    String ip = this.request.getRemoteAddr();

    synchronized (this.servletContext) {
      while (msgList.size() >= 100) {
        msgList.remove(0);
      }
    }
    HttpSession session = this.request.getSession();
    String userId = (String)session.getAttribute("userId");
    if (userId == null) userId = ip;

    synchronized (this.servletContext) {
      int msgid = msgList.get(msgList.size() - 1).getMsgid() + 1;
      msgList.add(new MsgBean(msgid, content, ip, userId));
    }
    return userLast;
  }

  public String getMsgAfterLast(String msg)
  {
    if (msgList.size() == 0) return null;
    JSONObject usrObj = (JSONObject)JSONValue.parse(msg);
    long userLast = ((Long)usrObj.get("msgid")).longValue();

    if (userLast == 0L) {
      JSONArray jarr = new JSONArray();
      JSONObject jobj = new JSONObject();

      jobj.put("msgid", Integer.valueOf(msgList.get(msgList.size() - 1).getMsgid()));

      jarr.add(jobj);
      return jarr.toJSONString();
    }
    String jsonStr = "";
    JSONArray jarr = new JSONArray();
    long i = 0L;

    for (i = msgId2Index(userLast) + 1; i < msgList.size(); i += 1L) {
      MsgBean mb = msgList.get((int)i);
      JSONObject jobj = new JSONObject();
      jobj.put("msgid", Integer.valueOf(mb.getMsgid()));
      jobj.put("content", mb.getContent());
      jobj.put("userId", mb.getUserId());
      jarr.add(jobj);
    }
    if (jarr.size() == 0) return null;
    return jarr.toJSONString();
  }

  private int msgId2Index(long msgid) {
    int topId = msgList.get(0).getMsgid();
    int dif = (int)(msgid - topId);
    return dif;
  }

  public void setRequest(HttpServletRequest request) {
    try {
      request.setCharacterEncoding("utf-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    this.request = request;
  }

  public Vector<MsgBean> getMsgList() {
    return msgList;
  }
}