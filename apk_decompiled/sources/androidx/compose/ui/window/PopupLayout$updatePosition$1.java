package androidx.compose.ui.window;

import androidx.compose.ui.unit.IntRect;
import defpackage.f30;
import defpackage.ii0;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PopupLayout$updatePosition$1 extends f30 implements iy {
    final /* synthetic */ IntRect $parentBounds;
    final /* synthetic */ long $popupContentSize;
    final /* synthetic */ ii0 $popupPosition;
    final /* synthetic */ long $windowSize;
    final /* synthetic */ PopupLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$updatePosition$1(ii0 ii0Var, PopupLayout popupLayout, IntRect intRect, long j, long j2) {
        super(0);
        this.$popupPosition = ii0Var;
        this.this$0 = popupLayout;
        this.$parentBounds = intRect;
        this.$windowSize = j;
        this.$popupContentSize = j2;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7879invoke() {
        this.$popupPosition.d = this.this$0.getPositionProvider().mo336calculatePositionllwVHH4(this.$parentBounds, this.$windowSize, this.this$0.getParentLayoutDirection(), this.$popupContentSize);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m7879invoke();
        return w01.a;
    }
}
