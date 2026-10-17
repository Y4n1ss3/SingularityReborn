package androidx.compose.ui.platform;

import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeViewContext$calculateWindowSizeLambda$1 extends f30 implements iy {
    final /* synthetic */ ComposeViewContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$calculateWindowSizeLambda$1(ComposeViewContext composeViewContext) {
        super(0);
        this.this$0 = composeViewContext;
    }

    @Override // defpackage.iy
    public final DerivedSize invoke() {
        return IntSize.m7780equalsimpl0(this.this$0.m6726getTestWindowSizeYbymL2g$ui(), IntSize.Companion.m7787getZeroYbymL2g()) ? AndroidWindowInfo_androidKt.calculateWindowSize(this.this$0.getView$ui()) : DerivedSize.Companion.m6737fromPxSizeviCIZxY(this.this$0.m6726getTestWindowSizeYbymL2g$ui(), AndroidDensity_androidKt.Density(this.this$0.getView$ui().getContext()));
    }
}
