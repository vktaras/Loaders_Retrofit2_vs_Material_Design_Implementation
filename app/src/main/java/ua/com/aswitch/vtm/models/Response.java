package ua.com.aswitch.vtm.models;

/**
 * Created by taras on 4/18/17.
 */

public class Response {
    private Object mAnswer;
    private RequestResult requestResult;

    public Response setAnswer(Object answer){
        this.mAnswer = answer;
        return this;
    }

    public Response setRequestResult(RequestResult requestResult){
        this.requestResult = requestResult;
        return this;
    }

    public <TypedAnswer>TypedAnswer getTypedAnswer(){
        if (mAnswer==null)
            return null;

        return (TypedAnswer)mAnswer;
    }

    public RequestResult getRequestResult(){
        return requestResult;
    }

}
