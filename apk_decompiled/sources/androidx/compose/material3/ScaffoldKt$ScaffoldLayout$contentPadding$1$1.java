package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements PaddingValues {
    private final MutableState paddingHolder$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(0.0f)), null, 2, null);

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo711calculateBottomPaddingD9Ej5fM() {
        return getPaddingHolder().mo711calculateBottomPaddingD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo712calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo712calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo713calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return getPaddingHolder().mo713calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo714calculateTopPaddingD9Ej5fM() {
        return getPaddingHolder().mo714calculateTopPaddingD9Ej5fM();
    }

    public final PaddingValues getPaddingHolder() {
        return (PaddingValues) this.paddingHolder$delegate.getValue();
    }

    public final void setPaddingHolder(PaddingValues paddingValues) {
        this.paddingHolder$delegate.setValue(paddingValues);
    }
}
