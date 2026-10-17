package defpackage;

import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wy0 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ nj g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy0(boolean z, nj njVar, MutableState mutableState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = njVar;
        this.h = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new wy0(this.f, this.g, this.h, hmVar, 0);
            default:
                return new wy0(this.f, this.g, this.h, hmVar, 1);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((wy0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0055 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d7 -> B:26:0x00b6). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
