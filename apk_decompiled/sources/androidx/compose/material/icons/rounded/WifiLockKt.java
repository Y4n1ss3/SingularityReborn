package androidx.compose.material.icons.rounded;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiLockKt {
    private static ImageVector _wifiLock;

    public static final ImageVector getWifiLock(Icons.Rounded rounded) {
        ImageVector imageVector = _wifiLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.21f, 8.24f);
        b.curveTo(20.22f, 5.6f, 16.3f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveTo(3.78f, 5.6f, 0.79f, 8.24f);
        b.curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f);
        b.lineToRelative(5.62f, 5.63f);
        b.lineToRelative(4.94f, 4.95f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        b.lineToRelative(2.34f, -2.34f);
        b.verticalLineTo(15.0f);
        b.curveToRelative(0.0f, -0.45f, 0.09f, -0.88f, 0.23f, -1.29f);
        b.curveToRelative(0.54f, -1.57f, 2.01f, -2.71f, 3.77f, -2.71f);
        b.horizontalLineToRelative(2.94f);
        b.lineToRelative(1.29f, -1.29f);
        b.curveTo(23.68f, 9.3f, 23.65f, 8.63f, 23.21f, 8.24f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 16.0f, -1.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        h.verticalLineToRelative(1.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(3.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(4.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.verticalLineToRelative(-3.0f);
        h.curveTo(23.0f, 16.45f, 22.55f, 16.0f, 22.0f, 16.0f);
        r6.B(h, 21.0f, 16.0f, -2.0f, -1.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(h, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiLock = build;
        build.getClass();
        return build;
    }
}
