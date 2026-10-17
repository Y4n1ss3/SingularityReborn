package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g50 implements Iterator, n20 {
    public String d;
    public boolean e;
    public final /* synthetic */ cc f;

    public g50(cc ccVar) {
        this.f = ccVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str = this.d;
        if (str == null && !this.e) {
            str = ((BufferedReader) this.f.b).readLine();
            this.d = str;
            if (str == null) {
                this.e = true;
            }
        }
        return str != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            o.q();
            return null;
        }
        String str = this.d;
        this.d = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
