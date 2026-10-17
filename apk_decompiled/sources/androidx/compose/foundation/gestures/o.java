package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.gi0;
import defpackage.ii0;
import defpackage.my;
import defpackage.w01;
import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o(int i, Serializable serializable, Object obj) {
        this.d = i;
        this.e = serializable;
        this.f = obj;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        w01 invokeSuspend$lambda$03;
        switch (this.d) {
            case 0:
                invokeSuspend$lambda$0 = ScrollExtensionsKt$animateScrollBy$2.invokeSuspend$lambda$0((gi0) this.e, (ScrollScope) this.f, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = ScrollExtensionsKt$animateScrollBy$4.invokeSuspend$lambda$0((ii0) this.e, (Scroll2DScope) this.f, (Offset) obj, (Offset) obj2);
                return invokeSuspend$lambda$02;
            default:
                invokeSuspend$lambda$03 = Scrollable2DKt$semanticsScrollBy$2.invokeSuspend$lambda$0((ii0) this.e, (NestedScrollScope) this.f, (Offset) obj, (Offset) obj2);
                return invokeSuspend$lambda$03;
        }
    }
}
