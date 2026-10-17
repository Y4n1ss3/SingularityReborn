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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GeneratingTokensKt {
    private static ImageVector _generatingTokens;

    public static final ImageVector getGeneratingTokens(Icons.Rounded rounded) {
        ImageVector imageVector = _generatingTokens;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GeneratingTokens", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.curveTo(17.0f, 7.58f, 13.42f, 4.0f, 9.0f, 4.0f);
        b.close();
        b.moveTo(9.0f, 15.5f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-4.0f);
        b.horizontalLineTo(6.75f);
        b.curveTo(6.34f, 10.5f, 6.0f, 10.16f, 6.0f, 9.75f);
        b.reflectiveCurveTo(6.34f, 9.0f, 6.75f, 9.0f);
        b.horizontalLineToRelative(4.5f);
        b.curveTo(11.66f, 9.0f, 12.0f, 9.34f, 12.0f, 9.75f);
        b.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        b.horizontalLineTo(10.0f);
        b.verticalLineToRelative(4.0f);
        b.curveTo(10.0f, 15.05f, 9.55f, 15.5f, 9.0f, 15.5f);
        k4.r(b, 20.25f, 3.75f, 22.0f, 4.54f);
        b.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        b.lineToRelative(-1.75f, 0.79f);
        b.lineTo(19.46f, 8.0f);
        b.curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f);
        b.lineToRelative(-0.79f, -1.75f);
        b.lineTo(16.0f, 5.46f);
        b.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        b.lineToRelative(1.75f, -0.79f);
        b.lineTo(18.54f, 2.0f);
        b.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        uo.l(b, 20.25f, 3.75f, 20.25f, 17.75f);
        b.lineTo(22.0f, 18.54f);
        b.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        b.lineToRelative(-1.75f, 0.79f);
        b.lineTo(19.46f, 22.0f);
        b.curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f);
        b.lineToRelative(-0.79f, -1.75f);
        b.lineTo(16.0f, 19.46f);
        b.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        b.lineToRelative(1.75f, -0.79f);
        b.lineTo(18.54f, 16.0f);
        b.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 20.25f, 17.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _generatingTokens = build;
        build.getClass();
        return build;
    }
}
