package io.surati.gap.commons.utils.convert;

import org.takes.Request;
import org.takes.rq.RqHeaders;

import java.io.IOException;

public final class RqFilename {

    private final Request req;
    
    public RqFilename(final Request req) {
        this.req = req;
    }
    
    public String value() throws IOException {
        final RqHeaders.Smart headers = new RqHeaders.Smart(req);
        final String header = headers.single("Content-Disposition");
        for (String content : header.split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        throw new IllegalArgumentException("Request not contained filename property !");
    }
}
