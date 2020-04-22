package constant;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {
    SCEKILL_ERROR(101,"换个姿势试一试"),
    SUCCESS(200, "成功"),
    SUCCESS_ADD(201, "添加成功"),
    UNKNOWN_ERROR(400, "未知错误"),
    PARAM_ERROR(500, "参数错误"),
    ERROR_SQL(501, "SQL错误"),
    NULL_POINT(500, "空指针异常"),
    LOGIN_ACCOUNT(201, "帐号不存在"),
    LOGIN_PASSWORD(202, "密码错误"),
    CODE_NULL(203,"登陆凭证为空"),
    EMPTY_PRODUCT(204,"库存不足"),
    EMPTY_ORDER(205,"不存在订单"),
    LATE_TOKEN(401,"token过期"),
    ERROR_TOKEN(402,"token错误"),
    EMPTY_TOKEN(403,"token未传输")
    ;
    private Integer code;
    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
