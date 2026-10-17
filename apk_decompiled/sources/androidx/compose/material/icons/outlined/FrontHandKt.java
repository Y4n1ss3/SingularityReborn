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
import defpackage.bv;
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FrontHandKt {
    private static ImageVector _frontHand;

    public static final ImageVector getFrontHand(Icons.Outlined outlined) {
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FrontHand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 8.0f);
        b.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        b.verticalLineTo(4.5f);
        b.curveTo(18.0f, 3.12f, 16.88f, 2.0f, 15.5f, 2.0f);
        b.curveToRelative(-0.19f, 0.0f, -0.37f, 0.02f, -0.54f, 0.06f);
        b.curveTo(14.75f, 0.89f, 13.73f, 0.0f, 12.5f, 0.0f);
        b.curveToRelative(-1.06f, 0.0f, -1.96f, 0.66f, -2.33f, 1.59f);
        b.curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f);
        b.curveTo(8.12f, 1.5f, 7.0f, 2.62f, 7.0f, 4.0f);
        b.verticalLineToRelative(0.55f);
        b.curveTo(6.84f, 4.52f, 6.67f, 4.5f, 6.5f, 4.5f);
        b.curveTo(5.12f, 4.5f, 4.0f, 5.62f, 4.0f, 7.0f);
        b.verticalLineToRelative(8.5f);
        b.curveToRelative(0.0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f);
        b.reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f);
        b.verticalLineToRelative(-5.0f);
        b.curveTo(21.0f, 9.12f, 19.88f, 8.0f, 18.5f, 8.0f);
        b.close();
        b.moveTo(19.0f, 15.5f);
        b.curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f);
        b.reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f);
        b.verticalLineTo(7.0f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f);
        bv.x(b, 5.0f, 2.0f, 4.0f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f);
        bv.x(b, 7.0f, 2.0f, 2.5f);
        b.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        b.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        uf.z(b, 11.0f, 2.0f, 4.5f);
        b.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        b.reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f);
        b.verticalLineToRelative(8.92f);
        b.curveToRelative(-1.77f, 0.77f, -3.0f, 2.53f, -3.0f, 4.58f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        b.verticalLineToRelative(-4.5f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = build;
        build.getClass();
        return build;
    }
}
