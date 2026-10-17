package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkVertically$2 extends f30 implements ky {
    final /* synthetic */ ky $targetHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkVertically$2(ky kyVar) {
        super(1);
        this.$targetHeight = kyVar;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m7774boximpl(m64invokemzRDjE0(((IntSize) obj).m7786unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0, reason: not valid java name */
    public final long m64invokemzRDjE0(long j) {
        return IntSize.m7777constructorimpl((((int) (j >> 32)) << 32) | (((Number) this.$targetHeight.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue() & 4294967295L));
    }
}
