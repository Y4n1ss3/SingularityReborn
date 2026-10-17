package androidx.compose.material.icons.filled;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonitorHeartKt {
    private static ImageVector _monitorHeart;

    public static final ImageVector getMonitorHeart(Icons.Filled filled) {
        ImageVector imageVector = _monitorHeart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MonitorHeart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.11f, 12.45f, 14.0f, 10.24f);
        i.lineToRelative(-3.11f, 6.21f);
        i.curveTo(10.73f, 16.79f, 10.38f, 17.0f, 10.0f, 17.0f);
        i.reflectiveCurveToRelative(-0.73f, -0.21f, -0.89f, -0.55f);
        r6.w(i, 7.38f, 13.0f, 2.0f, 5.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineToRelative(-5.0f);
        i.horizontalLineToRelative(-6.0f);
        i.curveTo(15.62f, 13.0f, 15.27f, 12.79f, 15.11f, 12.45f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(5.0f);
        d.horizontalLineToRelative(6.0f);
        d.curveToRelative(0.38f, 0.0f, 0.73f, 0.21f, 0.89f, 0.55f);
        d.lineTo(10.0f, 13.76f);
        d.lineToRelative(3.11f, -6.21f);
        d.curveToRelative(0.34f, -0.68f, 1.45f, -0.68f, 1.79f, 0.0f);
        fc.v(d, 16.62f, 11.0f, 22.0f, 6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monitorHeart = build;
        build.getClass();
        return build;
    }
}
