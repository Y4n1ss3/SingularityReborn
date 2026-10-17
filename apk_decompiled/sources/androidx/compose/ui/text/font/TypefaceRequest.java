package androidx.compose.ui.text.font;

import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TypefaceRequest {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final int fontStyle;
    private final int fontSynthesis;
    private final FontWeight fontWeight;
    private final Object resourceLoaderCacheKey;

    private TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i;
        this.fontSynthesis = i2;
        this.resourceLoaderCacheKey = obj;
    }

    /* renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m7214copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i3 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        if ((i3 & 4) != 0) {
            i = typefaceRequest.fontStyle;
        }
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.fontSynthesis;
        }
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        Object obj3 = obj;
        int i4 = i;
        return typefaceRequest.m7217copye1PVR60(fontFamily, fontWeight, i4, i2, obj3);
    }

    public final FontFamily component1() {
        return this.fontFamily;
    }

    public final FontWeight component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-_-LCdwA, reason: not valid java name */
    public final int m7215component3_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: component4-GVVA2EU, reason: not valid java name */
    public final int m7216component4GVVA2EU() {
        return this.fontSynthesis;
    }

    public final Object component5() {
        return this.resourceLoaderCacheKey;
    }

    /* renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m7217copye1PVR60(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        return new TypefaceRequest(fontFamily, fontWeight, i, i2, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return q10.b(this.fontFamily, typefaceRequest.fontFamily) && q10.b(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m7172equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m7183equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && q10.b(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m7218getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m7219getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int m7184hashCodeimpl = (FontSynthesis.m7184hashCodeimpl(this.fontSynthesis) + ((FontStyle.m7173hashCodeimpl(this.fontStyle) + ((this.fontWeight.hashCode() + ((fontFamily == null ? 0 : fontFamily.hashCode()) * 31)) * 31)) * 31)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return m7184hashCodeimpl + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m7174toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m7187toStringimpl(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, dq dqVar) {
        this(fontFamily, fontWeight, i, i2, obj);
    }
}
