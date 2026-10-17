package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kz extends im {
    public Iterator d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pz g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(pz pzVar, im imVar) {
        super(imVar);
        this.g = pzVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, this);
    }
}
