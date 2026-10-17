package androidx.compose.material.icons.automirrored.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HelpOutlineKt {
    private static ImageVector _helpOutline;

    public static final ImageVector getHelpOutline(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _helpOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.HelpOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 18.0f, 2.0f, -2.0f, -2.0f);
        r6.l(n, 2.0f, 12.0f, 2.0f);
        n.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        n.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        n.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        n.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        n.close();
        n.moveTo(12.0f, 20.0f);
        n.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        n.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        n.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        n.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        n.close();
        n.moveTo(12.0f, 6.0f);
        n.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        n.horizontalLineToRelative(2.0f);
        n.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        n.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        n.curveToRelative(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f);
        n.horizontalLineToRelative(2.0f);
        n.curveToRelative(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f);
        n.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpOutline = build;
        build.getClass();
        return build;
    }
}
