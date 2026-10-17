package androidx.compose.ui.text;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformSpanStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformSpanStyle Default = new PlatformSpanStyle();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof PlatformSpanStyle);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "PlatformSpanStyle()";
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final PlatformSpanStyle getDefault() {
            return PlatformSpanStyle.Default;
        }

        private Companion() {
        }
    }

    public final PlatformSpanStyle merge(PlatformSpanStyle platformSpanStyle) {
        return this;
    }
}
