package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, int i4, dq dqVar) {
        this(i, r2, r3, (i4 & 8) != 0 ? FontVariation.INSTANCE.m7195Settings6EWAqTQ(r2, r3, new FontVariation.Setting[0]) : settings, (i4 & 16) != 0 ? FontLoadingStrategy.Companion.m7163getAsyncPKNRLFQ() : i3, null);
        FontWeight normal = (i4 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight;
        int m7179getNormal_LCdwA = (i4 & 4) != 0 ? FontStyle.Companion.m7179getNormal_LCdwA() : i2;
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m7209copyF3nL8kk$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i4 & 4) != 0) {
            i2 = resourceFont.mo7125getStyle_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = resourceFont.mo7117getLoadingStrategyPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i5 = i2;
        return resourceFont.m7212copyF3nL8kk(i, fontWeight, i5, i3, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m7210copyRetOiIg$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.mo7125getStyle_LCdwA();
        }
        return resourceFont.m7213copyRetOiIg(i, fontWeight, i2);
    }

    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m7212copyF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        return new ResourceFont(i, fontWeight, i2, settings, i3, null);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m7213copyRetOiIg(int i, FontWeight fontWeight, int i2) {
        return m7209copyF3nL8kk$default(this, i, fontWeight, i2, mo7117getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && q10.b(getWeight(), resourceFont.getWeight()) && FontStyle.m7172equalsimpl0(mo7125getStyle_LCdwA(), resourceFont.mo7125getStyle_LCdwA()) && q10.b(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m7159equalsimpl0(mo7117getLoadingStrategyPKNRLFQ(), resourceFont.mo7117getLoadingStrategyPKNRLFQ());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo7117getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo7125getStyle_LCdwA() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.variationSettings.hashCode() + ((FontLoadingStrategy.m7160hashCodeimpl(mo7117getLoadingStrategyPKNRLFQ()) + ((FontStyle.m7173hashCodeimpl(mo7125getStyle_LCdwA()) + ((getWeight().hashCode() + (this.resId * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m7174toStringimpl(mo7125getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m7161toStringimpl(mo7117getLoadingStrategyPKNRLFQ())) + ')';
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m7211getLoadingStrategyPKNRLFQ$annotations() {
    }

    private ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = settings;
        this.loadingStrategy = i3;
    }

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, dq dqVar) {
        this(i, fontWeight, i2, settings, i3);
    }
}
