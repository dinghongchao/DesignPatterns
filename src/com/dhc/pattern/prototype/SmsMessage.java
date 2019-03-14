package com.dhc.pattern.prototype;

public class SmsMessage {

    //
    public static void main(String[] args) throws CloneNotSupportedException {
        Message message = new Message("双十一来临快填满购物车吧！");
        String mobile = "18601322771,18601322772,18601322773";
        for(String mob:mobile.split(",")) {
           message = message.clone();
           message.setMobile(mob);
           System.out.println(message);
        }
    }

    static class Message implements Cloneable{
        private String mobile;
        private String content;

        public Message(){}

        public Message(String content) {
            this.content = content;
        }
        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }


        @Override
        protected Message clone() throws CloneNotSupportedException {
            return (Message) super.clone();
        }

        @Override
        public String toString() {
            return "Message{" +
                    "mobile='" + mobile + '\'' +
                    ", content='" + content + '\'' +
                    '}';
        }
    }
}
