// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test/common.proto

package test;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code test.ErrorCode}
   */
  public enum ErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 未定义错误
     * </pre>
     *
     * <code>ERROR_UNDEFINED = 0;</code>
     */
    ERROR_UNDEFINED(0),
    /**
     * <pre>
     * 服务器错误
     * 这种情况是一些没有处理的到异常发生，或者一些 catch 到了，但是也不能做什么事情得异常(比如：数据库连接失败，网络闪断等等)
     * </pre>
     *
     * <code>ERROR_SERVER_ERROR = 1;</code>
     */
    ERROR_SERVER_ERROR(1),
    /**
     * <pre>
     * 系统维护中
     * 显式的系统维护, 这种错误客户端不应该自动重试，并且提示用户稍后重试
     * </pre>
     *
     * <code>ERROR_SYSTEM_MAINTENANCE = 2;</code>
     */
    ERROR_SYSTEM_MAINTENANCE(2),
    /**
     * <pre>
     * 通用参数错误
     * 这种参数错误一般是客户端异常，或者非法请求, 正常情况下(或者正常客户端)不应该出现
     * </pre>
     *
     * <code>ERROR_INVALID_ARGUMENT = 3;</code>
     */
    ERROR_INVALID_ARGUMENT(3),
    /**
     * <pre>
     * 资源不存在
     * </pre>
     *
     * <code>ERROR_NOT_FOUND = 4;</code>
     */
    ERROR_NOT_FOUND(4),
    /**
     * <pre>
     * 请求过于频繁
     * </pre>
     *
     * <code>ERROR_TOO_MANY_REQUESTS = 5;</code>
     */
    ERROR_TOO_MANY_REQUESTS(5),
    /**
     * <pre>
     * 无权限
     * </pre>
     *
     * <code>ERROR_PERMISSION_DENIED = 6;</code>
     */
    ERROR_PERMISSION_DENIED(6),
    /**
     * <pre>
     * 未认证
     * </pre>
     *
     * <code>ERROR_UNAUTHENTICATED = 7;</code>
     */
    ERROR_UNAUTHENTICATED(7),
    /**
     * <pre>
     * 禁止注册
     * </pre>
     *
     * <code>ERROR_FORBID_SIGNUP = 8;</code>
     */
    ERROR_FORBID_SIGNUP(8),
    /**
     * <pre>
     * 连接超时
     * </pre>
     *
     * <code>ERROR_TIME_OUT = 9;</code>
     */
    ERROR_TIME_OUT(9),
    /**
     * <pre>
     * 数据重复
     * </pre>
     *
     * <code>ERROR_DATA_REPEAT = 10;</code>
     */
    ERROR_DATA_REPEAT(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * 未定义错误
     * </pre>
     *
     * <code>ERROR_UNDEFINED = 0;</code>
     */
    public static final int ERROR_UNDEFINED_VALUE = 0;
    /**
     * <pre>
     * 服务器错误
     * 这种情况是一些没有处理的到异常发生，或者一些 catch 到了，但是也不能做什么事情得异常(比如：数据库连接失败，网络闪断等等)
     * </pre>
     *
     * <code>ERROR_SERVER_ERROR = 1;</code>
     */
    public static final int ERROR_SERVER_ERROR_VALUE = 1;
    /**
     * <pre>
     * 系统维护中
     * 显式的系统维护, 这种错误客户端不应该自动重试，并且提示用户稍后重试
     * </pre>
     *
     * <code>ERROR_SYSTEM_MAINTENANCE = 2;</code>
     */
    public static final int ERROR_SYSTEM_MAINTENANCE_VALUE = 2;
    /**
     * <pre>
     * 通用参数错误
     * 这种参数错误一般是客户端异常，或者非法请求, 正常情况下(或者正常客户端)不应该出现
     * </pre>
     *
     * <code>ERROR_INVALID_ARGUMENT = 3;</code>
     */
    public static final int ERROR_INVALID_ARGUMENT_VALUE = 3;
    /**
     * <pre>
     * 资源不存在
     * </pre>
     *
     * <code>ERROR_NOT_FOUND = 4;</code>
     */
    public static final int ERROR_NOT_FOUND_VALUE = 4;
    /**
     * <pre>
     * 请求过于频繁
     * </pre>
     *
     * <code>ERROR_TOO_MANY_REQUESTS = 5;</code>
     */
    public static final int ERROR_TOO_MANY_REQUESTS_VALUE = 5;
    /**
     * <pre>
     * 无权限
     * </pre>
     *
     * <code>ERROR_PERMISSION_DENIED = 6;</code>
     */
    public static final int ERROR_PERMISSION_DENIED_VALUE = 6;
    /**
     * <pre>
     * 未认证
     * </pre>
     *
     * <code>ERROR_UNAUTHENTICATED = 7;</code>
     */
    public static final int ERROR_UNAUTHENTICATED_VALUE = 7;
    /**
     * <pre>
     * 禁止注册
     * </pre>
     *
     * <code>ERROR_FORBID_SIGNUP = 8;</code>
     */
    public static final int ERROR_FORBID_SIGNUP_VALUE = 8;
    /**
     * <pre>
     * 连接超时
     * </pre>
     *
     * <code>ERROR_TIME_OUT = 9;</code>
     */
    public static final int ERROR_TIME_OUT_VALUE = 9;
    /**
     * <pre>
     * 数据重复
     * </pre>
     *
     * <code>ERROR_DATA_REPEAT = 10;</code>
     */
    public static final int ERROR_DATA_REPEAT_VALUE = 10;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorCode valueOf(int value) {
      return forNumber(value);
    }

    public static ErrorCode forNumber(int value) {
      switch (value) {
        case 0: return ERROR_UNDEFINED;
        case 1: return ERROR_SERVER_ERROR;
        case 2: return ERROR_SYSTEM_MAINTENANCE;
        case 3: return ERROR_INVALID_ARGUMENT;
        case 4: return ERROR_NOT_FOUND;
        case 5: return ERROR_TOO_MANY_REQUESTS;
        case 6: return ERROR_PERMISSION_DENIED;
        case 7: return ERROR_UNAUTHENTICATED;
        case 8: return ERROR_FORBID_SIGNUP;
        case 9: return ERROR_TIME_OUT;
        case 10: return ERROR_DATA_REPEAT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
            public ErrorCode findValueByNumber(int number) {
              return ErrorCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return test.Common.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorCode[] VALUES = values();

    public static ErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ErrorCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:test.ErrorCode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021test/common.proto\022\004test*\240\002\n\tErrorCode\022" +
      "\023\n\017ERROR_UNDEFINED\020\000\022\026\n\022ERROR_SERVER_ERR" +
      "OR\020\001\022\034\n\030ERROR_SYSTEM_MAINTENANCE\020\002\022\032\n\026ER" +
      "ROR_INVALID_ARGUMENT\020\003\022\023\n\017ERROR_NOT_FOUN" +
      "D\020\004\022\033\n\027ERROR_TOO_MANY_REQUESTS\020\005\022\033\n\027ERRO" +
      "R_PERMISSION_DENIED\020\006\022\031\n\025ERROR_UNAUTHENT" +
      "ICATED\020\007\022\027\n\023ERROR_FORBID_SIGNUP\020\010\022\022\n\016ERR" +
      "OR_TIME_OUT\020\t\022\025\n\021ERROR_DATA_REPEAT\020\nb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
