package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final MutableState insets$delegate;

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i, dq dqVar) {
        this((i & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return getInsets().getBottom(density);
    }

    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return getInsets().getTop(density);
    }

    public final void setInsets(WindowInsets windowInsets) {
        this.insets$delegate.setValue(windowInsets);
    }

    public MutableWindowInsets(WindowInsets windowInsets) {
        this.insets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
