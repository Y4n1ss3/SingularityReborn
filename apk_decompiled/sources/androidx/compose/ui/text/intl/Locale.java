package androidx.compose.ui.text.intl;

import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Locale {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final java.util.Locale platformLocale;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Locale(String str) {
        this(r1);
        java.util.Locale parseLanguageTag;
        parseLanguageTag = Locale_jvmAndAndroidKt.parseLanguageTag(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return q10.b(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    public final java.util.Locale getPlatformLocale() {
        return this.platformLocale;
    }

    public final String getRegion() {
        return this.platformLocale.getCountry();
    }

    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    public String toString() {
        return toLanguageTag();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        private Companion() {
        }
    }

    public Locale(java.util.Locale locale) {
        this.platformLocale = locale;
    }
}
