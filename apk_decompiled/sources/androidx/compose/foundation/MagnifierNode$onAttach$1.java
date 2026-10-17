package androidx.compose.foundation;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.un;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MagnifierNode$onAttach$1 extends us0 implements my {
    int label;
    final /* synthetic */ MagnifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(MagnifierNode magnifierNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = magnifierNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(long j) {
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new MagnifierNode$onAttach$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MagnifierNode$onAttach$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:8:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0042 -> B:6:0x0045). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            vn r3 = defpackage.vn.d
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.p10.Q(r5)
            goto L45
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o.f(r4)
            r4 = 0
            return r4
        L17:
            defpackage.p10.Q(r5)
            goto L2f
        L1b:
            defpackage.p10.Q(r5)
        L1e:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            zg r5 = androidx.compose.foundation.MagnifierNode.access$getDrawSignalChannel$p(r5)
            if (r5 == 0) goto L2f
            r4.label = r2
            java.lang.Object r5 = r5.i(r4)
            if (r5 != r3) goto L2f
            goto L44
        L2f:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
            if (r5 == 0) goto L1e
            androidx.compose.foundation.g r5 = new androidx.compose.foundation.g
            r5.<init>(r2)
            r4.label = r1
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4)
            if (r5 != r3) goto L45
        L44:
            return r3
        L45:
            androidx.compose.foundation.MagnifierNode r5 = r4.this$0
            androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
            if (r5 == 0) goto L1e
            r5.updateContent()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
