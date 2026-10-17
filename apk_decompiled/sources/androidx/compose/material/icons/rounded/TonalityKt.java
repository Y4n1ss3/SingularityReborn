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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TonalityKt {
    private static ImageVector _tonality;

    public static final ImageVector getTonality(Icons.Rounded rounded) {
        ImageVector imageVector = _tonality;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Tonality", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(11.0f, 19.93f);
        b.curveToRelative(-3.94f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        b.reflectiveCurveToRelative(3.05f, -7.44f, 7.0f, -7.93f);
        r6.l(b, 15.86f, 13.0f, 4.07f);
        b.curveToRelative(1.03f, 0.13f, 2.0f, 0.45f, 2.87f, 0.93f);
        bv.r(b, 13.0f, 5.0f, -0.93f);
        b.moveTo(13.0f, 7.0f);
        b.horizontalLineToRelative(5.24f);
        b.curveToRelative(0.25f, 0.31f, 0.48f, 0.65f, 0.68f, 1.0f);
        r6.C(b, 13.0f, 8.0f, 13.0f, 7.0f);
        b.moveTo(13.0f, 10.0f);
        b.horizontalLineToRelative(6.74f);
        b.curveToRelative(0.08f, 0.33f, 0.15f, 0.66f, 0.19f, 1.0f);
        bv.r(b, 13.0f, 11.0f, -1.0f);
        b.moveTo(13.0f, 19.93f);
        b.lineTo(13.0f, 19.0f);
        b.horizontalLineToRelative(2.87f);
        b.curveToRelative(-0.87f, 0.48f, -1.84f, 0.8f, -2.87f, 0.93f);
        k4.r(b, 18.24f, 17.0f, 13.0f, 17.0f);
        b.verticalLineToRelative(-1.0f);
        b.horizontalLineToRelative(5.92f);
        b.curveToRelative(-0.2f, 0.35f, -0.43f, 0.69f, -0.68f, 1.0f);
        k4.r(b, 19.74f, 14.0f, 13.0f, 14.0f);
        b.verticalLineToRelative(-1.0f);
        b.horizontalLineToRelative(6.93f);
        b.curveToRelative(-0.04f, 0.34f, -0.11f, 0.67f, -0.19f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tonality = build;
        build.getClass();
        return build;
    }
}
