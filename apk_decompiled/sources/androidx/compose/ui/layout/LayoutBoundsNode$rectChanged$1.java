package androidx.compose.ui.layout;

import androidx.compose.ui.spatial.RelativeLayoutBounds;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutBoundsNode$rectChanged$1 extends f30 implements ky {
    final /* synthetic */ LayoutBoundsNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutBoundsNode$rectChanged$1(LayoutBoundsNode layoutBoundsNode) {
        super(1);
        this.this$0 = layoutBoundsNode;
    }

    public final void invoke(RelativeLayoutBounds relativeLayoutBounds) {
        this.this$0.getHolder().setBounds$ui(relativeLayoutBounds);
        this.this$0.setLastBounds(relativeLayoutBounds);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RelativeLayoutBounds) obj);
        return w01.a;
    }
}
