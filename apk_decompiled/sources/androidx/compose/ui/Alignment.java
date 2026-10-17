package androidx.compose.ui;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Alignment {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Horizontal {
        int align(int i, int i2, LayoutDirection layoutDirection);

        default Alignment plus(Vertical vertical) {
            return new CombinedAlignment(this, vertical);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Vertical {
        int align(int i, int i2);

        default Alignment plus(Horizontal horizontal) {
            return new CombinedAlignment(horizontal, this);
        }
    }

    /* renamed from: align-KFBX0sM, reason: not valid java name */
    long mo4178alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);

        private Companion() {
        }

        public final Vertical getBottom() {
            return Bottom;
        }

        public final Alignment getBottomCenter() {
            return BottomCenter;
        }

        public final Alignment getBottomEnd() {
            return BottomEnd;
        }

        public final Alignment getBottomStart() {
            return BottomStart;
        }

        public final Alignment getCenter() {
            return Center;
        }

        public final Alignment getCenterEnd() {
            return CenterEnd;
        }

        public final Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        public final Alignment getCenterStart() {
            return CenterStart;
        }

        public final Vertical getCenterVertically() {
            return CenterVertically;
        }

        public final Horizontal getEnd() {
            return End;
        }

        public final Horizontal getStart() {
            return Start;
        }

        public final Vertical getTop() {
            return Top;
        }

        public final Alignment getTopCenter() {
            return TopCenter;
        }

        public final Alignment getTopEnd() {
            return TopEnd;
        }

        public final Alignment getTopStart() {
            return TopStart;
        }

        public static /* synthetic */ void getBottom$annotations() {
        }

        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        public static /* synthetic */ void getBottomStart$annotations() {
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        public static /* synthetic */ void getCenterStart$annotations() {
        }

        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        public static /* synthetic */ void getEnd$annotations() {
        }

        public static /* synthetic */ void getStart$annotations() {
        }

        public static /* synthetic */ void getTop$annotations() {
        }

        public static /* synthetic */ void getTopCenter$annotations() {
        }

        public static /* synthetic */ void getTopEnd$annotations() {
        }

        public static /* synthetic */ void getTopStart$annotations() {
        }
    }
}
