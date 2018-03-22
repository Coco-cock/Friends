package xyz.yyfeng.po;

public class User {
    private int id;
    private String name;
    private String passwd;
    private String Stuid;
    private String classId;
    private String Phtoto;
    private String qq;
    private String wechat;
    private String like;
    private String Email;
    private String signature;
    private String userlogo;

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }


    public String getStuid() {
        return Stuid;
    }

    public void setStuid(String stuid) {
        Stuid = stuid;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getPhtoto() {
        return Phtoto;
    }

    public void setPhtoto(String phtoto) {
        Phtoto = phtoto;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getUserlogo() {
        return userlogo;
    }

    public void setUserlogo(String userlogo) {
        this.userlogo = userlogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "ID:"+id+">>> name:"+name+">>> passs:"+passwd;
    }
}
