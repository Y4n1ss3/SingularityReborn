package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import defpackage.iy;
import defpackage.ks0;
import defpackage.ut;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement = ks0.a0(10, "H");

    public static final long computeSizeForDefaultText(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i) {
        Paragraph m6940ParagraphUl8oQg4$default = ParagraphKt.m6940ParagraphUl8oQg4$default(str, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, ut.d, null, i, TextOverflow.Companion.m7546getClipgIe3tQ8(), 64, null);
        return IntSize.m7777constructorimpl((TextDelegateKt.ceilToIntPx(m6940ParagraphUl8oQg4$default.getMinIntrinsicWidth()) << 32) | (TextDelegateKt.ceilToIntPx(m6940ParagraphUl8oQg4$default.getHeight()) & 4294967295L));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i);
    }

    public static final Rect focusedRectInRoot(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, int i, iy iyVar) {
        Rect boundingBox = i < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(i) : i != 0 ? textLayoutResult.getBoundingBox(i - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (((IntSize) iyVar.invoke()).m7786unboximpl() & 4294967295L));
        long mo6245localToRootMKHz9U = layoutCoordinates.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getLeft()) << 32)));
        return RectKt.m4556Recttz77jQw(Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo6245localToRootMKHz9U >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo6245localToRootMKHz9U & 4294967295L))) & 4294967295L)), Size.m4576constructorimpl((Float.floatToRawIntBits(boundingBox.getBottom() - boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getRight() - boundingBox.getLeft()) << 32)));
    }

    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }
}
