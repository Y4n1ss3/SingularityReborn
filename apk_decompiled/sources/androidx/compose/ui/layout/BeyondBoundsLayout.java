package androidx.compose.ui.layout;

import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo909layouto7g1Pn8(int i, ky kyVar);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m6215constructorimpl(1);
        private static final int After = m6215constructorimpl(2);
        private static final int Left = m6215constructorimpl(3);
        private static final int Right = m6215constructorimpl(4);
        private static final int Above = m6215constructorimpl(5);
        private static final int Below = m6215constructorimpl(6);

        private /* synthetic */ LayoutDirection(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m6214boximpl(int i) {
            return new LayoutDirection(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m6216equalsimpl(int i, Object obj) {
            return (obj instanceof LayoutDirection) && i == ((LayoutDirection) obj).m6220unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6217equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m6218hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m6219toStringimpl(int i) {
            return m6217equalsimpl0(i, Before) ? "Before" : m6217equalsimpl0(i, After) ? "After" : m6217equalsimpl0(i, Left) ? "Left" : m6217equalsimpl0(i, Right) ? "Right" : m6217equalsimpl0(i, Above) ? "Above" : m6217equalsimpl0(i, Below) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m6216equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m6218hashCodeimpl(this.value);
        }

        public String toString() {
            return m6219toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m6220unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m6221getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m6222getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m6223getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m6224getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m6225getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m6226getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m6215constructorimpl(int i) {
            return i;
        }
    }
}
