package androidx.compose.material.icons.sharp;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalWifi4BarLockKt {
    private static ImageVector _signalWifi4BarLock;

    public static final ImageVector getSignalWifi4BarLock(Icons.Sharp sharp) {
        ImageVector imageVector = _signalWifi4BarLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SignalWifi4BarLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.98f, 11.0f, 24.0f, 8.98f);
        i.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        i.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        i.lineToRelative(6.35f, 6.36f);
        i.lineTo(12.0f, 21.0f);
        i.lineToRelative(3.05f, -3.05f);
        i.verticalLineTo(15.0f);
        i.curveToRelative(0.0f, -0.45f, 0.09f, -0.88f, 0.23f, -1.29f);
        i.curveToRelative(0.54f, -1.57f, 2.01f, -2.71f, 3.77f, -2.71f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 21.98f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 15.11f);
        b.curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f);
        b.curveToRelative(-0.12f, -0.02f, -0.24f, -0.02f, -0.36f, -0.02f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.0f);
        b.curveTo(18.88f, 13.03f, 18.0f, 13.91f, 18.0f, 15.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f);
        kf0.z(b, 5.0f, 6.0f, -5.0f);
        b.curveToRelative(0.0f, 0.0f, -0.45f, 0.0f, -1.0f, 0.0f);
        k4.D(b, 15.11f, 21.0f, 16.0f, -2.0f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifi4BarLock = build;
        build.getClass();
        return build;
    }
}
