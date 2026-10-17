package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import defpackage.lu0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface Paragraph {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: getLineEnd");
            return 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return paragraph.getLineEnd(i, z);
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m6928paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj == null) {
            paragraph.mo6880paintLG529CI(canvas, (i2 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration, (i2 & 16) == 0 ? drawStyle : null, (i2 & 32) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        } else {
            lu0.a("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m6929paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
            return;
        }
        if ((i & 2) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        paragraph.mo6881paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m6930painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
            return;
        }
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        paragraph.mo6882painthn5TExg(canvas, brush, f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? DrawScope.Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo6874fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i);

    ResolvedTextDirection getBidiRunDirection(int i);

    Rect getBoundingBox(int i);

    Rect getCursorRect(int i);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i, boolean z);

    float getLastBaseline();

    float getLineBaseline(int i);

    float getLineBottom(int i);

    int getLineCount();

    int getLineEnd(int i, boolean z);

    int getLineForOffset(int i);

    int getLineForVerticalPosition(float f);

    float getLineHeight(int i);

    float getLineLeft(int i);

    float getLineRight(int i);

    int getLineStart(int i);

    float getLineTop(int i);

    float getLineWidth(int i);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo6876getOffsetForPositionk4lQ0M(long j);

    ResolvedTextDirection getParagraphDirection(int i);

    Path getPathForRange(int i, int i2);

    List<Rect> getPlaceholderRects();

    /* renamed from: getRangeForRect-8-6BmAI */
    long mo6878getRangeForRect86BmAI(Rect rect, int i, TextInclusionStrategy textInclusionStrategy);

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo6879getWordBoundaryjx7JFs(int i);

    boolean isLineEllipsized(int i);

    /* renamed from: paint-LG529CI */
    void mo6880paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i);

    /* renamed from: paint-RPmYEkk */
    void mo6881paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo6882painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i);
}
