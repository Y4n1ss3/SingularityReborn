package defpackage;

import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rv extends ov {
    public boolean b;
    public File[] c;
    public int d;

    @Override // defpackage.sv
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            fileArr = file.listFiles();
            this.c = fileArr;
            if (fileArr == null || fileArr.length == 0) {
                return null;
            }
        }
        fileArr.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArr[i];
    }
}
