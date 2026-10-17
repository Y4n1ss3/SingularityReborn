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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CrisisAlertKt {
    private static ImageVector _crisisAlert;

    public static final ImageVector getCrisisAlert(Icons.TwoTone twoTone) {
        ImageVector imageVector = _crisisAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CrisisAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.5f, 2.5f);
        b.curveToRelative(0.0f, 1.5f, -1.5f, 6.0f, -1.5f, 6.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, 0.0f, -1.5f, -4.5f, -1.5f, -6.0f);
        b.curveTo(9.5f, 1.12f, 10.62f, 0.0f, 12.0f, 0.0f);
        b.reflectiveCurveTo(14.5f, 1.12f, 14.5f, 2.5f);
        b.close();
        b.moveTo(12.0f, 10.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f);
        b.close();
        b.moveTo(16.08f, 5.11f);
        b.curveToRelative(0.18f, -0.75f, 0.33f, -1.47f, 0.39f, -2.06f);
        b.curveTo(19.75f, 4.69f, 22.0f, 8.08f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        b.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, -3.92f, 2.25f, -7.31f, 5.53f, -8.95f);
        b.curveTo(7.6f, 3.64f, 7.74f, 4.37f, 7.92f, 5.11f);
        b.curveTo(5.58f, 6.51f, 4.0f, 9.07f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.curveTo(20.0f, 9.07f, 18.42f, 6.51f, 16.08f, 5.11f);
        b.close();
        b.moveTo(18.0f, 12.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        b.curveToRelative(0.0f, -2.0f, 0.98f, -3.77f, 2.48f, -4.86f);
        b.curveToRelative(0.23f, 0.81f, 0.65f, 2.07f, 0.65f, 2.07f);
        b.curveTo(8.43f, 9.93f, 8.0f, 10.92f, 8.0f, 12.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.curveToRelative(0.0f, -1.08f, -0.43f, -2.07f, -1.13f, -2.79f);
        b.curveToRelative(0.0f, 0.0f, 0.41f, -1.22f, 0.65f, -2.07f);
        b.curveTo(17.02f, 8.23f, 18.0f, 10.0f, 18.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crisisAlert = build;
        build.getClass();
        return build;
    }
}
