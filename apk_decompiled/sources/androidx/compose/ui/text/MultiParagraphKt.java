package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import defpackage.hz;
import defpackage.kp0;
import defpackage.ky;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, ky kyVar) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int intValue = ((Number) kyVar.invoke(list.get(i2))).intValue();
            if (intValue < 0) {
                i = i2 + 1;
            } else {
                if (intValue <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i) {
        int i2;
        int endIndex = ((ParagraphInfo) yi.v0(list)).getEndIndex();
        boolean z = false;
        if (!(i <= ((ParagraphInfo) yi.v0(list)).getEndIndex())) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            char c = paragraphInfo.getStartIndex() > i ? (char) 1 : paragraphInfo.getEndIndex() <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            z = true;
        }
        if (!z) {
            StringBuilder f = kp0.f(i2, "Found paragraph index ", " should be in range [0, ");
            f.append(list.size());
            f.append(").\nDebug info: index=");
            f.append(i);
            f.append(", paragraphs=[");
            f.append(ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new hz(27), 31, null));
            f.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(f.toString());
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findParagraphByIndex$lambda$2$0(ParagraphInfo paragraphInfo) {
        return "[" + paragraphInfo.getStartIndex() + ", " + paragraphInfo.getEndIndex() + ')';
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            char c = paragraphInfo.getStartLineIndex() > i ? (char) 1 : paragraphInfo.getEndLineIndex() <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((ParagraphInfo) yi.v0(list)).getBottom()) {
            return list.size() - 1;
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            char c = paragraphInfo.getTop() > f ? (char) 1 : paragraphInfo.getBottom() <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m6927findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j, ky kyVar) {
        int size = list.size();
        for (int findParagraphByIndex = findParagraphByIndex(list, TextRange.m7058getMinimpl(j)); findParagraphByIndex < size; findParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(findParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m7057getMaximpl(j)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                kyVar.invoke(paragraphInfo);
            }
        }
    }
}
