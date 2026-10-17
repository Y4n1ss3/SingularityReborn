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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlternateEmailKt {
    private static ImageVector _alternateEmail;

    public static final ImageVector getAlternateEmail(Icons.TwoTone twoTone) {
        ImageVector imageVector = _alternateEmail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AlternateEmail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(12.0f, 21.95f, 5.0f, -2.0f, -5.0f);
        n.curveToRelative(-4.34f, 0.0f, -8.0f, -3.66f, -8.0f, -8.0f);
        n.reflectiveCurveToRelative(3.66f, -8.0f, 8.0f, -8.0f);
        n.reflectiveCurveToRelative(8.0f, 3.66f, 8.0f, 8.0f);
        n.verticalLineToRelative(1.43f);
        n.curveToRelative(0.0f, 0.79f, -0.71f, 1.57f, -1.5f, 1.57f);
        n.reflectiveCurveToRelative(-1.5f, -0.78f, -1.5f, -1.57f);
        n.verticalLineToRelative(-1.43f);
        n.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        n.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        n.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        n.curveToRelative(1.38f, 0.0f, 2.64f, -0.56f, 3.54f, -1.47f);
        n.curveToRelative(0.65f, 0.89f, 1.77f, 1.47f, 2.96f, 1.47f);
        n.curveToRelative(1.97f, 0.0f, 3.5f, -1.6f, 3.5f, -3.57f);
        n.verticalLineToRelative(-1.43f);
        n.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        n.reflectiveCurveToRelative(-10.0f, 4.48f, -10.0f, 10.0f);
        n.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        n.close();
        n.moveTo(12.0f, 14.95f);
        n.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        n.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        n.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(n, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 0.9f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alternateEmail = build;
        build.getClass();
        return build;
    }
}
