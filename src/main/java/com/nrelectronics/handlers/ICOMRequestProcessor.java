package com.nrelectronics.handlers;

import com.nrelectronics.app.COMRequest;

public interface ICOMRequestProcessor {

    void setCOMRequest(COMRequest _request);

    String getInfo();

    void processAsync(); //its must be synchronized
}
