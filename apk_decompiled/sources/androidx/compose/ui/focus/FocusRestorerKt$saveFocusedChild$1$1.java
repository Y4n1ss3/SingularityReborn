package androidx.compose.ui.focus;

import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusRestorerKt$saveFocusedChild$1$1 extends f30 implements iy {
    final /* synthetic */ int $previouslyFocusedChildHash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerKt$saveFocusedChild$1$1(int i) {
        super(0);
        this.$previouslyFocusedChildHash = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        return Integer.valueOf(this.$previouslyFocusedChildHash);
    }
}
