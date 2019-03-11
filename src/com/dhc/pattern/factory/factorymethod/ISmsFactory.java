package com.dhc.pattern.factory.factorymethod;

import com.dhc.pattern.factory.ISms;

/**
 * 流水线
 */
public interface ISmsFactory {

    ISms createSms();
}
