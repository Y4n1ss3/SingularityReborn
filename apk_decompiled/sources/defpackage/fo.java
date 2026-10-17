package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class fo extends im {
    public ArrayList d;
    public String e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ro i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(ro roVar, im imVar) {
        super(imVar);
        this.i = roVar;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(this);
    }
}
