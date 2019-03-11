/*******************************************************************************
 * Copyright (C) 2019 ICCU - Istituto Centrale per il Catalogo Unico
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.04 at 04:06:08 PM CET
//


package it.iccu.sbn.vo.xml.binding.ill.apdu;

import it.iccu.sbn.ejb.vo.SerializableVO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ILL-Request" type="{}ILL_RequestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Forward-Notification" type="{}Forward-NotificationType"/>
 *         &lt;element name="Shipped" type="{}ShippedType"/>
 *         &lt;element name="ILL-Answer" type="{}ILL_AnswerType"/>
 *         &lt;element name="Conditional-Reply" type="{}ConditionalReplyType"/>
 *         &lt;element name="Cancel" type="{}CancelType"/>
 *         &lt;element name="Received" type="{}ReceivedType"/>
 *         &lt;element name="Recall" type="{}RecallType"/>
 *         &lt;element name="Returned" type="{}ReturnedType"/>
 *         &lt;element name="Checked-In" type="{}CheckedInType"/>
 *         &lt;element name="Overdue" type="{}OverdueType"/>
 *         &lt;element name="Renew" type="{}RenewType"/>
 *         &lt;element name="Renew-Answer" type="{}RenewAnswerType"/>
 *         &lt;element name="Status-query" type="{}StatusQueryType"/>
 *         &lt;element name="Status-or-error-report" type="{}StatusOrErrorReportType"/>
 *         &lt;element name="Expired" type="{}ExpiredType"/>
 *         &lt;element name="Lost" type="{}LostType"/>
 *         &lt;element name="Damaged" type="{}DamagedType"/>
 *         &lt;element name="Cancel-Reply" type="{}CancelReplyType"/>
 *         &lt;element name="Message" type="{}MessageType"/>
 *         &lt;element name="bib" type="{}ILLBiblioType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "illRequest",
    "forwardNotification",
    "shipped",
    "illAnswer",
    "conditionalReply",
    "cancel",
    "received",
    "recall",
    "returned",
    "checkedIn",
    "overdue",
    "renew",
    "renewAnswer",
    "statusQuery",
    "statusOrErrorReport",
    "expired",
    "lost",
    "damaged",
    "cancelReply",
    "message",
    "bib"
})
@XmlRootElement(name = "ILL-APDU")
public class ILLAPDU
    extends SerializableVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ILL-Request")
    protected List<ILLRequestType> illRequest;
    @XmlElement(name = "Forward-Notification")
    protected ForwardNotificationType forwardNotification;
    @XmlElement(name = "Shipped")
    protected ShippedType shipped;
    @XmlElement(name = "ILL-Answer")
    protected ILLAnswerType illAnswer;
    @XmlElement(name = "Conditional-Reply")
    protected ConditionalReplyType conditionalReply;
    @XmlElement(name = "Cancel")
    protected CancelType cancel;
    @XmlElement(name = "Received")
    protected ReceivedType received;
    @XmlElement(name = "Recall")
    protected RecallType recall;
    @XmlElement(name = "Returned")
    protected ReturnedType returned;
    @XmlElement(name = "Checked-In")
    protected CheckedInType checkedIn;
    @XmlElement(name = "Overdue")
    protected OverdueType overdue;
    @XmlElement(name = "Renew")
    protected RenewType renew;
    @XmlElement(name = "Renew-Answer")
    protected RenewAnswerType renewAnswer;
    @XmlElement(name = "Status-query")
    protected StatusQueryType statusQuery;
    @XmlElement(name = "Status-or-error-report")
    protected StatusOrErrorReportType statusOrErrorReport;
    @XmlElement(name = "Expired")
    protected ExpiredType expired;
    @XmlElement(name = "Lost")
    protected LostType lost;
    @XmlElement(name = "Damaged")
    protected DamagedType damaged;
    @XmlElement(name = "Cancel-Reply")
    protected CancelReplyType cancelReply;
    @XmlElement(name = "Message")
    protected MessageType message;
    protected List<ILLBiblioType> bib;

    /**
     * Gets the value of the illRequest property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the illRequest property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getILLRequest().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ILLRequestType }
     *
     *
     */
    public List<ILLRequestType> getILLRequest() {
        if (illRequest == null) {
            illRequest = new ArrayList<ILLRequestType>();
        }
        return this.illRequest;
    }

    /**
     * Gets the value of the forwardNotification property.
     *
     * @return
     *     possible object is
     *     {@link ForwardNotificationType }
     *
     */
    public ForwardNotificationType getForwardNotification() {
        return forwardNotification;
    }

    /**
     * Sets the value of the forwardNotification property.
     *
     * @param value
     *     allowed object is
     *     {@link ForwardNotificationType }
     *
     */
    public void setForwardNotification(ForwardNotificationType value) {
        this.forwardNotification = value;
    }

    /**
     * Gets the value of the shipped property.
     *
     * @return
     *     possible object is
     *     {@link ShippedType }
     *
     */
    public ShippedType getShipped() {
        return shipped;
    }

    /**
     * Sets the value of the shipped property.
     *
     * @param value
     *     allowed object is
     *     {@link ShippedType }
     *
     */
    public void setShipped(ShippedType value) {
        this.shipped = value;
    }

    /**
     * Gets the value of the illAnswer property.
     *
     * @return
     *     possible object is
     *     {@link ILLAnswerType }
     *
     */
    public ILLAnswerType getILLAnswer() {
        return illAnswer;
    }

    /**
     * Sets the value of the illAnswer property.
     *
     * @param value
     *     allowed object is
     *     {@link ILLAnswerType }
     *
     */
    public void setILLAnswer(ILLAnswerType value) {
        this.illAnswer = value;
    }

    /**
     * Gets the value of the conditionalReply property.
     *
     * @return
     *     possible object is
     *     {@link ConditionalReplyType }
     *
     */
    public ConditionalReplyType getConditionalReply() {
        return conditionalReply;
    }

    /**
     * Sets the value of the conditionalReply property.
     *
     * @param value
     *     allowed object is
     *     {@link ConditionalReplyType }
     *
     */
    public void setConditionalReply(ConditionalReplyType value) {
        this.conditionalReply = value;
    }

    /**
     * Gets the value of the cancel property.
     *
     * @return
     *     possible object is
     *     {@link CancelType }
     *
     */
    public CancelType getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     *
     * @param value
     *     allowed object is
     *     {@link CancelType }
     *
     */
    public void setCancel(CancelType value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the received property.
     *
     * @return
     *     possible object is
     *     {@link ReceivedType }
     *
     */
    public ReceivedType getReceived() {
        return received;
    }

    /**
     * Sets the value of the received property.
     *
     * @param value
     *     allowed object is
     *     {@link ReceivedType }
     *
     */
    public void setReceived(ReceivedType value) {
        this.received = value;
    }

    /**
     * Gets the value of the recall property.
     *
     * @return
     *     possible object is
     *     {@link RecallType }
     *
     */
    public RecallType getRecall() {
        return recall;
    }

    /**
     * Sets the value of the recall property.
     *
     * @param value
     *     allowed object is
     *     {@link RecallType }
     *
     */
    public void setRecall(RecallType value) {
        this.recall = value;
    }

    /**
     * Gets the value of the returned property.
     *
     * @return
     *     possible object is
     *     {@link ReturnedType }
     *
     */
    public ReturnedType getReturned() {
        return returned;
    }

    /**
     * Sets the value of the returned property.
     *
     * @param value
     *     allowed object is
     *     {@link ReturnedType }
     *
     */
    public void setReturned(ReturnedType value) {
        this.returned = value;
    }

    /**
     * Gets the value of the checkedIn property.
     *
     * @return
     *     possible object is
     *     {@link CheckedInType }
     *
     */
    public CheckedInType getCheckedIn() {
        return checkedIn;
    }

    /**
     * Sets the value of the checkedIn property.
     *
     * @param value
     *     allowed object is
     *     {@link CheckedInType }
     *
     */
    public void setCheckedIn(CheckedInType value) {
        this.checkedIn = value;
    }

    /**
     * Gets the value of the overdue property.
     *
     * @return
     *     possible object is
     *     {@link OverdueType }
     *
     */
    public OverdueType getOverdue() {
        return overdue;
    }

    /**
     * Sets the value of the overdue property.
     *
     * @param value
     *     allowed object is
     *     {@link OverdueType }
     *
     */
    public void setOverdue(OverdueType value) {
        this.overdue = value;
    }

    /**
     * Gets the value of the renew property.
     *
     * @return
     *     possible object is
     *     {@link RenewType }
     *
     */
    public RenewType getRenew() {
        return renew;
    }

    /**
     * Sets the value of the renew property.
     *
     * @param value
     *     allowed object is
     *     {@link RenewType }
     *
     */
    public void setRenew(RenewType value) {
        this.renew = value;
    }

    /**
     * Gets the value of the renewAnswer property.
     *
     * @return
     *     possible object is
     *     {@link RenewAnswerType }
     *
     */
    public RenewAnswerType getRenewAnswer() {
        return renewAnswer;
    }

    /**
     * Sets the value of the renewAnswer property.
     *
     * @param value
     *     allowed object is
     *     {@link RenewAnswerType }
     *
     */
    public void setRenewAnswer(RenewAnswerType value) {
        this.renewAnswer = value;
    }

    /**
     * Gets the value of the statusQuery property.
     *
     * @return
     *     possible object is
     *     {@link StatusQueryType }
     *
     */
    public StatusQueryType getStatusQuery() {
        return statusQuery;
    }

    /**
     * Sets the value of the statusQuery property.
     *
     * @param value
     *     allowed object is
     *     {@link StatusQueryType }
     *
     */
    public void setStatusQuery(StatusQueryType value) {
        this.statusQuery = value;
    }

    /**
     * Gets the value of the statusOrErrorReport property.
     *
     * @return
     *     possible object is
     *     {@link StatusOrErrorReportType }
     *
     */
    public StatusOrErrorReportType getStatusOrErrorReport() {
        return statusOrErrorReport;
    }

    /**
     * Sets the value of the statusOrErrorReport property.
     *
     * @param value
     *     allowed object is
     *     {@link StatusOrErrorReportType }
     *
     */
    public void setStatusOrErrorReport(StatusOrErrorReportType value) {
        this.statusOrErrorReport = value;
    }

    /**
     * Gets the value of the expired property.
     *
     * @return
     *     possible object is
     *     {@link ExpiredType }
     *
     */
    public ExpiredType getExpired() {
        return expired;
    }

    /**
     * Sets the value of the expired property.
     *
     * @param value
     *     allowed object is
     *     {@link ExpiredType }
     *
     */
    public void setExpired(ExpiredType value) {
        this.expired = value;
    }

    /**
     * Gets the value of the lost property.
     *
     * @return
     *     possible object is
     *     {@link LostType }
     *
     */
    public LostType getLost() {
        return lost;
    }

    /**
     * Sets the value of the lost property.
     *
     * @param value
     *     allowed object is
     *     {@link LostType }
     *
     */
    public void setLost(LostType value) {
        this.lost = value;
    }

    /**
     * Gets the value of the damaged property.
     *
     * @return
     *     possible object is
     *     {@link DamagedType }
     *
     */
    public DamagedType getDamaged() {
        return damaged;
    }

    /**
     * Sets the value of the damaged property.
     *
     * @param value
     *     allowed object is
     *     {@link DamagedType }
     *
     */
    public void setDamaged(DamagedType value) {
        this.damaged = value;
    }

    /**
     * Gets the value of the cancelReply property.
     *
     * @return
     *     possible object is
     *     {@link CancelReplyType }
     *
     */
    public CancelReplyType getCancelReply() {
        return cancelReply;
    }

    /**
     * Sets the value of the cancelReply property.
     *
     * @param value
     *     allowed object is
     *     {@link CancelReplyType }
     *
     */
    public void setCancelReply(CancelReplyType value) {
        this.cancelReply = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link MessageType }
     *
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *
     */
    public void setMessage(MessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the bib property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bib property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBib().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ILLBiblioType }
     *
     *
     */
    public List<ILLBiblioType> getBib() {
        if (bib == null) {
            bib = new ArrayList<ILLBiblioType>();
        }
        return this.bib;
    }

}