package androidx.compose.ui.input.nestedscroll;

import defpackage.f30;
import defpackage.iy;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollNode$updateDispatcherFields$1 extends f30 implements iy {
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$updateDispatcherFields$1(NestedScrollNode nestedScrollNode) {
        super(0);
        this.this$0 = nestedScrollNode;
    }

    @Override // defpackage.iy
    public final un invoke() {
        un nestedCoroutineScope;
        nestedCoroutineScope = this.this$0.getNestedCoroutineScope();
        return nestedCoroutineScope;
    }
}
