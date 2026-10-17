package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadPassDelegate$remeasure$1$2 extends f30 implements ky {
    public static final LookaheadPassDelegate$remeasure$1$2 INSTANCE = new LookaheadPassDelegate$remeasure$1$2();

    public LookaheadPassDelegate$remeasure$1$2() {
        super(1);
    }

    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui(false);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AlignmentLinesOwner) obj);
        return w01.a;
    }
}
