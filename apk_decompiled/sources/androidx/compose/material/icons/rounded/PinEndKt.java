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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinEndKt {
    private static ImageVector _pinEnd;

    public static final ImageVector getPinEnd(Icons.Rounded rounded) {
        ImageVector imageVector = _pinEnd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PinEnd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(20.0f, 12.0f, 6.0f, 4.0f, 12.0f);
        r6.t(f, 10.0f, 0.0f, 2.0f, 4.0f);
        f.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        f.verticalLineTo(6.0f);
        f.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        f.horizontalLineToRelative(16.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        kf0.n(f, 6.0f, 20.0f, 19.0f, 14.0f);
        f.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        f.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        f.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        f.reflectiveCurveTo(20.66f, 14.0f, 19.0f, 14.0f);
        f.close();
        f.moveTo(14.66f, 13.66f);
        f.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f.lineToRelative(-2.12f, -2.12f);
        f.lineToRelative(1.27f, -1.27f);
        f.curveTo(14.12f, 8.54f, 13.9f, 8.0f, 13.45f, 8.0f);
        f.horizontalLineTo(9.5f);
        f.curveTo(9.22f, 8.0f, 9.0f, 8.22f, 9.0f, 8.5f);
        f.verticalLineToRelative(3.95f);
        f.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        f.lineToRelative(1.27f, -1.27f);
        f.lineToRelative(2.12f, 2.12f);
        f.curveTo(13.63f, 14.05f, 14.27f, 14.05f, 14.66f, 13.66f);
        f.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, f.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinEnd = build;
        build.getClass();
        return build;
    }
}
