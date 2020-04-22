package vo;

import constant.ResultCodeEnum;
import lombok.Data;

@Data
public class R<T> {
    //响应状态码
    private Integer status;

    //响应消息
    private String msg;

    //响应具体内容
    private T data;

    //构造器私有化
    private R() {}

    //设置结果
    public static R setResult(ResultCodeEnum resultCodeEnum) {
        R resultVO = new R();
        resultVO.setStatus(resultCodeEnum.getCode());
        resultVO.setMsg(resultCodeEnum.getMessage());
        return resultVO;
    }

    public R data(T data) {
        this.setData(data);
        return this;
    }
}
