package xyz.yyfeng.po;

import java.sql.Timestamp;

public class Message {
    private String name;
    private String Stuid;
    private String fromid;
    private String userlogo;
    private Timestamp Datetime;
    private String content;
    private String speciality;


    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid;
    }
    public Message() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuid() {
        return Stuid;
    }

    public void setStuid(String stuid) {
        Stuid = stuid;
    }

    public String getUserlogo() {
        return userlogo;
    }

    public void setUserlogo(String userlogo) {
        this.userlogo = userlogo;
    }

    public Timestamp getDatetime() {
        return Datetime;
    }

    public void setDatetime(Timestamp datetime) {
        Datetime = datetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
