package com.topjohnwu.superuser.internal;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
class CommandSource implements ShellInputSource {
    private final String[] cmd;

    public CommandSource(String[] strArr) {
        this.cmd = strArr;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream outputStream) {
        for (String str : this.cmd) {
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
            outputStream.write(10);
        }
    }
}
