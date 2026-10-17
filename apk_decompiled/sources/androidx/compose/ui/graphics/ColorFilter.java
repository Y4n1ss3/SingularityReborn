package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class ColorFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics() {
        return this.nativeColorFilter;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m4802tintxETnrds$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.Companion.m4699getSrcIn0nO6VwU();
            }
            return companion.m4805tintxETnrds(j, i);
        }

        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m4803colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (dq) null);
        }

        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m4804lightingOWjLjI(long j, long j2) {
            return new LightingColorFilter(j, j2, (dq) null);
        }

        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m4805tintxETnrds(long j, int i) {
            return new BlendModeColorFilter(j, i, (dq) null);
        }

        private Companion() {
        }
    }
}
