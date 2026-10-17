package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import defpackage.er;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @er
    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m7321ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z ? companion.m7547getEllipsisgIe3tQ8() : companion.m7546getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null), density, resolver);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, Object obj) {
        int i3 = i2 & 4;
        ut utVar = ut.d;
        if (i3 != 0) {
            list = utVar;
        }
        if ((i2 & 8) != 0) {
            list2 = utVar;
        }
        if ((i2 & 16) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 32) != 0) {
            z = false;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list, (List<AnnotatedString.Range<Placeholder>>) list2, i, z, f, density, resourceLoader);
    }

    @er
    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m6937ParagraphUdtVg6A(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m7321ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z ? companion.m7547getEllipsisgIe3tQ8() : companion.m7546getClipgIe3tQ8(), j, density, resolver);
    }

    /* renamed from: Paragraph-UdtVg6A$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6938ParagraphUdtVg6A$default(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z, int i2, Object obj) {
        int i3 = i2 & 32;
        ut utVar = ut.d;
        if (i3 != 0) {
            list = utVar;
        }
        if ((i2 & 64) != 0) {
            list2 = utVar;
        }
        if ((i2 & Fields.SpotShadowColor) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & Fields.RotationX) != 0) {
            z = false;
        }
        return m6937ParagraphUdtVg6A(str, textStyle, j, density, resolver, list, list2, i, z);
    }

    /* renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m6939ParagraphUl8oQg4(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m7321ActualParagraphXGqx6AY(str, textStyle, list, list2, i, i2, j, density, resolver);
    }

    /* renamed from: Paragraph-Ul8oQg4$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6940ParagraphUl8oQg4$default(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, int i2, int i3, Object obj) {
        int i4 = i3 & 32;
        ut utVar = ut.d;
        if (i4 != 0) {
            list = utVar;
        }
        if ((i3 & 64) != 0) {
            list2 = utVar;
        }
        if ((i3 & Fields.SpotShadowColor) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & Fields.RotationX) != 0) {
            i2 = TextOverflow.Companion.m7546getClipgIe3tQ8();
        }
        return m6939ParagraphUl8oQg4(str, textStyle, j, density, resolver, list, list2, i, i2);
    }

    @er
    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m6941Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m7320ActualParagraph4FmOz70(paragraphIntrinsics, i, z ? TextOverflow.Companion.m7547getEllipsisgIe3tQ8() : TextOverflow.Companion.m7546getClipgIe3tQ8(), j);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6942Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return m6941Paragraph_EkL_Y(paragraphIntrinsics, j, i, z);
    }

    /* renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m6943ParagraphczeNHc(ParagraphIntrinsics paragraphIntrinsics, long j, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m7320ActualParagraph4FmOz70(paragraphIntrinsics, i, i2, j);
    }

    /* renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m6944ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = TextOverflow.Companion.m7546getClipgIe3tQ8();
        }
        return m6943ParagraphczeNHc(paragraphIntrinsics, j, i, i2);
    }

    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z, int i2, Object obj) {
        int i3 = i2 & 32;
        ut utVar = ut.d;
        if (i3 != 0) {
            list = utVar;
        }
        if ((i2 & 64) != 0) {
            list2 = utVar;
        }
        if ((i2 & Fields.SpotShadowColor) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & Fields.RotationX) != 0) {
            z = false;
        }
        return Paragraph(str, textStyle, f, density, resolver, (List<AnnotatedString.Range<SpanStyle>>) list, (List<AnnotatedString.Range<Placeholder>>) list2, i, z);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Paragraph(paragraphIntrinsics, i, z, f);
    }

    @er
    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i, z, f, density, resourceLoader);
    }

    @er
    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m7320ActualParagraph4FmOz70(paragraphIntrinsics, i, z ? TextOverflow.Companion.m7547getEllipsisgIe3tQ8() : TextOverflow.Companion.m7546getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null));
    }
}
