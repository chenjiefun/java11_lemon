package day06;

import java.util.Map;

public class Result {
    private String status;
    private String message;
    private Map<String,String> data;

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

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

    public String toString(){
        System.out.println("Result.toString");
        /**
         * 字符串拼接，一个是拼接输出的内容  "" , 另一个是变量
         * 输出了格式是自己定义的
         */
       return "status: "+status+", message: "+message;
    }


}
