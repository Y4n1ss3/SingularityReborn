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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoCrashKt {
    private static ImageVector _noCrash;

    public static final ImageVector getNoCrash(Icons.Rounded rounded) {
        ImageVector imageVector = _noCrash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoCrash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.5f, 24.0f);
        b.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.verticalLineToRelative(-7.16f);
        b.curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f);
        b.lineToRelative(-1.97f, -5.67f);
        b.curveTo(18.72f, 8.42f, 18.16f, 8.0f, 17.5f, 8.0f);
        b.horizontalLineToRelative(-11.0f);
        b.curveTo(5.84f, 8.0f, 5.29f, 8.42f, 5.08f, 9.01f);
        b.lineToRelative(-1.97f, 5.67f);
        b.curveTo(3.04f, 14.89f, 3.0f, 15.11f, 3.0f, 15.34f);
        b.verticalLineToRelative(7.16f);
        b.curveTo(3.0f, 23.33f, 3.68f, 24.0f, 4.5f, 24.0f);
        b.reflectiveCurveTo(6.0f, 23.33f, 6.0f, 22.5f);
        kf0.r(b, 22.0f, 12.0f, 0.5f);
        b.curveTo(18.0f, 23.33f, 18.67f, 24.0f, 19.5f, 24.0f);
        af0.l(b, 6.85f, 10.0f, 10.29f);
        b.lineToRelative(1.04f, 3.0f);
        kf0.m(b, 5.81f, 6.85f, 10.0f);
        b.moveTo(6.0f, 17.5f);
        b.curveTo(6.0f, 16.67f, 6.67f, 16.0f, 7.5f, 16.0f);
        b.reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f);
        b.reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f);
        b.reflectiveCurveTo(6.0f, 18.33f, 6.0f, 17.5f);
        b.close();
        b.moveTo(15.0f, 17.5f);
        b.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f);
        b.reflectiveCurveTo(15.0f, 18.33f, 15.0f, 17.5f);
        b.close();
        b.moveTo(16.24f, 0.71f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(-3.54f, 3.54f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.lineTo(9.88f, 4.24f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineTo(12.0f, 3.54f);
        b.lineToRelative(2.83f, -2.83f);
        b.curveTo(15.22f, 0.32f, 15.85f, 0.32f, 16.24f, 0.71f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noCrash = build;
        build.getClass();
        return build;
    }
}
