package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HelpOutlineKt {
    private static ImageVector _helpOutline;

    public static final ImageVector getHelpOutline(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _helpOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.HelpOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
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
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        r6.B(b, 11.0f, 16.0f, 2.0f, 2.0f);
        j50.t(b, -2.0f, 12.61f, 6.04f);
        b.curveToRelative(-2.06f, -0.3f, -3.88f, 0.97f, -4.43f, 2.79f);
        b.curveToRelative(-0.18f, 0.58f, 0.26f, 1.17f, 0.87f, 1.17f);
        b.horizontalLineToRelative(0.2f);
        b.curveToRelative(0.41f, 0.0f, 0.74f, -0.29f, 0.88f, -0.67f);
        b.curveToRelative(0.32f, -0.89f, 1.27f, -1.5f, 2.3f, -1.28f);
        b.curveToRelative(0.95f, 0.2f, 1.65f, 1.13f, 1.57f, 2.1f);
        b.curveToRelative(-0.1f, 1.34f, -1.62f, 1.63f, -2.45f, 2.88f);
        b.curveToRelative(0.0f, 0.01f, -0.01f, 0.01f, -0.01f, 0.02f);
        b.curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.05f);
        b.curveToRelative(-0.09f, 0.15f, -0.18f, 0.32f, -0.25f, 0.5f);
        b.curveToRelative(-0.01f, 0.03f, -0.03f, 0.05f, -0.04f, 0.08f);
        b.curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.02f, 0.07f);
        b.curveToRelative(-0.12f, 0.34f, -0.2f, 0.75f, -0.2f, 1.25f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, -0.42f, 0.11f, -0.77f, 0.28f, -1.07f);
        b.curveToRelative(0.02f, -0.03f, 0.03f, -0.06f, 0.05f, -0.09f);
        b.curveToRelative(0.08f, -0.14f, 0.18f, -0.27f, 0.28f, -0.39f);
        b.curveToRelative(0.01f, -0.01f, 0.02f, -0.03f, 0.03f, -0.04f);
        b.curveToRelative(0.1f, -0.12f, 0.21f, -0.23f, 0.33f, -0.34f);
        b.curveToRelative(0.96f, -0.91f, 2.26f, -1.65f, 1.99f, -3.56f);
        b.curveToRelative(-0.24f, -1.74f, -1.61f, -3.21f, -3.35f, -3.47f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpOutline = build;
        build.getClass();
        return build;
    }
}
