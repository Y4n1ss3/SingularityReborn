package com.topjohnwu.superuser.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
class InputStreamSource implements ShellInputSource {
    private final InputStream in;

    public InputStreamSource(InputStream inputStream) {
        this.in = inputStream;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.in.close();
        } catch (IOException unused) {
        }
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream outputStream) {
        Utils.pump(this.in, outputStream);
        this.in.close();
        outputStream.write(10);
    }
}
