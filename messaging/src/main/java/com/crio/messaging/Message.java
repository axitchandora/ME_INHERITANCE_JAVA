package com.crio.messaging;

// Message class contains all message related variables/functions.
public class Message {
    //Common fields
    private String messageId;
    private String senderId;
    private String receiverId;
    private MessageType messageType;

    // Some Common fields, can be extended to many more.
    private MessageStatus messageStatus;

    //Fields related to text message.
    private String textMessageContent;

    //Fields related to image message.
    private String imageMessageContent;
    private String imageResolution;
    private String imageMetaData;

    //Fields relate to voice message.
    private String voiceMessageContent;
    private Integer durationInSec;
    private Integer voiceQualityInKbps;

    public Message(){
        this.messageStatus = MessageStatus.SENT;
    }

    public String getSenderId() {
        return senderId;
    }
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    public String getReceiverId() {
        return receiverId;
    }
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
    public MessageStatus getMessageStatus() {
        return messageStatus;
    }
    public void setMessageStatus(MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
    }
    public String getTextMessageContent() {
        return textMessageContent;
    }
    public void setTextMessageContent(String textMessageContent) {
        this.messageType = MessageType.TEXT;
        this.textMessageContent = textMessageContent;
    }
    public String getImageMessageContent() {
        return imageMessageContent;
    }
    public void setImageMessageContent(String imageMessageContent, String imageResolution,  String imageMetaData) {
        this.messageType =  MessageType.IMAGE;
        this.imageMessageContent = imageMessageContent;
        this.imageResolution = imageResolution;
        this.imageMetaData = imageMetaData;
    }
    public String getVoiceMessageContent() {
        return voiceMessageContent;
    }
    public void setVoiceMessageContent(String voiceMessageContent, Integer durationInSec, Integer voiceQualityInKbps) {
        this.messageType =  MessageType.VOICE;
        this.voiceMessageContent = voiceMessageContent;
        this.durationInSec = durationInSec;
        this.voiceQualityInKbps = voiceQualityInKbps;
    }

    public int getTextMessageContentSize(){
        return textMessageContent.length();
    }


    @Override
    public String toString() {
        return "Message [messageType=" + messageType + ", durationInSec=" + durationInSec + ", imageMessageContent=" + imageMessageContent
                + ", imageMetaData=" + imageMetaData + ", imageResolution=" + imageResolution + ", messageStatus="
                + messageStatus + ", receiverId=" + receiverId + ", senderId="
                + senderId + ", textMessageContent=" + textMessageContent + ", voiceMessageContent="
                + voiceMessageContent + ", voiceQualityInKbps=" + voiceQualityInKbps + "]";
    }

    

}
