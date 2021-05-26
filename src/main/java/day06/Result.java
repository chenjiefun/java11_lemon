package day06;

public class Result {
    private String status;
    private String message;

    /**
     * 右击点击generate，选择 getter,setter, 按住shift进行多选
     * 字段名跟json里面的数据保持一致
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(){
    super();
    }
}
