package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import defpackage.gi0;
import defpackage.ii0;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invoke$lambda$4;
        w01 invokeSuspend$lambda$0;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                invoke$lambda$4 = DragGestureNode$initializePointerInputNode$1.invoke$lambda$4((DragGestureNode) obj5, (ii0) obj4, (VelocityTracker) obj3, (PointerInputChange) obj, (Offset) obj2);
                return invoke$lambda$4;
            default:
                invokeSuspend$lambda$0 = ScrollableKt$semanticsScrollBy$2.invokeSuspend$lambda$0((gi0) obj5, (ScrollingLogic) obj4, (NestedScrollScope) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return invokeSuspend$lambda$0;
        }
    }
}
