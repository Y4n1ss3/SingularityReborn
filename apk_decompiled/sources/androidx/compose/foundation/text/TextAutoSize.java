package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TextAutoSize {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: StepBased-vU-0ePk$default, reason: not valid java name */
        public static /* synthetic */ TextAutoSize m1158StepBasedvU0ePk$default(Companion companion, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = TextAutoSizeDefaults.INSTANCE.m1161getMinFontSizeXSAIIZE();
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = TextAutoSizeDefaults.INSTANCE.m1160getMaxFontSizeXSAIIZE();
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = TextUnitKt.getSp(0.25d);
            }
            return companion.m1159StepBasedvU0ePk(j4, j5, j3);
        }

        /* renamed from: StepBased-vU-0ePk, reason: not valid java name */
        public final TextAutoSize m1159StepBasedvU0ePk(long j, long j2, long j3) {
            return new AutoSizeStepBased(j, j2, j3, null);
        }
    }

    boolean equals(Object obj);

    /* renamed from: getFontSize-Ci0_558 */
    long mo1060getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j, AnnotatedString annotatedString);

    int hashCode();
}
