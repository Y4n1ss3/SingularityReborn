package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextLayoutInput {
    public static final int $stable = 8;
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j) {
        this(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j);
    }

    /* renamed from: copy-hu-1Yfo$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m7024copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            annotatedString = textLayoutInput.text;
        }
        if ((i3 & 2) != 0) {
            textStyle = textLayoutInput.style;
        }
        if ((i3 & 4) != 0) {
            list = textLayoutInput.placeholders;
        }
        if ((i3 & 8) != 0) {
            i = textLayoutInput.maxLines;
        }
        if ((i3 & 16) != 0) {
            z = textLayoutInput.softWrap;
        }
        if ((i3 & 32) != 0) {
            i2 = textLayoutInput.overflow;
        }
        if ((i3 & 64) != 0) {
            density = textLayoutInput.density;
        }
        if ((i3 & Fields.SpotShadowColor) != 0) {
            layoutDirection = textLayoutInput.layoutDirection;
        }
        if ((i3 & Fields.RotationX) != 0) {
            resourceLoader = textLayoutInput.getResourceLoader();
        }
        if ((i3 & Fields.RotationY) != 0) {
            j = textLayoutInput.constraints;
        }
        long j2 = j;
        LayoutDirection layoutDirection2 = layoutDirection;
        Font.ResourceLoader resourceLoader2 = resourceLoader;
        int i4 = i2;
        Density density2 = density;
        boolean z2 = z;
        List list2 = list;
        return textLayoutInput.m7025copyhu1Yfo(annotatedString, textStyle, list2, i, z2, i4, density2, layoutDirection2, resourceLoader2, j2);
    }

    @er
    /* renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final TextLayoutInput m7025copyhu1Yfo(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j) {
        return new TextLayoutInput(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, resourceLoader, this.fontFamilyResolver, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return q10.b(this.text, textLayoutInput.text) && q10.b(this.style, textLayoutInput.style) && q10.b(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m7537equalsimpl0(this.overflow, textLayoutInput.overflow) && q10.b(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && q10.b(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m7557equalsimpl0(this.constraints, textLayoutInput.constraints);
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m7026getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m7027getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        return resourceLoader == null ? DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver) : resourceLoader;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return Constraints.m7567hashCodeimpl(this.constraints) + ((this.fontFamilyResolver.hashCode() + ((this.layoutDirection.hashCode() + ((this.density.hashCode() + ((TextOverflow.m7538hashCodeimpl(this.overflow) + kp0.c((((this.placeholders.hashCode() + kp0.b(this.text.hashCode() * 31, 31, this.style)) * 31) + this.maxLines) * 31, 31, this.softWrap)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m7539toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m7569toStringimpl(this.constraints)) + ')';
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j, dq dqVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i, z, i2, density, layoutDirection, resolver, j);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i;
        this.softWrap = z;
        this.overflow = i2;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    @er
    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    @er
    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j, dq dqVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i, z, i2, density, layoutDirection, resourceLoader, j);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        this(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, (Font.ResourceLoader) null, resolver, j);
    }
}
