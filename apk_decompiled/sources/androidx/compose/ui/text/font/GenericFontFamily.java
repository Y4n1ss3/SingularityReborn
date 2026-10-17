package androidx.compose.ui.text.font;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class GenericFontFamily extends SystemFontFamily {
    public static final int $stable = 0;
    private final String fontFamilyName;
    private final String name;

    public GenericFontFamily(String str, String str2) {
        super(null);
        this.name = str;
        this.fontFamilyName = str2;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return this.fontFamilyName;
    }
}
