package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import defpackage.dj;
import defpackage.dq;
import defpackage.er;
import defpackage.ga0;
import defpackage.gi0;
import defpackage.hi0;
import defpackage.j50;
import defpackage.kp0;
import defpackage.ut;
import defpackage.ve;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2) {
        boolean z;
        int m7563getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (Constraints.m7566getMinWidthimpl(j) != 0 || Constraints.m7565getMinHeightimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text = multiParagraphIntrinsics.getInfoList$ui_text();
        int size = infoList$ui_text.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text.get(i4);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
            if (Constraints.m7559getHasBoundedHeightimpl(j)) {
                m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f);
                if (m7563getMaxHeightimpl < 0) {
                    m7563getMaxHeightimpl = 0;
                }
            } else {
                m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
            }
            Paragraph m6943ParagraphczeNHc = ParagraphKt.m6943ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, m7564getMaxWidthimpl, 0, m7563getMaxHeightimpl, 5, null), this.maxLines - i3, i2);
            float height = m6943ParagraphczeNHc.getHeight() + f;
            int lineCount = m6943ParagraphczeNHc.getLineCount() + i3;
            arrayList.add(new ParagraphInfo(m6943ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i3, lineCount, f, height));
            if (m6943ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i4 != y80.v(this.intrinsics.getInfoList$ui_text()))) {
                z = true;
                i3 = lineCount;
                f = height;
                break;
            } else {
                i4++;
                i3 = lineCount;
                f = height;
            }
        }
        z = false;
        this.height = f;
        this.lineCount = i3;
        this.didExceedMaxLines = z;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m7564getMaxWidthimpl(j);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i5);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i6 = 0; i6 < size3; i6++) {
                Rect rect = placeholderRects.get(i6);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            dj.d0(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = yi.A0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 fillBoundingBoxes_8ffj60Q$lambda$0(long j, float[] fArr, hi0 hi0Var, gi0 gi0Var, ParagraphInfo paragraphInfo) {
        long TextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m7058getMinimpl(j) ? paragraphInfo.getStartIndex() : TextRange.m7058getMinimpl(j)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m7057getMaximpl(j) ? paragraphInfo.getEndIndex() : TextRange.m7057getMaximpl(j)));
        paragraphInfo.getParagraph().mo6874fillBoundingBoxes8ffj60Q(TextRange, fArr, hi0Var.d);
        int m7056getLengthimpl = (TextRange.m7056getLengthimpl(TextRange) * 4) + hi0Var.d;
        for (int i = hi0Var.d; i < m7056getLengthimpl; i += 4) {
            int i2 = i + 1;
            float f = fArr[i2];
            float f2 = gi0Var.d;
            fArr[i2] = f + f2;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + f2;
        }
        hi0Var.d = m7056getLengthimpl;
        gi0Var.d = paragraphInfo.getParagraph().getHeight() + gi0Var.d;
        return w01.a;
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 getPathForRange$lambda$1(Path path, int i, int i2, ParagraphInfo paragraphInfo) {
        Path.m5045addPathUv8p0NA$default(path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0L, 2, null);
        return w01.a;
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m6918paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        multiParagraph.m6925paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m6919painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        multiParagraph.m6926painthn5TExg(canvas, brush, f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    private final void requireIndexInRange(int i) {
        boolean z = false;
        if (i >= 0 && i < getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder f = kp0.f(i, "offset(", ") is out of bounds [0, ");
        f.append(getAnnotatedString().length());
        f.append(')');
        InlineClassHelperKt.throwIllegalArgumentException(f.toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int i) {
        boolean z = false;
        if (i >= 0 && i <= getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder f = kp0.f(i, "offset(", ") is out of bounds [0, ");
        f.append(getAnnotatedString().length());
        f.append(']');
        InlineClassHelperKt.throwIllegalArgumentException(f.toString());
    }

    private final void requireLineIndexInRange(int i) {
        boolean z = false;
        if (i >= 0 && i < this.lineCount) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder f = kp0.f(i, "lineIndex(", ") is out of bounds [0, ");
        f.append(this.lineCount);
        f.append(')');
        InlineClassHelperKt.throwIllegalArgumentException(f.toString());
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m6920fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i) {
        requireIndexInRange(TextRange.m7058getMinimpl(j));
        requireIndexInRangeInclusiveEnd(TextRange.m7057getMaximpl(j));
        hi0 hi0Var = new hi0();
        hi0Var.d = i;
        MultiParagraphKt.m6927findParagraphsByRangeSbBc2M(this.paragraphInfoList, j, new ve(j, fArr, hi0Var, new gi0()));
        return fArr;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? y80.v(list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i));
    }

    public final Rect getBoundingBox(int i) {
        requireIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i)));
    }

    public final Rect getCursorRect(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? y80.v(list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? y80.v(list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i), z);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) yi.v0(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBaseline(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineBottom(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i, boolean z) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i), z));
    }

    public final int getLineForOffset(int i) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i >= getAnnotatedString().length() ? y80.v(this.paragraphInfoList) : i < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i)));
    }

    public final int getLineForVerticalPosition(float f) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f)));
    }

    public final float getLineHeight(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineLeft(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineRight(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i));
    }

    public final int getLineStart(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineTop(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineWidth(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m6921getOffsetForPositionk4lQ0M(long j) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & j))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo6876getOffsetForPositionk4lQ0M(paragraphInfo.m6936toLocalMKHz9U(j)));
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? y80.v(list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(int i, int i2) {
        if (i < 0 || i > i2 || i2 > getAnnotatedString().getText().length()) {
            StringBuilder j = j50.j("Start(", i, ") or End(", i2, ") is out of range [0..");
            j.append(getAnnotatedString().getText().length());
            j.append("), or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(j.toString());
        }
        if (i == i2) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m6927findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i, i2), new ga0(i, i2, 0, Path));
        return Path;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m6922getRangeForRect86BmAI(Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int findParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(findParagraphByY).getBottom() >= rect.getBottom() || findParagraphByY == y80.v(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
            return ParagraphInfo.m6934toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo6878getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i, textInclusionStrategy), false, 1, null);
        }
        int findParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long m7065getZerod9O1mEE = TextRange.Companion.m7065getZerod9O1mEE();
        while (true) {
            companion = TextRange.Companion;
            if (!TextRange.m7053equalsimpl0(m7065getZerod9O1mEE, companion.m7065getZerod9O1mEE()) || findParagraphByY > findParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(findParagraphByY);
            m7065getZerod9O1mEE = ParagraphInfo.m6934toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo6878getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i, textInclusionStrategy), false, 1, null);
            findParagraphByY++;
        }
        if (TextRange.m7053equalsimpl0(m7065getZerod9O1mEE, companion.m7065getZerod9O1mEE())) {
            return companion.m7065getZerod9O1mEE();
        }
        long m7065getZerod9O1mEE2 = companion.m7065getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.Companion;
            if (!TextRange.m7053equalsimpl0(m7065getZerod9O1mEE2, companion2.m7065getZerod9O1mEE()) || findParagraphByY > findParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(findParagraphByY2);
            m7065getZerod9O1mEE2 = ParagraphInfo.m6934toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo6878getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i, textInclusionStrategy), false, 1, null);
            findParagraphByY2--;
        }
        return TextRange.m7053equalsimpl0(m7065getZerod9O1mEE2, companion2.m7065getZerod9O1mEE()) ? m7065getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m7060getStartimpl(m7065getZerod9O1mEE), TextRange.m7055getEndimpl(m7065getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m6923getWordBoundaryjx7JFs(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i == length ? y80.v(list) : MultiParagraphKt.findParagraphByIndex(list, i));
        return paragraphInfo.m6935toGlobalxdX6G0(paragraphInfo.getParagraph().mo6879getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i)), false);
    }

    public final boolean isLineEllipsized(int i) {
        requireLineIndexInRange(i);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i)).getParagraph().isLineEllipsized(i);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m6924paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().mo6880paintLG529CI(canvas, j, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @er
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m6925paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            Paragraph.m6928paintLG529CI$default(paragraphInfo.getParagraph(), canvas, j, shadow, textDecoration, null, 0, 48, null);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m6926painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        AndroidMultiParagraphDraw_androidKt.m7315drawMultiParagraph7AXcY_I(this, canvas, brush, f, shadow, textDecoration, drawStyle, i);
    }

    @er
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, dq dqVar) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, z);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, dq dqVar) {
        this(multiParagraphIntrinsics, j, i, i2);
    }

    @er
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, dq dqVar) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, int i2, dq dqVar) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, i2);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, int i2, int i3, dq dqVar) {
        this(multiParagraphIntrinsics, j, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i2, (dq) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, dq dqVar) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, (dq) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        this(multiParagraphIntrinsics, j, i, z ? TextOverflow.Companion.m7547getEllipsisgIe3tQ8() : TextOverflow.Companion.m7546getClipgIe3tQ8(), (dq) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, dq dqVar) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        this(multiParagraphIntrinsics, r8, i, z ? r0.m7547getEllipsisgIe3tQ8() : r0.m7546getClipgIe3tQ8(), (dq) null);
        long Constraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null);
        TextOverflow.Companion companion = TextOverflow.Companion;
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, dq dqVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i2 & 4) != 0 ? ut.d : list), (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        this(r0, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? r8.m7547getEllipsisgIe3tQ8() : r8.m7546getClipgIe3tQ8(), (dq) null);
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion companion = TextOverflow.Companion;
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, dq dqVar) {
        this(annotatedString, textStyle, f, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i2 & 32) != 0 ? ut.d : list), (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & Fields.SpotShadowColor) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        this(r0, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z ? r8.m7547getEllipsisgIe3tQ8() : r8.m7546getClipgIe3tQ8(), (dq) null);
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, int i2, dq dqVar) {
        this(annotatedString, textStyle, j, density, resolver, (i2 & 32) != 0 ? ut.d : list, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & Fields.SpotShadowColor) != 0 ? false : z, (dq) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        this(r0, j, i, z ? r8.m7547getEllipsisgIe3tQ8() : r8.m7546getClipgIe3tQ8(), (dq) null);
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.Companion;
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, int i2, int i3, dq dqVar) {
        this(annotatedString, textStyle, j, density, resolver, (i3 & 32) != 0 ? ut.d : list, (i3 & 64) != 0 ? Integer.MAX_VALUE : i, (i3 & Fields.SpotShadowColor) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i2, (dq) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j, i, i2, (dq) null);
    }
}
