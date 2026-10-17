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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimerKt {
    private static ImageVector _timer;

    public static final ImageVector getTimer(Icons.Rounded rounded) {
        ImageVector imageVector = _timer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Timer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(10.0f, 3.0f, 4.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.horizontalLineToRelative(-4.0f);
        a.curveTo(9.45f, 1.0f, 9.0f, 1.45f, 9.0f, 2.0f);
        a.curveTo(9.0f, 2.55f, 9.45f, 3.0f, 10.0f, 3.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.03f, 7.39f, 0.75f, -0.75f);
        e.curveToRelative(0.38f, -0.38f, 0.39f, -1.01f, 0.0f, -1.4f);
        e.curveToRelative(0.0f, 0.0f, -0.01f, -0.01f, -0.01f, -0.01f);
        e.curveToRelative(-0.39f, -0.39f, -1.01f, -0.38f, -1.4f, 0.0f);
        e.lineToRelative(-0.75f, 0.75f);
        e.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        e.curveToRelative(-4.8f, 0.0f, -8.88f, 3.96f, -9.0f, 8.76f);
        e.curveTo(2.87f, 17.84f, 6.94f, 22.0f, 12.0f, 22.0f);
        e.curveToRelative(4.98f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        e.curveTo(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
        e.close();
        e.moveTo(13.0f, 13.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineTo(9.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(e, 13.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer = build;
        build.getClass();
        return build;
    }
}
