package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PathEffect {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PathEffect dashPathEffect$default(Companion companion, float[] fArr, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return companion.dashPathEffect(fArr, f);
        }

        public final PathEffect chainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
            return AndroidPathEffect_androidKt.actualChainPathEffect(pathEffect, pathEffect2);
        }

        public final PathEffect cornerPathEffect(float f) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f);
        }

        public final PathEffect dashPathEffect(float[] fArr, float f) {
            return AndroidPathEffect_androidKt.actualDashPathEffect(fArr, f);
        }

        /* renamed from: stampedPathEffect-7aD1DOk, reason: not valid java name */
        public final PathEffect m5049stampedPathEffect7aD1DOk(Path path, float f, float f2, int i) {
            return AndroidPathEffect_androidKt.m4654actualStampedPathEffect7aD1DOk(path, f, f2, i);
        }
    }
}
