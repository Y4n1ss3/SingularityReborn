package androidx.compose.ui.node;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadCapablePlaceable$captureRulers$1 extends f30 implements iy {
    final /* synthetic */ PlaceableResult $placeableResult;
    final /* synthetic */ long $positionOnScreen;
    final /* synthetic */ long $size;
    final /* synthetic */ LookaheadCapablePlaceable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadCapablePlaceable$captureRulers$1(LookaheadCapablePlaceable lookaheadCapablePlaceable, long j, long j2, PlaceableResult placeableResult) {
        super(0);
        this.this$0 = lookaheadCapablePlaceable;
        this.$positionOnScreen = j;
        this.$size = j2;
        this.$placeableResult = placeableResult;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6494invoke() {
        LookaheadCapablePlaceable.ResettableRulerScope rulerScope;
        LookaheadCapablePlaceable.ResettableRulerScope rulerScope2;
        LookaheadCapablePlaceable.ResettableRulerScope rulerScope3;
        LookaheadCapablePlaceable.ResettableRulerScope rulerScope4;
        rulerScope = this.this$0.getRulerScope();
        rulerScope.setCoordinatesAccessed(false);
        rulerScope2 = this.this$0.getRulerScope();
        rulerScope2.m6492setPositionOnScreengyyYBs(this.$positionOnScreen);
        rulerScope3 = this.this$0.getRulerScope();
        rulerScope3.m6493setSizeozmzZPI(this.$size);
        ky rulers = this.$placeableResult.getResult().getRulers();
        if (rulers != null) {
            rulerScope4 = this.this$0.getRulerScope();
            rulers.invoke(rulerScope4);
        }
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6494invoke();
        return w01.a;
    }
}
