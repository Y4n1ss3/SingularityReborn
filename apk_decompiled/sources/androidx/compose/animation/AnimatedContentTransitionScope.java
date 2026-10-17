package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import defpackage.dq;
import defpackage.ky;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ EnterTransition m6slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i, FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
            return null;
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i2 & 4) != 0) {
            kyVar = AnimatedContentTransitionScope$slideIntoContainer$1.INSTANCE;
        }
        return animatedContentTransitionScope.mo8slideIntoContainermOhB8PU(i, finiteAnimationSpec, kyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ ExitTransition m7slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i, FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
            return null;
        }
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i2 & 4) != 0) {
            kyVar = AnimatedContentTransitionScope$slideOutOfContainer$1.INSTANCE;
        }
        return animatedContentTransitionScope.mo9slideOutOfContainermOhB8PU(i, finiteAnimationSpec, kyVar);
    }

    Alignment getContentAlignment();

    default ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation();
    }

    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo8slideIntoContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar);

    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo9slideOutOfContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar);

    ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SlideDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Left = m11constructorimpl(0);
        private static final int Right = m11constructorimpl(1);
        private static final int Up = m11constructorimpl(2);
        private static final int Down = m11constructorimpl(3);
        private static final int Start = m11constructorimpl(4);
        private static final int End = m11constructorimpl(5);

        private /* synthetic */ SlideDirection(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m10boximpl(int i) {
            return new SlideDirection(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m12equalsimpl(int i, Object obj) {
            return (obj instanceof SlideDirection) && i == ((SlideDirection) obj).m16unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m13equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m14hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m15toStringimpl(int i) {
            return m13equalsimpl0(i, Left) ? "Left" : m13equalsimpl0(i, Right) ? "Right" : m13equalsimpl0(i, Up) ? "Up" : m13equalsimpl0(i, Down) ? "Down" : m13equalsimpl0(i, Start) ? "Start" : m13equalsimpl0(i, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m12equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m14hashCodeimpl(this.value);
        }

        public String toString() {
            return m15toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m16unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m17getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m18getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m19getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m20getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m21getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m22getUpDKzdypw() {
                return SlideDirection.Up;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m11constructorimpl(int i) {
            return i;
        }
    }

    static /* synthetic */ void getKeepUntilTransitionsFinished$annotations(ExitTransition.Companion companion) {
    }
}
