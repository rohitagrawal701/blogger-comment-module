package com.blogger.comment.response;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.ApplicationContext;

import com.blogger.comment.configuration.listener.ApplicationContextListener;
import com.blogger.comment.constant.CommentConstants;
import com.blogger.comment.util.AppProperties;
import com.blogger.comment.util.AppUtil;
import com.blogger.comment.util.ResourceBundleUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class is used to save and send response in terms of "status"
 *
 * @author Rohit
 */
public class RESTResponse {

    @JsonProperty("data")
    private Object data;

    @JsonProperty("status")
    private Status status;

    // @JsonProperty("X-Auth-Token")
    // private String authToken;

    /**
     * private default constructor
     */
    private RESTResponse() {

    }

    /**
     * This constructor is used to set the data and status property of the rest
     * response.
     *
     * @param data the object data to set
     * @param status the status object to set
     */
    private RESTResponse(final Object data, final Status status) {
        this.data = data;
        this.status = status;
    }

    /**
     * This constructor is used to set the data and status and authToken
     * property of the rest response.
     *
     * @param data the object data to set
     * @param status the status object to set
     * @param authToken the authToken string to set
     */
    private RESTResponse(final Object data, final Status status,
            final String authToken) {
        this.data = data;
        this.status = status;
        // this.authToken = authToken;
    }

    /**
     * This constructor is used to set the status property of the rest response.
     *
     * @param status the status object to set
     */
    private RESTResponse(final Status status) {
        this.status = status;
        data = Collections.emptyList();
    }

    /**
     * This method is used to get existing value for status object
     *
     * @return staus, existing value of status object
     */
    public Status getStatus() {
        return status;
    }

    /**
     * This method sets new value to the status object
     *
     * @param status the value to be set to status object
     */
    public void setStatus(final Status status) {
        this.status = status;
    }

    /**
     * @return the data object
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data object to set
     */
    public void setData(final Object data) {
        this.data = data;
    }

    /**
     * @param data the data object to set
     * @return a rest response to be set
     */
    public RESTResponse addData(final Object data) {
        this.data = data;
        return this;
    }

    /**
     * @param data the data object to set
     * @param code the code string to set
     * @param description the description object to set
     * @return a rest response to be set
     */
    public static RESTResponse ok(final Object data, final String code,
            final String description) {
        return new RESTResponse(data, status(code, description));
    }

    /**
     * @param data the data object to set
     * @param infoMsg the infoMsg string to set
     * @return a rest response to be set
     */
    public static RESTResponse ok(final Object data, final String infoMsg) {
        return new RESTResponse(data,
                status(CommentConstants.SUCCESS_CODE, getInfoMessage(infoMsg)));
    }

    /**
     * @param code the code string to set
     * @param description the description string to set
     * @return a rest response to be set
     */
    public static RESTResponse ok(final String code, final String description) {
        return new RESTResponse(status(code, description));
    }

    /**
     * @param code the code string to set
     * @param description the description string to set
     * @param devMessage the devMessage string to set
     * @param type the type string to set
     * @return a rest response to be set
     */
    public static RESTResponse ok(final String code, final String description,
            final String devMessage, final String type) {
        return new RESTResponse(status(code, description, devMessage, type));
    }

    /**
     * @param data the data object to set
     * @return a rest response to be set
     */
    public static RESTResponse ok(final Object data) {
        if (data instanceof Collection<?>
                && AppUtil.isEmpty((Collection<?>) data)) {
            return new RESTResponse(status(CommentConstants.SUCCESS_CODE,
                    getInfoMessage(CommentConstants.RECORDS_NOT_FOUND)));
        } else {
            if (AppUtil.isEmpty(data)) {
                return new RESTResponse(status(CommentConstants.SUCCESS_CODE,
                        getInfoMessage(CommentConstants.RECORDS_NOT_FOUND)));
            }
        }
        return new RESTResponse(data, status(CommentConstants.SUCCESS_CODE,
                getInfoMessage(CommentConstants.SUCCESS)));
    }

    /**
     * @return a rest response to be set
     */
    public static RESTResponse ok() {
        return new RESTResponse(status(CommentConstants.SUCCESS_CODE,
                getInfoMessage(CommentConstants.SUCCESS)));
    }

    /**
     * @param code the code string to set
     * @param description the description string to set
     * @return a status object to be set
     */
    private static Status status(final String code, final String description) {
        return new Status(code, description);
    }

    /**
     * @param code the code string to set
     * @param description the description string to set
     * @param devMessage the devMessage string to set
     * @param type the type string to set
     * @return a status object to be set
     */
    private static Status status(final String code, final String description,
            final String devMessage, final String type) {
        return new Status(code, description, devMessage, type);
    }

    // /**
    // *
    // * @return the authToken
    // */
    // public String getAuthToken() {
    // return authToken;
    // }
    //
    // /**
    // *
    // * @param authToken
    // * the authToken to set
    // */
    // public void setAuthToken(final String authToken) {
    // this.authToken = authToken;
    // }

    /**
     * @param authToken the authToken to set
     * @return a rest response to be set
     */
    public RESTResponse addAuthToken(final String authToken) {
        // this.authToken = authToken;
        return this;
    }

    /**
     * @param infoMsg the infoMsg to set
     * @return a localized string
     */
    private static String getInfoMessage(final String infoMsg) {
        final ApplicationContext appCtx =
                ApplicationContextListener.getApplicationContext();
        final AppProperties appProperties =
                (AppProperties) appCtx.getBean("appProperties");
        return ResourceBundleUtil.getLocalizedMessage(
                "com/blogger/module/comment/messages/info/info", infoMsg,
                appProperties.getLocale());
    }
}
