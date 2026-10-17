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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransitEnterexitKt {
    private static ImageVector _transitEnterexit;

    public static final ImageVector getTransitEnterexit(Icons.Rounded rounded) {
        ImageVector imageVector = _transitEnterexit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TransitEnterexit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.5f, 18.0f, 8.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(9.5f);
        d.curveTo(6.0f, 8.67f, 6.67f, 8.0f, 7.5f, 8.0f);
        d.reflectiveCurveTo(9.0f, 8.67f, 9.0f, 9.5f);
        d.verticalLineToRelative(3.27f);
        d.lineTo(14.95f, 7.0f);
        d.curveToRelative(0.57f, -0.55f, 1.48f, -0.54f, 2.04f, 0.02f);
        d.reflectiveCurveToRelative(0.56f, 1.47f, 0.01f, 2.04f);
        d.lineTo(11.15f, 15.0f);
        d.horizontalLineToRelative(3.35f);
        d.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(d, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transitEnterexit = build;
        build.getClass();
        return build;
    }
}
