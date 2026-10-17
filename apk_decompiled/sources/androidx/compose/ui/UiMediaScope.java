package androidx.compose.ui;

import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface UiMediaScope {
    boolean getHasCamera();

    boolean getHasMicrophone();

    /* renamed from: getKeyboardKind-J9_QTjY, reason: not valid java name */
    String mo4201getKeyboardKindJ9_QTjY();

    /* renamed from: getPointerPrecision-fpxItnM, reason: not valid java name */
    String mo4202getPointerPrecisionfpxItnM();

    /* renamed from: getViewingDistance-tKro-MQ, reason: not valid java name */
    String mo4203getViewingDistancetKroMQ();

    /* renamed from: getWindowHeight-D9Ej5fM, reason: not valid java name */
    float mo4204getWindowHeightD9Ej5fM();

    /* renamed from: getWindowPosture-m18o9QQ, reason: not valid java name */
    String mo4205getWindowPosturem18o9QQ();

    /* renamed from: getWindowWidth-D9Ej5fM, reason: not valid java name */
    float mo4206getWindowWidthD9Ej5fM();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class KeyboardKind {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Physical = m4208constructorimpl("Physical");
        private static final String Virtual = m4208constructorimpl("Virtual");
        private static final String None = m4208constructorimpl("None");

        private /* synthetic */ KeyboardKind(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ KeyboardKind m4207boximpl(String str) {
            return new KeyboardKind(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4209equalsimpl(String str, Object obj) {
            return (obj instanceof KeyboardKind) && q10.b(str, ((KeyboardKind) obj).m4213unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4210equalsimpl0(String str, String str2) {
            return q10.b(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4211hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m4209equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m4211hashCodeimpl(this.description);
        }

        public String toString() {
            return m4212toStringimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m4213unboximpl() {
            return this.description;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getNone-J9_QTjY, reason: not valid java name */
            public final String m4214getNoneJ9_QTjY() {
                return KeyboardKind.None;
            }

            /* renamed from: getPhysical-J9_QTjY, reason: not valid java name */
            public final String m4215getPhysicalJ9_QTjY() {
                return KeyboardKind.Physical;
            }

            /* renamed from: getVirtual-J9_QTjY, reason: not valid java name */
            public final String m4216getVirtualJ9_QTjY() {
                return KeyboardKind.Virtual;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m4208constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4212toStringimpl(String str) {
            return str;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PointerPrecision {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Fine = m4218constructorimpl("Fine");
        private static final String Coarse = m4218constructorimpl("Coarse");
        private static final String Blunt = m4218constructorimpl("Blunt");
        private static final String None = m4218constructorimpl("None");

        private /* synthetic */ PointerPrecision(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PointerPrecision m4217boximpl(String str) {
            return new PointerPrecision(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4219equalsimpl(String str, Object obj) {
            return (obj instanceof PointerPrecision) && q10.b(str, ((PointerPrecision) obj).m4223unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4220equalsimpl0(String str, String str2) {
            return q10.b(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4221hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m4219equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m4221hashCodeimpl(this.description);
        }

        public String toString() {
            return m4222toStringimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m4223unboximpl() {
            return this.description;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getBlunt-fpxItnM, reason: not valid java name */
            public final String m4224getBluntfpxItnM() {
                return PointerPrecision.Blunt;
            }

            /* renamed from: getCoarse-fpxItnM, reason: not valid java name */
            public final String m4225getCoarsefpxItnM() {
                return PointerPrecision.Coarse;
            }

            /* renamed from: getFine-fpxItnM, reason: not valid java name */
            public final String m4226getFinefpxItnM() {
                return PointerPrecision.Fine;
            }

            /* renamed from: getNone-fpxItnM, reason: not valid java name */
            public final String m4227getNonefpxItnM() {
                return PointerPrecision.None;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m4218constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4222toStringimpl(String str) {
            return str;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Posture {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Flat = m4229constructorimpl("Flat");
        private static final String Tabletop = m4229constructorimpl("Tabletop");
        private static final String Book = m4229constructorimpl("Book");

        private /* synthetic */ Posture(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Posture m4228boximpl(String str) {
            return new Posture(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4230equalsimpl(String str, Object obj) {
            return (obj instanceof Posture) && q10.b(str, ((Posture) obj).m4234unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4231equalsimpl0(String str, String str2) {
            return q10.b(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4232hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m4230equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m4232hashCodeimpl(this.description);
        }

        public String toString() {
            return m4233toStringimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m4234unboximpl() {
            return this.description;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getBook-m18o9QQ, reason: not valid java name */
            public final String m4235getBookm18o9QQ() {
                return Posture.Book;
            }

            /* renamed from: getFlat-m18o9QQ, reason: not valid java name */
            public final String m4236getFlatm18o9QQ() {
                return Posture.Flat;
            }

            /* renamed from: getTabletop-m18o9QQ, reason: not valid java name */
            public final String m4237getTabletopm18o9QQ() {
                return Posture.Tabletop;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m4229constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4233toStringimpl(String str) {
            return str;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ViewingDistance {
        private final String description;
        public static final Companion Companion = new Companion(null);
        private static final String Near = m4239constructorimpl("Near");
        private static final String Medium = m4239constructorimpl("Medium");
        private static final String Far = m4239constructorimpl("Far");

        private /* synthetic */ ViewingDistance(String str) {
            this.description = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ViewingDistance m4238boximpl(String str) {
            return new ViewingDistance(str);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4240equalsimpl(String str, Object obj) {
            return (obj instanceof ViewingDistance) && q10.b(str, ((ViewingDistance) obj).m4244unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4241equalsimpl0(String str, String str2) {
            return q10.b(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4242hashCodeimpl(String str) {
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            return m4240equalsimpl(this.description, obj);
        }

        public int hashCode() {
            return m4242hashCodeimpl(this.description);
        }

        public String toString() {
            return m4243toStringimpl(this.description);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m4244unboximpl() {
            return this.description;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getFar-tKro-MQ, reason: not valid java name */
            public final String m4245getFartKroMQ() {
                return ViewingDistance.Far;
            }

            /* renamed from: getMedium-tKro-MQ, reason: not valid java name */
            public final String m4246getMediumtKroMQ() {
                return ViewingDistance.Medium;
            }

            /* renamed from: getNear-tKro-MQ, reason: not valid java name */
            public final String m4247getNeartKroMQ() {
                return ViewingDistance.Near;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static String m4239constructorimpl(String str) {
            return str;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4243toStringimpl(String str) {
            return str;
        }
    }
}
