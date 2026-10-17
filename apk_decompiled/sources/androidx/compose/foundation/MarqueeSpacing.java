package androidx.compose.foundation;

import androidx.compose.ui.unit.Density;
import defpackage.pc;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MarqueeSpacing {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int fractionOfContainer$lambda$0(float f, Density density, int i, int i2) {
            return y80.P(f * i2);
        }

        public final MarqueeSpacing fractionOfContainer(float f) {
            return new pc(f, 1);
        }
    }

    int calculateSpacing(Density density, int i, int i2);
}
