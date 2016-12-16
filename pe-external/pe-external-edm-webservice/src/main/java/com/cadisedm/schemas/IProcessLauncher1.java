
package com.cadisedm.schemas;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.datacontract.schemas._2004._07.cadis.CADISComponentsComponentKey;
import org.datacontract.schemas._2004._07.cadis.EMessagePriority;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;




/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IProcessLauncher_1", targetNamespace = "http://www.cadisedm.com/Schemas/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.cadis_webservice.ObjectFactory.class,
    com.cadisedm.schemas.ObjectFactory.class,
    org.datacontract.schemas._2004._07.cadis.ObjectFactory.class
})
public interface IProcessLauncher1 {


    /**
     * 
     * @param authenticationParameters
     * @param connectResult
     * @param errorDetails
     */
    @WebMethod(operationName = "Connect", action = "http://www.cadisedm.com/Schemas/IProcessLauncher_1/Connect")
    @RequestWrapper(localName = "Connect", targetNamespace = "http://www.cadisedm.com/Schemas/", className = "com.cadisedm.schemas.Connect")
    @ResponseWrapper(localName = "ConnectResponse", targetNamespace = "http://www.cadisedm.com/Schemas/", className = "com.cadisedm.schemas.ConnectResponse")
    public void connect(
        @WebParam(name = "authenticationParameters", targetNamespace = "http://www.cadisedm.com/Schemas/")
        String authenticationParameters,
        @WebParam(name = "ConnectResult", targetNamespace = "http://www.cadisedm.com/Schemas/", mode = WebParam.Mode.OUT)
        Holder<String> connectResult,
        @WebParam(name = "errorDetails", targetNamespace = "http://www.cadisedm.com/Schemas/", mode = WebParam.Mode.OUT)
        Holder<Error> errorDetails);

    /**
     * 
     * @param processName
     * @param messagePriority
     * @param connectionToken
     * @param processType
     * @param processLaunchQueueParameterName
     * @return
     *     returns com.cadisedm.schemas.Error
     */
    @WebMethod(operationName = "SendProcessLaunchMessage", action = "http://www.cadisedm.com/Schemas/IProcessLauncher_1/SendProcessLaunchMessage")
    @WebResult(name = "SendProcessLaunchMessageResult", targetNamespace = "http://www.cadisedm.com/Schemas/")
    @RequestWrapper(localName = "SendProcessLaunchMessage", targetNamespace = "http://www.cadisedm.com/Schemas/", className = "com.cadisedm.schemas.SendProcessLaunchMessage")
    @ResponseWrapper(localName = "SendProcessLaunchMessageResponse", targetNamespace = "http://www.cadisedm.com/Schemas/", className = "com.cadisedm.schemas.SendProcessLaunchMessageResponse")
    public Error sendProcessLaunchMessage(
        @WebParam(name = "connectionToken", targetNamespace = "http://www.cadisedm.com/Schemas/")
        String connectionToken,
        @WebParam(name = "processLaunchQueueParameterName", targetNamespace = "http://www.cadisedm.com/Schemas/")
        String processLaunchQueueParameterName,
        @WebParam(name = "processType", targetNamespace = "http://www.cadisedm.com/Schemas/")
        CADISComponentsComponentKey processType,
        @WebParam(name = "processName", targetNamespace = "http://www.cadisedm.com/Schemas/")
        String processName,
        @WebParam(name = "messagePriority", targetNamespace = "http://www.cadisedm.com/Schemas/")
        EMessagePriority messagePriority);

    /**
     * 
     * @param processName
     * @param messagePriority
     * @param connectionToken
     * @param processType
     * @param processLaunchQueueParameterName
     * @param configurableParameters
     * @return
     *     returns com.cadisedm.schemas.Error
     */
    @WebMethod(operationName = "SendProcessLaunchMessageWithParameters", action = "http://www.cadisedm.com/Schemas/IProcessLauncher_1/SendProcessLaunchMessageWithParameters")
    @WebResult(name = "SendProcessLaunchMessageWithParametersResult", targetNamespace = "http://www.cadisedm.com/Schemas/")
    @RequestWrapper(localName = "SendProcessLaunchMessageWithParameters", targetNamespace = "http://www.cadisedm.com/Schemas/", className = "com.cadisedm.schemas.SendProcessLaunchMessageWithParameters")
    @ResponseWrapper(localName = "SendProcessLaunchMessageWithParametersResponse", targetNamespace = "http://www.cadisedm.com/Schemas/", className = "com.cadisedm.schemas.SendProcessLaunchMessageWithParametersResponse")
    public Error sendProcessLaunchMessageWithParameters(
        @WebParam(name = "connectionToken", targetNamespace = "http://www.cadisedm.com/Schemas/")
        String connectionToken,
        @WebParam(name = "processLaunchQueueParameterName", targetNamespace = "http://www.cadisedm.com/Schemas/")
        String processLaunchQueueParameterName,
        @WebParam(name = "processType", targetNamespace = "http://www.cadisedm.com/Schemas/")
        CADISComponentsComponentKey processType,
        @WebParam(name = "processName", targetNamespace = "http://www.cadisedm.com/Schemas/")
        String processName,
        @WebParam(name = "messagePriority", targetNamespace = "http://www.cadisedm.com/Schemas/")
        EMessagePriority messagePriority,
        @WebParam(name = "configurableParameters", targetNamespace = "http://www.cadisedm.com/Schemas/")
        ArrayOfKeyValueOfstringstring configurableParameters);

}