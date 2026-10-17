package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasurePolicy;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeUiNode$Companion$SetMeasurePolicy$1 extends f30 implements my {
    public static final ComposeUiNode$Companion$SetMeasurePolicy$1 INSTANCE = new ComposeUiNode$Companion$SetMeasurePolicy$1();

    public ComposeUiNode$Companion$SetMeasurePolicy$1() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (MeasurePolicy) obj2);
        return w01.a;
    }

    public final void invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
        composeUiNode.setMeasurePolicy(measurePolicy);
    }
}
