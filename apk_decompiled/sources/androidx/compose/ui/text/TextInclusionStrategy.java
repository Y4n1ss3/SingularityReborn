package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface TextInclusionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final TextInclusionStrategy AnyOverlap = new lu0(0);
        private static final TextInclusionStrategy ContainsAll = new lu0(1);
        private static final TextInclusionStrategy ContainsCenter = new lu0(2);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsAll$lambda$0(Rect rect, Rect rect2) {
            return !rect2.isEmpty() && rect.getLeft() >= rect2.getLeft() && rect.getRight() <= rect2.getRight() && rect.getTop() >= rect2.getTop() && rect.getBottom() <= rect2.getBottom();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsCenter$lambda$0(Rect rect, Rect rect2) {
            return rect2.m4542containsk4lQ0M(rect.m4546getCenterF1C5BW0());
        }

        public final TextInclusionStrategy getAnyOverlap() {
            return AnyOverlap;
        }

        public final TextInclusionStrategy getContainsAll() {
            return ContainsAll;
        }

        public final TextInclusionStrategy getContainsCenter() {
            return ContainsCenter;
        }
    }

    boolean isIncluded(Rect rect, Rect rect2);
}
