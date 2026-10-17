package androidx.compose.material.icons.sharp;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ModeOfTravelKt {
    private static ImageVector _modeOfTravel;

    public static final ImageVector getModeOfTravel(Icons.Sharp sharp) {
        ImageVector imageVector = _modeOfTravel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ModeOfTravel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.31f, 18.9f);
        b.curveToRelative(-0.96f, 1.0f, -2.06f, 2.03f, -3.31f, 3.1f);
        b.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        b.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        b.curveToRelative(4.0f, 0.0f, 7.64f, 2.92f, 7.97f, 7.5f);
        b.lineToRelative(3.53f, 0.0f);
        b.lineTo(19.0f, 14.0f);
        b.lineToRelative(-4.5f, -4.5f);
        b.lineToRelative(3.47f, 0.0f);
        b.curveTo(17.65f, 6.24f, 15.13f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-3.35f, 0.0f, -6.0f, 2.57f, -6.0f, 6.2f);
        b.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        b.curveToRelative(0.64f, -0.59f, 1.23f, -1.16f, 1.77f, -1.71f);
        b.curveToRelative(-0.17f, -0.34f, -0.27f, -0.72f, -0.27f, -1.12f);
        b.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        b.reflectiveCurveTo(17.38f, 19.0f, 16.0f, 19.0f);
        b.curveTo(15.76f, 19.0f, 15.53f, 18.97f, 15.31f, 18.9f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeOfTravel = build;
        build.getClass();
        return build;
    }
}
