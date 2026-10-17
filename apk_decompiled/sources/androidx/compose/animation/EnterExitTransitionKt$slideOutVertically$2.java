package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideOutVertically$2 extends f30 implements ky {
    final /* synthetic */ ky $targetOffsetY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideOutVertically$2(ky kyVar) {
        super(1);
        this.$targetOffsetY = kyVar;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m7730boximpl(m68invokemHKZG7I(((IntSize) obj).m7786unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m68invokemHKZG7I(long j) {
        return IntOffset.m7733constructorimpl(((Number) this.$targetOffsetY.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue() & 4294967295L);
    }
}
