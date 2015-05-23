package com.nrelectronics.app;

import com.nrelectronics.handlers.ICOMRequestProcessor;
import com.nrelectronics.handlers.TestMessageHandler;

public class COMRequestResolver {
    public ICOMRequestProcessor getCurrentHandler(COMRequest request) {
        ICOMRequestProcessor processor = new TestMessageHandler();
        processor.setCOMRequest(request);
        return processor;
    }
}
