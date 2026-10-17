package androidx.compose.ui.text.input;

import defpackage.c21;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformImeOptions {
    public static final int $stable = 0;
    private final String privateImeOptions;

    public /* synthetic */ PlatformImeOptions(String str, int i, dq dqVar) {
        this((i & 1) != 0 ? null : str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlatformImeOptions) && q10.b(this.privateImeOptions, ((PlatformImeOptions) obj).privateImeOptions);
    }

    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return c21.a(new StringBuilder("PlatformImeOptions(privateImeOptions="), this.privateImeOptions, ')');
    }

    public PlatformImeOptions(String str) {
        this.privateImeOptions = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformImeOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
