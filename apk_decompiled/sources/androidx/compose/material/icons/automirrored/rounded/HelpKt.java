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
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HelpKt {
    private static ImageVector _help;

    public static final ImageVector getHelp(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _help;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.Help", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        r6.B(b, 13.0f, 19.0f, -2.0f, -2.0f);
        fc.x(b, 2.0f, 2.0f, 15.07f, 11.25f);
        b.lineToRelative(-0.9f, 0.92f);
        b.curveToRelative(-0.5f, 0.51f, -0.86f, 0.97f, -1.04f, 1.69f);
        b.curveToRelative(-0.08f, 0.32f, -0.13f, 0.68f, -0.13f, 1.14f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineToRelative(-0.5f);
        b.curveToRelative(0.0f, -0.46f, 0.08f, -0.9f, 0.22f, -1.31f);
        b.curveToRelative(0.2f, -0.58f, 0.53f, -1.1f, 0.95f, -1.52f);
        b.lineToRelative(1.24f, -1.26f);
        b.curveToRelative(0.46f, -0.44f, 0.68f, -1.1f, 0.55f, -1.8f);
        b.curveToRelative(-0.13f, -0.72f, -0.69f, -1.33f, -1.39f, -1.53f);
        b.curveToRelative(-1.11f, -0.31f, -2.14f, 0.32f, -2.47f, 1.27f);
        b.curveToRelative(-0.12f, 0.37f, -0.43f, 0.65f, -0.82f, 0.65f);
        b.horizontalLineToRelative(-0.3f);
        b.curveTo(8.4f, 9.0f, 8.0f, 8.44f, 8.16f, 7.88f);
        b.curveToRelative(0.43f, -1.47f, 1.68f, -2.59f, 3.23f, -2.83f);
        b.curveToRelative(1.52f, -0.24f, 2.97f, 0.55f, 3.87f, 1.8f);
        b.curveToRelative(1.18f, 1.63f, 0.83f, 3.38f, -0.19f, 4.4f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _help = build;
        build.getClass();
        return build;
    }
}
