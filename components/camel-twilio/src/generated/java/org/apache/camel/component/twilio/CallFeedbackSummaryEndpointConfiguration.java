
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.call.FeedbackSummary}.
 */
@ApiParams(apiName = "call-feedback-summary", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", signatures={"com.twilio.rest.api.v2010.account.call.FeedbackSummaryCreator creator(java.time.LocalDate startDate, java.time.LocalDate endDate)", "com.twilio.rest.api.v2010.account.call.FeedbackSummaryCreator creator(String pathAccountSid, java.time.LocalDate startDate, java.time.LocalDate endDate)"}), @ApiMethod(methodName = "deleter", signatures={"com.twilio.rest.api.v2010.account.call.FeedbackSummaryDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.call.FeedbackSummaryDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", signatures={"com.twilio.rest.api.v2010.account.call.FeedbackSummaryFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.call.FeedbackSummaryFetcher fetcher(String pathAccountSid, String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class CallFeedbackSummaryEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private java.time.LocalDate endDate;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator"), @ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher")})
    private String pathSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private java.time.LocalDate startDate;

    public java.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public java.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.LocalDate startDate) {
        this.startDate = startDate;
    }
}
