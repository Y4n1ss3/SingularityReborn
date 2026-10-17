package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import defpackage.er;
import defpackage.g30;
import defpackage.g40;
import defpackage.iy;
import defpackage.ut;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final g30 maxIntrinsicWidth$delegate;
    private final g30 minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, FontFamily.Resolver resolver) {
        List localPlaceholders;
        this.annotatedString = annotatedString;
        this.placeholders = list;
        final int i = 0;
        iy iyVar = new iy(this) { // from class: ha0
            public final /* synthetic */ MultiParagraphIntrinsics e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                float minIntrinsicWidth_delegate$lambda$0;
                int i2 = i;
                MultiParagraphIntrinsics multiParagraphIntrinsics = this.e;
                switch (i2) {
                    case 0:
                        minIntrinsicWidth_delegate$lambda$0 = MultiParagraphIntrinsics.minIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics);
                        break;
                    default:
                        minIntrinsicWidth_delegate$lambda$0 = MultiParagraphIntrinsics.maxIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics);
                        break;
                }
                return Float.valueOf(minIntrinsicWidth_delegate$lambda$0);
            }
        };
        g40 g40Var = g40.e;
        this.minIntrinsicWidth$delegate = y80.B(g40Var, iyVar);
        final int i2 = 1;
        this.maxIntrinsicWidth$delegate = y80.B(g40Var, new iy(this) { // from class: ha0
            public final /* synthetic */ MultiParagraphIntrinsics e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                float minIntrinsicWidth_delegate$lambda$0;
                int i22 = i2;
                MultiParagraphIntrinsics multiParagraphIntrinsics = this.e;
                switch (i22) {
                    case 0:
                        minIntrinsicWidth_delegate$lambda$0 = MultiParagraphIntrinsics.minIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics);
                        break;
                    default:
                        minIntrinsicWidth_delegate$lambda$0 = MultiParagraphIntrinsics.maxIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics);
                        break;
                }
                return Float.valueOf(minIntrinsicWidth_delegate$lambda$0);
            }
        });
        ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        while (i < size) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i);
            AnnotatedString substringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd());
            ParagraphStyle resolveTextDirection = resolveTextDirection(range.getItem(), paragraphStyle);
            String text = substringWithoutParagraphStyles.getText();
            TextStyle merge = textStyle.merge(resolveTextDirection);
            List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text = substringWithoutParagraphStyles.getAnnotations$ui_text();
            if (annotations$ui_text == null) {
                annotations$ui_text = ut.d;
            }
            localPlaceholders = MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd());
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(text, merge, annotations$ui_text, density, resolver, (List<AnnotatedString.Range<Placeholder>>) localPlaceholders), range.getStart(), range.getEnd()));
            i++;
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float maxIntrinsicWidth_delegate$lambda$0(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        ParagraphIntrinsics intrinsics;
        List<ParagraphIntrinsicInfo> list = multiParagraphIntrinsics.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
            int i = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                    if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        maxIntrinsicWidth = maxIntrinsicWidth2;
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.getMaxIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float minIntrinsicWidth_delegate$lambda$0(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        ParagraphIntrinsics intrinsics;
        List<ParagraphIntrinsicInfo> list = multiParagraphIntrinsics.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
            int i = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                    if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        minIntrinsicWidth = minIntrinsicWidth2;
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.getMinIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        return !TextDirection.m7502equalsimpl0(paragraphStyle.m6967getTextDirections_7Xco(), TextDirection.Companion.m7511getUnspecifieds_7Xco()) ? paragraphStyle : ParagraphStyle.m6949copyykzQM6k$default(paragraphStyle, 0, paragraphStyle2.m6967getTextDirections_7Xco(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text() {
        return this.infoList;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @er
    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, Font.ResourceLoader resourceLoader) {
        this(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }
}
