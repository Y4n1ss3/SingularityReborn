package androidx.compose.material.icons.twotone;

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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentCutKt {
    private static ImageVector _contentCut;

    public static final ImageVector getContentCut(Icons.TwoTone twoTone) {
        ImageVector imageVector = _contentCut;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ContentCut", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.0f, 3.0f, -6.0f, 6.0f);
        e.lineToRelative(2.0f, 2.0f);
        gy.B(e, 7.0f, -7.0f, 22.0f, 3.0f);
        e.moveTo(10.0f, 6.0f);
        e.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        e.reflectiveCurveTo(2.0f, 3.79f, 2.0f, 6.0f);
        e.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        e.curveToRelative(0.59f, 0.0f, 1.14f, -0.13f, 1.64f, -0.36f);
        e.lineTo(10.0f, 12.0f);
        e.lineToRelative(-2.36f, 2.36f);
        e.curveTo(7.14f, 14.13f, 6.59f, 14.0f, 6.0f, 14.0f);
        e.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        e.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        e.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        e.curveToRelative(0.0f, -0.59f, -0.13f, -1.14f, -0.36f, -1.64f);
        e.lineTo(12.0f, 14.0f);
        r6.q(e, 7.0f, 7.0f, 3.0f, -1.0f);
        e.lineTo(9.64f, 7.64f);
        e.curveToRelative(0.23f, -0.5f, 0.36f, -1.05f, 0.36f, -1.64f);
        e.close();
        e.moveTo(6.0f, 8.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        e.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        e.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        e.close();
        e.moveTo(6.0f, 20.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        e.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        e.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        e.close();
        e.moveTo(12.0f, 11.5f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        e.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        e.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, 0.22f, -0.5f, 0.5f, -0.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contentCut = build;
        build.getClass();
        return build;
    }
}
