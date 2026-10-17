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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrStrongKt {
    private static ImageVector _hdrStrong;

    public static final ImageVector getHdrStrong(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hdrStrong;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HdrStrong", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 8.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.79f, -4.0f, -4.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.0f, 6.0f);
        b2.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        b2.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        b2.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        b2.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        b2.close();
        b2.moveTo(17.0f, 16.0f);
        b2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b2.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        b2.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        b2.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        b2.close();
        b2.moveTo(5.0f, 16.0f);
        b2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b2.reflectiveCurveTo(7.21f, 8.0f, 5.0f, 8.0f);
        b2.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        b2.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b2.close();
        b2.moveTo(5.0f, 10.0f);
        b2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b2.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b2, 0.9f, -2.0f, 2.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrStrong = build;
        build.getClass();
        return build;
    }
}
