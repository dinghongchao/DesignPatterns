package com.dhc.pattern.factory.abstractfactory;

public class NoticeReport implements IReport {
    @Override
    public void report() {
        System.out.println("接收到通知状态报告");
    }
}
