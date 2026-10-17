package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import defpackage.er;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    @er
    public static final Paragraph ActualParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics = new AndroidParagraphIntrinsics(str, textStyle, list, list2, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), density);
        TextOverflow.Companion companion = TextOverflow.Companion;
        return new AndroidParagraph(androidParagraphIntrinsics, i, z ? companion.m7547getEllipsisgIe3tQ8() : companion.m7546getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), null);
    }

    /* renamed from: ActualParagraph-4FmOz70, reason: not valid java name */
    public static final Paragraph m7320ActualParagraph4FmOz70(ParagraphIntrinsics paragraphIntrinsics, int i, int i2, long j) {
        paragraphIntrinsics.getClass();
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i, i2, j, null);
    }

    /* renamed from: ActualParagraph-XGqx6AY, reason: not valid java name */
    public static final Paragraph m7321ActualParagraphXGqx6AY(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, int i2, long j, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, i2, j, null);
    }
}
