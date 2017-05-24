package chat;

public class MsgBean
{
  private int msgid;
  private String content;
  private String ip;
  private String userId;

  public MsgBean()
  {
  }

  public MsgBean(int msgid, String content, String ip)
  {
    this.msgid = msgid;
    this.content = content;
    this.ip = ip;
  }

  public MsgBean(int msgid, String content, String ip, String userId) {
    this.msgid = msgid;
    this.content = content;
    this.ip = ip;
    this.userId = userId;
  }

  public int getMsgid() {
    return this.msgid;
  }

  public String getContent() {
    return this.content;
  }

  public void setMsgid(int msgid) {
    this.msgid = msgid;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}