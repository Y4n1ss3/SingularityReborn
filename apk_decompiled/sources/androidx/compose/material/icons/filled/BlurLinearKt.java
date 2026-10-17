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
public final class BlurLinearKt {
    private static ImageVector _blurLinear;

    public static final ImageVector getBlurLinear(Icons.Filled filled) {
        ImageVector imageVector = _blurLinear;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BlurLinear", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.0f, 17.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        b.close();
        b.moveTo(9.0f, 13.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.close();
        b.moveTo(9.0f, 9.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        r6.B(b, 3.0f, 21.0f, 18.0f, -2.0f);
        bv.r(b, 3.0f, 19.0f, 2.0f);
        b.moveTo(5.0f, 9.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveTo(5.83f, 6.5f, 5.0f, 6.5f);
        b.reflectiveCurveTo(3.5f, 7.17f, 3.5f, 8.0f);
        b.reflectiveCurveTo(4.17f, 9.5f, 5.0f, 9.5f);
        b.close();
        b.moveTo(5.0f, 13.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        b.close();
        b.moveTo(9.0f, 17.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.close();
        b.moveTo(17.0f, 16.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        uo.C(b, 3.0f, 3.0f, 2.0f, 18.0f);
        r6.C(b, 21.0f, 3.0f, 3.0f, 3.0f);
        b.moveTo(17.0f, 8.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.close();
        b.moveTo(17.0f, 12.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.close();
        b.moveTo(13.0f, 9.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.close();
        b.moveTo(13.0f, 13.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.close();
        b.moveTo(13.0f, 17.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.45f, 1.0f, 1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blurLinear = build;
        build.getClass();
        return build;
    }
}
