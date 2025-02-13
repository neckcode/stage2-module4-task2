package com.mjc.stage2;

import com.mjc.stage2.impl.RealConnection;

public interface Connection {

     void close() ;

     boolean isClosed() ;
}
