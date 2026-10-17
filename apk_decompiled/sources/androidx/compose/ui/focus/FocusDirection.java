package androidx.compose.ui.focus;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m4386constructorimpl(1);
    private static final int Previous = m4386constructorimpl(2);
    private static final int Left = m4386constructorimpl(3);
    private static final int Right = m4386constructorimpl(4);
    private static final int Up = m4386constructorimpl(5);
    private static final int Down = m4386constructorimpl(6);
    private static final int Enter = m4386constructorimpl(7);
    private static final int Exit = m4386constructorimpl(8);

    private /* synthetic */ FocusDirection(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m4385boximpl(int i) {
        return new FocusDirection(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4387equalsimpl(int i, Object obj) {
        return (obj instanceof FocusDirection) && i == ((FocusDirection) obj).m4391unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4388equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4389hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4390toStringimpl(int i) {
        return m4388equalsimpl0(i, Next) ? "Next" : m4388equalsimpl0(i, Previous) ? "Previous" : m4388equalsimpl0(i, Left) ? "Left" : m4388equalsimpl0(i, Right) ? "Right" : m4388equalsimpl0(i, Up) ? "Up" : m4388equalsimpl0(i, Down) ? "Down" : m4388equalsimpl0(i, Enter) ? "Enter" : m4388equalsimpl0(i, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m4387equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4389hashCodeimpl(this.value);
    }

    public String toString() {
        return m4390toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4391unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m4392getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m4393getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m4394getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m4395getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m4396getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m4397getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m4398getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m4399getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4386constructorimpl(int i) {
        return i;
    }
}
