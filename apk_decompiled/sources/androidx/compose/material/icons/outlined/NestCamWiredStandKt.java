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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NestCamWiredStandKt {
    private static ImageVector _nestCamWiredStand;

    public static final ImageVector getNestCamWiredStand(Icons.Outlined outlined) {
        ImageVector imageVector = _nestCamWiredStand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NestCamWiredStand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 1.0f);
        b.curveToRelative(-0.15f, 0.0f, 0.11f, -0.02f, -4.28f, 0.42f);
        b.curveTo(8.47f, 1.75f, 6.0f, 4.48f, 6.0f, 7.75f);
        b.reflectiveCurveToRelative(2.47f, 6.0f, 5.72f, 6.33f);
        b.lineToRelative(1.9f, 0.19f);
        b.lineToRelative(-0.56f, 0.85f);
        b.curveTo(12.71f, 15.04f, 12.36f, 15.0f, 12.0f, 15.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -1.67f, -0.83f, -3.15f, -2.09f, -4.06f);
        b.lineToRelative(0.97f, -1.45f);
        b.curveToRelative(0.04f, 0.0f, 0.09f, 0.01f, 0.13f, 0.01f);
        b.curveToRelative(1.09f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        b.verticalLineTo(3.0f);
        b.curveTo(18.0f, 1.89f, 17.09f, 1.0f, 16.0f, 1.0f);
        uo.q(b, 15.0f, 21.0f, 9.0f, -1.0f);
        b.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        b.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        bv.t(b, 21.0f, 8.0f, 7.75f);
        b.curveToRelative(0.0f, -2.25f, 1.69f, -4.11f, 3.92f, -4.34f);
        b.lineTo(16.0f, 3.0f);
        b.horizontalLineToRelative(0.0f);
        b.lineToRelative(0.03f, 9.5f);
        b.lineToRelative(-4.11f, -0.42f);
        b.curveTo(9.69f, 11.86f, 8.0f, 10.0f, 8.0f, 7.75f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nestCamWiredStand = build;
        build.getClass();
        return build;
    }
}
