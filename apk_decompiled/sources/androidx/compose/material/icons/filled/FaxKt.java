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
import defpackage.bv;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FaxKt {
    private static ImageVector _fax;

    public static final ImageVector getFax(Icons.Filled filled) {
        ImageVector imageVector = _fax;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Fax", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(19.0f, 9.0f, -1.0f, 4.0f, 8.0f);
        v.verticalLineToRelative(14.5f);
        v.verticalLineTo(20.0f);
        v.horizontalLineToRelative(14.0f);
        v.verticalLineToRelative(-8.0f);
        v.curveTo(22.0f, 10.34f, 20.66f, 9.0f, 19.0f, 9.0f);
        r6.B(v, 10.0f, 6.0f, 6.0f, 3.0f);
        uo.r(v, -6.0f, 6.0f, 14.0f, 17.0f);
        bv.l(v, -4.0f, -5.0f, 4.0f, 17.0f);
        v.moveTo(16.0f, 17.0f);
        v.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        v.curveTo(17.0f, 16.55f, 16.55f, 17.0f, 16.0f, 17.0f);
        v.close();
        v.moveTo(16.0f, 14.0f);
        v.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        v.curveTo(17.0f, 13.55f, 16.55f, 14.0f, 16.0f, 14.0f);
        v.close();
        v.moveTo(19.0f, 17.0f);
        v.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        v.curveTo(20.0f, 16.55f, 19.55f, 17.0f, 19.0f, 17.0f);
        v.close();
        v.moveTo(19.0f, 14.0f);
        v.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        v.curveTo(20.0f, 13.55f, 19.55f, 14.0f, 19.0f, 14.0f);
        v.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, v.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.5f, 8.0f);
        b.curveTo(3.12f, 8.0f, 2.0f, 9.12f, 2.0f, 10.5f);
        b.verticalLineToRelative(8.0f);
        b.curveTo(2.0f, 19.88f, 3.12f, 21.0f, 4.5f, 21.0f);
        b.reflectiveCurveTo(7.0f, 19.88f, 7.0f, 18.5f);
        b.verticalLineToRelative(-8.0f);
        b.curveTo(7.0f, 9.12f, 5.88f, 8.0f, 4.5f, 8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fax = build;
        build.getClass();
        return build;
    }
}
