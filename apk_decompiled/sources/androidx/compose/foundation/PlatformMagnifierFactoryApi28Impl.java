package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi28Impl INSTANCE = new PlatformMagnifierFactoryApi28Impl();
    private static final boolean canUpdateZoom = false;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public static final int $stable = 8;
        private final Magnifier magnifier;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.magnifier.dismiss();
        }

        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: getSize-YbymL2g */
        public long mo315getSizeYbymL2g() {
            return IntSize.m7777constructorimpl((this.magnifier.getWidth() << 32) | (this.magnifier.getHeight() & 4294967295L));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo316updateWko1d7g(long j, long j2, float f) {
            this.magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void updateContent() {
            this.magnifier.update();
        }
    }

    private PlatformMagnifierFactoryApi28Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo317createnHHXs2Y(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3) {
        return new PlatformMagnifierImpl(new Magnifier(view));
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }
}
