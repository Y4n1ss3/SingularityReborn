package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import defpackage.er;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ParagraphIntrinsicsKt {
    @er
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, Font.ResourceLoader resourceLoader) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, Font.ResourceLoader resourceLoader, int i, Object obj) {
        int i2 = i & 4;
        ut utVar = ut.d;
        if (i2 != 0) {
            list = utVar;
        }
        if ((i & 8) != 0) {
            list2 = utVar;
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list, (List<AnnotatedString.Range<Placeholder>>) list2, density, resourceLoader);
    }

    @er
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list2) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, FontFamily.Resolver resolver, int i, Object obj) {
        int i2 = i & 4;
        ut utVar = ut.d;
        if (i2 != 0) {
            list = utVar;
        }
        if ((i & 8) != 0) {
            list2 = utVar;
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list, (List<AnnotatedString.Range<Placeholder>>) list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver, List list2, int i, Object obj) {
        if ((i & 32) != 0) {
            list2 = ut.d;
        }
        return ParagraphIntrinsics(str, textStyle, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list2);
    }
}
