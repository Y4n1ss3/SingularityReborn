package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m7347toAndroidCapBeK7IIE(int i) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        return StrokeCap.m5131equalsimpl0(i, companion.m5135getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m5131equalsimpl0(i, companion.m5136getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m5131equalsimpl0(i, companion.m5137getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m7348toAndroidJoinWw9F2mQ(int i) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        return StrokeJoin.m5141equalsimpl0(i, companion.m5146getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m5141equalsimpl0(i, companion.m5147getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m5141equalsimpl0(i, companion.m5145getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
