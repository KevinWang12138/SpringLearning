package hello.po.vo;

public class MessageModel {
    private Integer code;//状态码 1成功 2失败
    private String msg;//提示信息

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
