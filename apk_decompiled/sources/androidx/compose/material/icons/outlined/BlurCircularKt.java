package androidx.compose.material.icons.outlined;

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
public final class BlurCircularKt {
    private static ImageVector _blurCircular;

    public static final ImageVector getBlurCircular(Icons.Outlined outlined) {
        ImageVector imageVector = _blurCircular;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BlurCircular", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.0f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        b.moveTo(10.0f, 13.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        b.moveTo(7.0f, 9.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.close();
        b.moveTo(10.0f, 16.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.close();
        b.moveTo(7.0f, 13.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.close();
        b.moveTo(10.0f, 7.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.close();
        b.moveTo(14.0f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.close();
        b.moveTo(14.0f, 7.5f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.close();
        b.moveTo(17.0f, 13.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.close();
        b.moveTo(17.0f, 9.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.close();
        b.moveTo(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        b.close();
        b.moveTo(14.0f, 16.5f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        b.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f);
        b.close();
        b.moveTo(14.0f, 13.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.45f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blurCircular = build;
        build.getClass();
        return build;
    }
}
