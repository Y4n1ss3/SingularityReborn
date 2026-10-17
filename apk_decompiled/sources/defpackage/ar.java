package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ar implements Iterator, n20 {
    public int d = -1;
    public int e;
    public int f;
    public k10 g;
    public final /* synthetic */ br h;

    public ar(br brVar) {
        this.h = brVar;
        int h = y80.h(0, 0, ((CharSequence) brVar.b).length());
        this.e = h;
        this.f = h;
    }

    public final void a() {
        br brVar = this.h;
        CharSequence charSequence = (CharSequence) brVar.b;
        int i = this.f;
        if (i < 0) {
            this.d = 0;
            this.g = null;
            return;
        }
        if (i > charSequence.length()) {
            this.g = new k10(this.e, charSequence.length() - 1, 1);
            this.f = -1;
        } else {
            xe0 xe0Var = (xe0) ((my) brVar.c).invoke(charSequence, Integer.valueOf(this.f));
            if (xe0Var == null) {
                this.g = new k10(this.e, charSequence.length() - 1, 1);
                this.f = -1;
            } else {
                int intValue = ((Number) xe0Var.d).intValue();
                int intValue2 = ((Number) xe0Var.e).intValue();
                this.g = y80.W(this.e, intValue);
                int i2 = intValue + intValue2;
                this.e = i2;
                this.f = i2 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == -1) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d == -1) {
            a();
        }
        if (this.d == 0) {
            o.q();
            return null;
        }
        k10 k10Var = this.g;
        k10Var.getClass();
        this.g = null;
        this.d = -1;
        return k10Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
