package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    public static final EmptyBuildDrawCacheParams INSTANCE = new EmptyBuildDrawCacheParams();
    private static final long size = Size.Companion.m4593getUnspecifiedNHjbRc();
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private static final Density density = DensityKt.Density(1.0f, 1.0f);

    private EmptyBuildDrawCacheParams() {
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return density;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo4290getSizeNHjbRc() {
        return size;
    }
}
