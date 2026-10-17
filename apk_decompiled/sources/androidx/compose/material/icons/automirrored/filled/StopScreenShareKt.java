package androidx.compose.material.icons.automirrored.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.StopScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.22f, 18.02f, 2.0f, 2.0f);
        kp0.x(e, 24.0f, 20.02f, -2.0f, -2.78f);
        e.moveTo(21.99f, 16.02f);
        e.lineToRelative(0.01f, -10.0f);
        e.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.lineTo(7.22f, 4.02f);
        e.lineToRelative(5.23f, 5.23f);
        e.curveToRelative(0.18f, -0.04f, 0.36f, -0.07f, 0.55f, -0.1f);
        e.lineTo(13.0f, 7.02f);
        e.lineToRelative(4.0f, 3.73f);
        e.lineToRelative(-1.58f, 1.47f);
        e.lineToRelative(5.54f, 5.54f);
        e.curveToRelative(0.61f, -0.33f, 1.03f, -0.99f, 1.03f, -1.74f);
        k4.r(e, 2.39f, 1.73f, 1.11f, 3.0f);
        e.lineToRelative(1.54f, 1.54f);
        e.curveToRelative(-0.4f, 0.36f, -0.65f, 0.89f, -0.65f, 1.48f);
        e.verticalLineToRelative(10.0f);
        e.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        af0.m(e, 0.0f, 18.02f, 2.0f, 18.13f);
        e.lineToRelative(2.71f, 2.71f);
        gy.B(e, 1.27f, -1.27f, 2.39f, 1.73f);
        e.moveTo(7.0f, 15.02f);
        e.curveToRelative(0.31f, -1.48f, 0.92f, -2.95f, 2.07f, -4.06f);
        e.lineToRelative(1.59f, 1.59f);
        e.curveToRelative(-1.54f, 0.38f, -2.7f, 1.18f, -3.66f, 2.47f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = build;
        build.getClass();
        return build;
    }
}
