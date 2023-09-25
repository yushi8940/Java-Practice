package jp.hachi.sample;

public class Result {

    private String exceptionType;
    
    public Result() {};

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    @Override
    public String toString() {
        return "Result [exceptionType=" + exceptionType + "]";
    };
    
}
