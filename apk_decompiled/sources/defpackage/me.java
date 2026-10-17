package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class me extends im {
    public Context d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ts g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(ts tsVar, im imVar) {
        super(imVar);
        this.g = tsVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(null, this);
    }
}
