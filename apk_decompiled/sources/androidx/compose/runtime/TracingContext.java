package androidx.compose.runtime;

import androidx.compose.runtime.internal.Trace;
import defpackage.dq;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;
import defpackage.w01;
import defpackage.wu0;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class TracingContext implements in, wu0 {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final String name;

    public TracingContext(String str) {
        this.name = str;
    }

    @Override // defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) y80.q(this, r, myVar);
    }

    @Override // defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) y80.s(this, jnVar);
    }

    @Override // defpackage.in
    public jn getKey() {
        return Key;
    }

    @Override // defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return y80.F(this, jnVar);
    }

    @Override // defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return y80.I(this, knVar);
    }

    @Override // defpackage.wu0
    public void restoreThreadContext(kn knVar, w01 w01Var) {
        Trace.INSTANCE.endSection(w01.a);
    }

    /* renamed from: updateThreadContext, reason: collision with other method in class */
    public void m3876updateThreadContext(kn knVar) {
        Trace.INSTANCE.beginSection(this.name);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Key implements jn {
        public /* synthetic */ Key(dq dqVar) {
            this();
        }

        private Key() {
        }
    }

    @Override // defpackage.wu0
    public /* bridge */ /* synthetic */ Object updateThreadContext(kn knVar) {
        m3876updateThreadContext(knVar);
        return w01.a;
    }
}
